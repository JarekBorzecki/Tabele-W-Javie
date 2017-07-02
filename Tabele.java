package Practice_3;

/**
 * Created by jarek on 02.07.2017.
 */
public class Tabele {

    public static void main(String[] args) {

        int[] table = {6, 4, 10, 48, 6, 4, 9};

        System.out.println("Suma wszystkich elementów tabeli wynosi: " + sum(table));
        System.out.println("Elementy tabeli zamienione na Stringi: " + makeString(table));

        int[] nTable = addN(table, 5);
        System.out.println("Nowa tabelka po dodaniu liczby do każdeo elementu: " + makeString(nTable));

        int[] reverseTable = reverse(table);
        System.out.println("Odwrócona tabela: " + makeString(reverseTable));

        System.out.println("Czy podana liczba znajduje się w tabelce? " + hasN(table, 8));

        System.out.println("Tabelka z zamienionymi niektórymi wartościami:");
        replaceAll(table, 4, 456);
    }

    // Metoda sumuje wszystkie elementy tabeli
    public static int sum(int[] arr) {
        int sumUp = 0;

        for (int number : arr) {
            sumUp = sumUp + number;
        }

        return sumUp;
    }

    // Metoda zamienia elementy tabeli na Stringi
    public static String makeString(int[] arr) {
        String stringElements = "";

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            stringElements = stringElements + Integer.toString(element) + ", ";
        }

        return stringElements;
    }

    // Metoda dodaje do każdego elementu tabeli wartość "n"
    public static int[] addN(int[] arr, int n) {
        int[] nArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int nextValue = arr[i] + n;
            nArray[i] = nextValue;
        }

        return nArray;
    }

    // Metoda odwraca kolejność elementów tabeli
    public static int[] reverse(int[] arr) {
        int[] reverseTable = new int[arr.length];
        int counter = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseTable[counter] = arr[i];
            counter++;
        }

        return reverseTable;
    }

    // Metoda sprawdza, czy dana liczba znajduje się w tabeli
    public static boolean hasN(int[] arr, int n) {
        for (int number : arr) {
            if (number == n) {
                return true;
            }
        }
        return false;
    }

    // Metoda zamienia dany element tabeli na inną wartość
    public static void replaceAll(int[] arr, int old, int another) {
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];

            if (number == old) {
                arr[i] = another;
            }

            System.out.print(arr[i] + ", ");
        }
    }
}
