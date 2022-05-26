package Cipher;

public class utils {
    record pairOfKeys(String key1, String key2){ }

    static int nod(int a, int b){
        if(b != 0) {
            return nod(b, a%b);
        }
        else return a;
    }

    static int nok(int a, int b){
        return a*b/nod(a, b);
    }
}