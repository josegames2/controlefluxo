import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
       do {
               System.out.println("digite o priemiro numero");
               n1 = sc.nextInt();

               System.out.println("digite o segundo numero");
               n2 = sc.nextInt();
               if (n1 > n2){
                   System.out.println("o segundo numero dever ser maior que o primeiro");
               }
       }while(n1 < n2);
    }
}
