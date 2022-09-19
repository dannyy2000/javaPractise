 package Snacks;
import java.util.Scanner;
public class Nokia_3310Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Nokia_3310 nokia3310 = new Nokia_3310();

        System.out.println("""
                WELCOME TO NOKIA_3310
                press 1 to open menu:
                """);

        int option = input.nextInt();
        if(option == 1){
            nokia3310.mainMenu();
        }

        System.out.println("Press 14 to switch off phone: ");
        option = input.nextInt();
        if(option == 14){
            nokia3310.switchoff();
        }
    }
}
