
import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double a = input.nextDouble();
        System.out.println("Podaj druga liczba: ");
        double b = input.nextDouble();

        System.out.println("Wybierz operator:\n 1-dodawanie,\n 2-odejmowanie,\n 3-mnozenie,\n 4-dzielenie");
        int operator = input.nextInt();
        double result;
        switch (operator) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    break;
                }
            default:
                System.out.println("Wprowadziles zle dane, sprobuj ponownie\n");
                return;
        }

        System.out.println("Wynik: " + result);
        input.close();

    }
}