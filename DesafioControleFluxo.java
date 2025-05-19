import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o priemiro numero");
        int n1 = sc.nextInt();

        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();

        try {
            contar(n1,n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        sc.close();
    }
        static class ParametrosInvalidosException extends Exception {}

        public static void contar(int n1, int n2) throws ParametrosInvalidosException{
           if(n1 > n2){
                throw new ParametrosInvalidosException();
           }
            int contagem = n2 - n1;
            for (int i = 0 ;i < contagem; i++){
                System.out.println(i);
            }
        }

}
