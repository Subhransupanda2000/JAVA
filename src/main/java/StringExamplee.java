import java.util.Scanner;

public class StringExamplee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        String LastName = sc.nextLine();
        String FullName = FirstName + LastName;
        System.out.println(FullName.length());
        for (int i = 0; i <= FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }
    }
}
