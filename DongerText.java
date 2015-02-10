package dongerfont;

public class DongerText
{
    private static String output;
    
    public static void convert(String word)
    {
        output = "";
        for (int k = 0; k < word.length(); k++)
        {
            if (word.charAt(k) == 'a' || word.charAt(k) == 'A')
                output += "ᴀ";
            else if (word.charAt(k) == 'b' || word.charAt(k) == 'B')
                output += "в";
            else if (word.charAt(k) == 'c' || word.charAt(k) == 'C')
                output += "ᴄ";
            else if (word.charAt(k) == 'd' || word.charAt(k) == 'D')
                output += "ᴅ";
            else if (word.charAt(k) == 'e' || word.charAt(k) == 'E')
                output += "ᴇ";
            else if (word.charAt(k) == 'f' || word.charAt(k) == 'F')
                output += "ғ";
            else if (word.charAt(k) == 'g' || word.charAt(k) == 'G')
                output += "ɢ";
            else if (word.charAt(k) == 'h' || word.charAt(k) == 'H')
                output += "ʜ";
            else if (word.charAt(k) == 'i' || word.charAt(k) == 'I')
                output += "ɪ";
            else if (word.charAt(k) == 'j' || word.charAt(k) == 'J')
                output += "ᴊ";
            else if (word.charAt(k) == 'k' || word.charAt(k) == 'K')
                output += "к";
            else if (word.charAt(k) == 'l' || word.charAt(k) == 'L')
                output += "ʟ";
            else if (word.charAt(k) == 'm' || word.charAt(k) == 'M')
                output += "ᴍ";
            else if (word.charAt(k) == 'n' || word.charAt(k) == 'N')
                output += "ɴ";
            else if (word.charAt(k) == 'o' || word.charAt(k) == 'O')
                output += "ᴏ";
            else if (word.charAt(k) == 'p' || word.charAt(k) == 'P')
                output += "ᴘ";
            else if (word.charAt(k) == 'q' || word.charAt(k) == 'Q')
                output += "q";
            else if (word.charAt(k) == 'r' || word.charAt(k) == 'R')
                output += "ʀ";
            else if (word.charAt(k) == 's' || word.charAt(k) == 'S')
                output += "s";
            else if (word.charAt(k) == 't' || word.charAt(k) == 'T')
                output += "ᴛ";
            else if (word.charAt(k) == 'u' || word.charAt(k) == 'U')
                output += "ᴜ";
            else if (word.charAt(k) == 'v' || word.charAt(k) == 'V')
                output += "v";
            else if (word.charAt(k) == 'w' || word.charAt(k) == 'W')
                output += "ᴡ";
            else if (word.charAt(k) == 'x' || word.charAt(k) == 'X')
                output += "x";
            else if (word.charAt(k) == 'y' || word.charAt(k) == 'Y')
                output += "ʏ";
            else if (word.charAt(k) == 'z' || word.charAt(k) == 'Z')
                output += "ᴢ";
            else
                output += word.charAt(k);
        }
        output += " ";
    }
    
    public static String getOutput()
    {
        return output;
    }
}
