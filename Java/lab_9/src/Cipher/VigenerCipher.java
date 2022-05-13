package Cipher;

import java.util.ArrayList;

public class VigenerCipher {
    ArrayList<Character> alphabet;

    VigenerCipher(){
        alphabet = new ArrayList<>(75);
        for(char c = 'А'; c<='я'; ++c){
            alphabet.add(c);
        }
        alphabet.add(' ');
        for(char c='0'; c<='9'; ++c){
            alphabet.add(c);
        }
    }

    public String encode(String text, String key)  {
        StringBuilder res = new StringBuilder(text.length());
        for(int i=0; i<text.length(); ++i){
            res.append(getCipherChar(text.charAt(i),key.charAt(i % key.length())));
        }
        return res.toString();
    }

     public String decode(String text, String key)  {
        StringBuilder res = new StringBuilder(text.length());
        for(int i=0; i<text.length(); ++i){
            res.append(getSourceChar(text.charAt(i),key.charAt(i%  key.length())));
        }
        return res.toString();
    }

    private char getCipherChar(char source, char shift){
        return alphabet.get((alphabet.indexOf(source) + alphabet.indexOf(shift)) % alphabet.size());
    }

    private char getSourceChar(char cipher, char shift){
        return alphabet.get((alphabet.indexOf(cipher) - alphabet.indexOf(shift) + alphabet.size()) % alphabet.size());
    }

    public String getNonParsedKey(String text, String encoded){
        StringBuilder res = new StringBuilder(text.length());
        for(int i=0; i<text.length(); ++i){
            res.append(getSourceChar(encoded.charAt(i), text.charAt(i)));
        }
        return res.toString();
    }

    public String getLongKey(String nonParsedKey){
        int keyEndPos, nextKeyPos = 1;
        String key;
        while (true){
            key = nonParsedKey.substring(0, nextKeyPos);
            keyEndPos = nextKeyPos;
            nextKeyPos = nonParsedKey.indexOf(key, keyEndPos);
            if(keyEndPos == nextKeyPos){ //Проверка правильности ключа
                int keyLen = key.length();
                for(int i=0; i<nonParsedKey.length()-keyLen+1; i+=keyLen){
                    String tmp = nonParsedKey.substring(i, i+keyLen);
                    if(!tmp.equals(key)){
                        nextKeyPos++;
                        break;
                    }
                }
                if(keyEndPos == nextKeyPos){
                    break;
                }
            }
            if(nextKeyPos == -1){ //Выполняется, если дано полтора ключа
                String endKey = nonParsedKey.substring(nonParsedKey.length()-1);
                int endLen = nonParsedKey.indexOf(endKey)+1;
                endKey = nonParsedKey.substring(0, endLen);
                int last;
                do {
                    last = nonParsedKey.lastIndexOf(endKey);
                    endKey = nonParsedKey.substring(last-1);
                    endLen = nonParsedKey.indexOf(endKey)+1;
                } while (last != endLen);
                key = nonParsedKey.substring(0, last);
                break;
            }
        }
        return key;
    }
}

















//
// public ArrayList<utils.pairOfKeys> tryGetKeys(String longKey){
//        ArrayList<utils.pairOfKeys> res = new ArrayList<>();
//        int len = longKey.length();
//        for(int i=2; i<len/i; ++i){
//            if(len % i == 0){
//                if(utils.nok(i, len/i) == len){
//                }
//            }
//        }
//        return res;
//    }
//
// public class DigitalKey {
//    private ArrayList<KeyChar> key1;
//    private ArrayList<KeyChar> key2;
//
//    DigitalKey(String longKey, int sizeKey1, int sizeKey2){
//        key1 = new ArrayList<>();
//        key2 = new ArrayList<>();
//        for(int i = 0; i<sizeKey1; ++i){
//            key1.add(new KeyChar());
//        }
//        for(int i = 0; i<sizeKey2; ++i){
//            key2.add(new KeyChar(key1.get(i%sizeKey1), alphabet.indexOf(longKey.charAt(i))));
//        }
//        for(int i = 0; i<sizeKey1; ++i){
//        }
//    }
//
//    class KeyChar{
//        KeyChar link;
//        int baseCode;
//        KeyChar(){}
//
//        KeyChar(KeyChar link, int baseCode){
//            init(link, baseCode);
//        }
//
//        void init(KeyChar link, int baseCode){
//            this.link = link;
//            this.baseCode = baseCode;
//        }
//    }
//}