package homework3;
import java.util.Scanner;
public class Bt3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data: ");
        boolean check1 = scanner.hasNextInt();
        boolean check2 = scanner.hasNextDouble();
        System.out.println("Co token khong? " + check2);
    }
}
        