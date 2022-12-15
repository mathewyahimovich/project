import java.io.File;
import java.util.Scanner;

public class Cookie_Template {
    String name;
    int amount;

    public static void bake(){
        Cookie_Template cookie = new Cookie_Template();

        System.out.println("Какое печенье ты хочешь?");
        Scanner name_scanner = new Scanner(System.in);
        String name = name_scanner.nextLine().trim();
        cookie.name = name;

        System.out.println("Сколько?");
        Scanner amount_scanner = new Scanner(System.in);
        int amount = amount_scanner.nextInt();
        cookie.amount = amount;

        Scanner path = new Scanner("path.txt");
        String result = null;
        while(path.hasNextLine()){
            result = path.nextLine().trim();
        }

    }
}
