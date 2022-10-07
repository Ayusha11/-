import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите в квадратное уравнение ax^2+bx+c=0 коэффиценты");
        Scanner in = new Scanner(System.in);

        System.out.println("a");
        double a = in.nextInt();
        System.out.println("b");
        double b = in.nextInt();
        System.out.println("c");
        double c = in.nextInt();
        in.close();

        double D;
        D = b*b-4*a*c;
        double x1,x2;

        if (D>0) {
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
            System.out.print("\n x1 = "+ x1);
            System.out.print("\n x2 = "+ x2);
        }
        else if(D==0){
            x1=-b/(2*a);
            System.out.print("\n x = "+ x1);
        }
        else if (D<0){
            System.out.print("\n Уравнение не имеет действительных корней");
        }
    }
}