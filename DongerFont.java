package dongerfont;

import java.util.Scanner;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class DongerFont
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String phrase = scan.nextLine();
        Scanner input = new Scanner(phrase);
        String word;
        String output = "";
        while (input.hasNext())
        {
            word = input.next();
            DongerText.convert(word);
            output += DongerText.getOutput();
        }
        input.close();
        StringSelection ss = new StringSelection(output);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(ss, null);
        System.out.println("You can now paste your new text!");
    }
}
