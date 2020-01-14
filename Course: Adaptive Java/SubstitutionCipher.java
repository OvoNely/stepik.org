import java.util.HashMap;
import java.util.Scanner;

public class SubstitutionCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalAlphabet = scanner.nextLine();
        String resultingAlphabet = scanner.nextLine();
        String forEncoding = scanner.nextLine();
        String forDecoding = scanner.nextLine();

        HashMap<Character, Character> encodingMap = new HashMap<>();
        HashMap<Character, Character> decodingMap = new HashMap<>();

        char[] origAlphArr = originalAlphabet.toCharArray();
        char[] resAlphArr =resultingAlphabet.toCharArray();

        for (int i = 0; i < originalAlphabet.length(); i++) {
            encodingMap.put(origAlphArr[i], resAlphArr[i]);
        }

        for (int i = 0; i < originalAlphabet.length(); i++) {
            decodingMap.put(resAlphArr[i], origAlphArr[i]);
        }

        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < forEncoding.length(); i++) {
            encoded.append(encodingMap.get(forEncoding.charAt(i)));
        }

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < forDecoding.length(); i++) {
            decoded.append(decodingMap.get(forDecoding.charAt(i)));
        }

        System.out.println(encoded.toString());
        System.out.println(decoded.toString());

        scanner.close();
    }
}
