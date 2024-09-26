import java.util.*;

public class UserInputDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        /*
         * System.out.println("The First number is:");
         * int a = s.nextInt();
         * System.out.println("The Second number is:");
         * int b = s.nextInt();
         * System.out.println("The Third number is:");
         * int c = s.nextInt();
         * int d = a+b+c;
         * System.out.println("The Sum is :"+ d);
         */
        int n = s.next().indexOf(0);
        System.out.println("Enter the name:");
        String name = s.nextLine();
        System.out.println("Enter your mother name:");
        String name1 = s.nextLine();
        System.out.println("Enter your sister name:");
        String name2 = s.nextLine();
        System.out.println(name.substring(0, 3) + name1.substring(1, 5) + name2.substring(2, 6));
        System.out.println(name1.equals(name2));
        System.out.println(name2.compareTo(name1));
        System.out.println(n);

    }
}