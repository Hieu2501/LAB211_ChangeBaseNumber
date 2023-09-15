/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import common.Algorithms;
import common.Library;
import view.Menu;

/**
 *
 * @author ACER
 */
public class ChangeBaseNumber extends Menu<String> {

    static String[] mc = {
        "Perform follow steps below:\n" +
        "   - Choose the base number input (Binary, Decimal, Hexadecimal)\n" +
        "   - Choose the base number out (Binary, Decimal, Hexadecimal)\n" +
        "   - Enter the input value\n" +
        "   - Process and print output value",
        "Exit",
    };

    protected Library library;
    protected Algorithms algorithm;

    public ChangeBaseNumber() {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                int baseInput = library.getBase("Choose the base number input (2 is binary, 10 is decimal, 16 is hexadecimal): ");
                int baseOutput = library.getBase("Choose the base number output (2 is binary, 10 is decimal, 16 is hexadecimal): ");
                String value = library.getString("Enter value follow base input to convert: ");
                algorithm.process(baseInput, baseOutput, value);
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
