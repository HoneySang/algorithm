import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        double a = Double.parseDouble(split[0]);
        double b = Double.parseDouble(split[1]);
        System.out.println(a / b);
    }
}
