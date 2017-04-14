package zajecia;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {

        System.out.println(cezarCode("Ala ma kOta i Psa", 3));
        System.out.println(cezarDecode("Rs`cn kvnv cnvncynmd oqydy nvbd", 3));
        System.out.println(cezarCode("Tubep!pxjfd!epxpe{pof!qs{f{!mxb",5));
    }

    public static String cezarCode(String messageToCode, int offset) {
        return cezarCoder(messageToCode, 1);
    }

    public static String cezarDecode(String coddedMessage, int offset) {
        return cezarCoder(coddedMessage, -1);
    }

    private static String cezarCoder(String message, int offset) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] -= offset;
        }
        return new String(charArray);
    }



}
