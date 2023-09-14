import java.util.Scanner;
public class Task4 {
    static void TextTransform()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scan.nextLine();
        String[] words = text.split("\\s+");

        for(int i = 0; i < words.length; i++)
        {
            if(words.length > 1)
            {
                String first_letter = words[i].substring(0, 1);
                String body_word = words[i].substring(1);
                body_word = body_word.replace(first_letter, "");
                words[i] = first_letter + body_word;
            }
        }
        text = String.join(" ", words);

        System.out.println("Змінений текст: " + text);
    }
    public static void main(String[] args)
    {
        TextTransform();
    }
}
