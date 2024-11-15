import java.util.Scanner;

public class git1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eman balore bat");
        int a = sc.nextInt();
        System.out.println("eman beste balore bat");
        int b = sc.nextInt();
        int batuketa = a+b;
        System.out.println(batuketa);
        int kenketa = a-b;
        System.out.println(kenketa);
        int biderketa = a*b;
        System.out.println(biderketa);
        int zatiketa = a/b;
        System.out.println(zatiketa);
        //komentarioakfaktoriala
        double c = sc.nextDouble();
        double erroKarratua = Math.sqrt(c);
        System.out.println(erroKarratua);
        //push kalkulagailua
        System.out.println("Ingresa un número para calcular su factorial:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}
