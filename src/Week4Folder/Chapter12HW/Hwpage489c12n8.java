package Week4Folder.Chapter12HW;

import java.util.Scanner;

/**
 *
 * @author Administrator Gabe - Solution ProfPhilips
 * 
 */
public class Hwpage489c12n8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();
        try {
            System.out.println("The decimal value is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException e) {
            e.printStackTrace();
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            throw new HexFormatException();
        }
    }
}

class HexFormatException extends Exception {

    public HexFormatException() {
        super("Invalid hex number");
    }
}
