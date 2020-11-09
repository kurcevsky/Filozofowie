import java.util.concurrent.Semaphore ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wybierz rozwiazanie z wykladu(1-3):");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(x == 1) {
            System.out.println("Podaj liczbe filozofow:");
            if(Filozof.MAX < 2 || Filozof.MAX > 100)
            {
                System.out.println("Podales liczbe spoza przedziału");
                return;
            }
            for (int i = 0; i < Filozof.MAX; i++) {
                Filozof.widelec[i] = new Semaphore(1);
            }
            for (int i = 0; i < Filozof.MAX; i++) {
                new Filozof(i).start();
            }
        }
        if(x == 2) {
            System.out.println("Podaj liczbe filozofow:");
            if(Filozof2.MAX < 2 || Filozof2.MAX > 100)
            {
                System.out.println("Podales liczbe spoza przedziału");
                return;
            }
            for (int i = 0; i < Filozof2.MAX; i++) {
                Filozof2.widelec[i] = new Semaphore(1);
            }
            for (int i = 0; i < Filozof2.MAX; i++) {
                new Filozof2(i).start();
            }
        }
        if(x == 3) {
            System.out.println("Podaj liczbe filozofow:");
            if(Filozof3.MAX < 2 || Filozof3.MAX > 100)
            {
                System.out.println("Podales liczbe spoza przedziału");
                return;

            }
            for (int i = 0; i < Filozof3.MAX; i++) {
                Filozof3.widelec[i] = new Semaphore(1);
            }
            for (int i = 0; i < Filozof3.MAX; i++) {
                new Filozof3(i).start();
            }
        }
        else {
            System.out.println("Podano zla liczbe, koniec programu");
        }
    }
}



