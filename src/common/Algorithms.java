/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author Admin
 */
public class Algorithms {

    public String decToBin(int n) {
        return Integer.toBinaryString(n);
    }

    public String decToHex(int n) {
        return Integer.toHexString(n);
    }

    public int binToDec(String s) {
        return Integer.parseInt(s, 2);
    }

    public String binToHex(String s) {
        return Integer.toHexString(Integer.parseInt(s, 2));
    }

    public int hexToDec(String s) {
        return Integer.parseInt(s, 16);
    }

    public String hexToBin(String s) {
        return Integer.toBinaryString(hexToDec(s));
    }

    public void process(int baseInput, int baseOutput, String value) {
        value = value.replaceAll("\\s+", "");
        if (baseInput == 2 && baseOutput == 10) {
            if (!value.matches("^[01]+$")) {
                System.out.println("Binary input invalid!");
            } else {
                System.out.print("After convert Binary To Decimal: ");
                System.out.println(binToDec(value));
            }
        } else if (baseInput == 2 && baseOutput == 16) {
            if (!value.matches("^[01]+$")) {
                System.out.println("Binary input invalid!");
            } else {
                System.out.print("After convert Binary To Hexadecimal: ");
                System.out.println(binToHex(value));
            }
        } else if (baseInput == 10 && baseOutput == 2) {
            System.out.print("After convert Decimal To Binary: ");
            System.out.println(decToBin(Integer.parseInt(value)));
        } else if (baseInput == 10 && baseOutput == 16) {
            System.out.print("After convert Decimal To Hexadecimal: ");
            System.out.println(decToHex(Integer.parseInt(value)));
        } else if (baseInput == 16 && baseOutput == 2) {
            if (!value.matches("^[0-9A-Fa-f]+$")) {
                System.out.println("Hexadecimal invalid!");
            } else {
                System.out.print("After convert Hexadecimal To Binary: ");
                System.out.println(hexToBin(value));
            }
        } else {
            if (!value.matches("^[0-9A-Fa-f]+$")) {
                System.out.println("Hexadecimal invalid!");
            } else {
                System.out.print("After convert Hexadecimal To Decimal: ");
                System.out.println(hexToDec(value));
            }
        }
    }
}
