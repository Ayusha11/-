import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите максимальный множитель!");

        Scanner in = new Scanner(System.in);
        int counter = in.nextInt();
        in.close();

        for (int i=1;i<= counter;i++){          // печатает горизонтальный столбик таблицы
            System.out.print(" ");              // отступ

            double k = Math.ceil(Math.log10(counter*counter))- Math.ceil(Math.log10(i)); // количество отступов (разница между максимальным возможным значением и печатаемым числом)
            for (int t=0; t<=k;t++)
            {
                System.out.print(" ");
            }
            System.out.print (i);
        }

        for (int j=1; j<=counter; j++){        // печатает вертикальный столбик таблицы
            System.out.print ("\n"+j);

            for (int i=1; i<=counter; i++){    // множитель зависящий из горизонтального столбика
                double f = Math.ceil(Math.log10(counter*counter))- Math.ceil(Math.log10(j*i)); // количество необходимых оступов
                if (j*i%10==0 | j*i==1) // проверка произведения столбиков на 1 или кратность 10 (т.к метод логорифма не работает на такие числа)
                {
                    if (j*i==1)
                    {
                        for (int n=0; n<=Math.ceil(Math.log10(counter*counter)); n++)
                        {
                            System.out.print(" ");
                        }
                    }
                    else
                    {
                        int x=j*i;
                        int maxSkip=0;
                        while (x!=0) {
                            x=x/10;
                            maxSkip++;
                        }
                        System.out.print(" "); // отступ
                        double k = Math.ceil(Math.log10(counter*counter))- maxSkip; // необходимое количество отступов для числа кратного 10
                        for (int n=0; n<=k; n++){
                            System.out.print(" ");
                        }
                    }
                }
                else
                {
                    System.out.print(" ");
                    for (int n=0; n<=f; n++){
                        System.out.print(" ");
                    }
                }
                System.out.print (j*i); // печатает произведение столбиков
            }
        }
    }
}