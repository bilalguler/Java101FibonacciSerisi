import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int seri = scan.nextInt();

        int a = 0, b = 1, toplam=0;

        for (int i = 1; i < seri; i++) {
            toplam = a + b;
            System.out.println(a + " + " + b + " = " + toplam);
            a = b;
            b = toplam;
        }
    }
}
