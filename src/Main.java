import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double losuj;
        double zgaduj;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Komputer losuje teraz cyfrę od 0 do 9 ...");

        Random random = new Random();

        losuj = Math.round(10*(random.nextDouble()));

//        System.out.println(losuj);

        System.out.println("Zgadnij ją: ");

        zgaduj = scanner.nextDouble();

        if (losuj == zgaduj){

            System.out.println("Brawo zgadłeś!");
        }else {
            System.out.println("Niestety komputer wylosował cyfrę: " + losuj);
        }
    }
}
