import java.util.Scanner;
public class TestAccounts1 {
    static Scanner scan = new Scanner(System.in);
// lists the names for the accounts
    public static void main(String[] args) {
        String name1, name2, name3;

        System.out.println("Please enter the first name for the first account:");
        name1 = scan.next();
        Account testAcct1 = new Account(100, name1);

        System.out.println("Please enter the second name for the second account:");
        name2 = scan.next();
        Account testAcct2 = new Account(100, name2);

        System.out.println("Please enter the third name for the third account:");
        name3 = scan.next();
        Account testAcct3 = new Account(100, name3);

        System.out.println("\nCreated account:\n" + testAcct1);
        System.out.println("\nCreated account:\n" + testAcct2);
        System.out.println("\nCreated account:\n" + testAcct3);
        
        System.out.println("");
        // Closing sequence//
        testAcct1.close();
        System.out.println("");
        
        Account a1 = new Account(0, "");
        a1 = a1.Consolidate(testAcct2,testAcct3);
        System.out.println("\nCreated new account:\n" + a1);

    }
}