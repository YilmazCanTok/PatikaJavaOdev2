
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.print("Bir Sayı Giriniz : ");
        int number = scanner.nextInt();
        for (int i = 1, j = 0; i <= number; i=i*4,j++) {
            System.out.println("4'ün Kuvveti : ");
            System.out.println("4'ün "+j+". Kuvveti : "+i);
        }
        for (int i = 1, j = 0; i <= number; i=i*5,j++) {
            System.out.println("5'ün Kuvveti : ");
            System.out.println("5'ün "+j+". Kuvveti : "+i);
        }
        System.out.println("****************************************************");
    }
}
