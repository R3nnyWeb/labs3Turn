package Cipher;

public class App {
    public static void main(String[] args) {
        String text = "Данный текст будет 2 раза зашифрован и дешифрован";
        String key = "Ключ";
        String key2 = "Другой";
        VigenerCipher cipher = new VigenerCipher();
        String encoded = cipher.encode(text, key);
        String encoded2 = cipher.encode(encoded, key2);
        String decoded = cipher.decode(encoded2, key);
        String decoded2 = cipher.decode(decoded, key2);
        System.out.println("Ключ1 = "+key+", ключ2 = "+key2);
        System.out.println("Исходный текст:");
        System.out.println(text);
        System.out.println("После двойного шифрования:");
        System.out.println(encoded2);
        System.out.println("После дешифрации:");
        System.out.println(decoded2);
        System.out.println();

        System.out.println("Получение полного кода шифра:");
        String nonParsedKey = cipher.getNonParsedKey(text, encoded2);
        System.out.println(nonParsedKey);
        System.out.println("Общий ключ:");
        String longKey = cipher.getLongKey(nonParsedKey);
        System.out.println(longKey);
        System.out.println();

        System.out.println("Применение полученного ключа для расшифровки:");
        System.out.println(cipher.decode(encoded2, longKey));
    }
}