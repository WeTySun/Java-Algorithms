import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
        int n = m/10;
        m = m % 10;
        n += m/5;
        m = m % 5;
        n += m;
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}