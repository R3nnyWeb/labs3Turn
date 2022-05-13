//package Cipher;
//
//import java.util.ArrayList;
//
//public class DigitalKey {
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
//            key2.add(new KeyChar(key1.get(i%key1.size()), );
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