import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k ;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        k = input.nextInt();

        int i = 1;
        while (i<=k){
            i++;
            if(i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}


