
// Завдання 1
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        float x = in.nextFloat();
        System.out.print("y=");
        float y = in.nextFloat();
        double out = (1/(x*y))+(1/(x*x+y*y))*(x-y);
        System.out.println("Result=" + out);
        in.close();
    }
}

// Завдання 2
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введіть кількість елементів масиву: ");
//        int n = in.nextInt();
//        int[] array = new int[n];
//        System.out.println("Введіть елементи масиву:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Елемент " + (i + 1) + ": ");
//            array[i] = in.nextInt();
//        }
//
//        System.out.println("Введений масив:");
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        int first = -1;
//        int last = -1;
//
//        for (int i = 0; i < n; i++) {
//            if (array[i] < 0) {
//                if (first == -1) {
//                    first = i;
//                }
//                last = i;
//            }
//        }
//
//        if (first == -1 || last == -1 || first == last) {
//            System.out.println("У масиві немає або тільки один від’ємний елемент");
//        } else {
//            int sum = 0;
//            for (int i = first + 1; i < last; i++) {
//                sum += array[i];
//            }
//
//            System.out.println("Сума елементів між першим і останнім від’ємними елементами: " + sum);
//        }
//    }
//}

// Завдання 3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть розмір матриці: ");
//        int n = scanner.nextInt();
//
//        int[][] A = new int[n][n];
//        int[][] B = new int[n][n];
//
//        System.out.println("Введіть елементи матриці A:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("A[" + i + "][" + j + "]: ");
//                A[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("Введіть елементи матриці B:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("B[" + i + "][" + j + "]: ");
//                B[i][j] = scanner.nextInt();
//            }
//        }
//
//        int[] X = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int negativeA = 0;
//            int negativeB = 0;
//
//            for (int j = 0; j < n; j++) {
//                if (A[i][j] < 0) {
//                    negativeA++;
//                }
//                if (B[i][j] < 0) {
//                    negativeB++;
//                }
//            }
//
//            // Порівнюємо кількість і присвоюємо значення в вектор X
//            if (negativeA == negativeB) {
//                X[i] = 1;
//            } else {
//                X[i] = 0;
//            }
//        }
//
//        System.out.println("Вектор X:");
//        for (int i : X) {
//            System.out.print(i + " ");
//        }
//    }
//}


// Завдання 4
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введіть символ: ");
//        char targetChar = scanner.next().charAt(0);
//        scanner.nextLine();
//
//        System.out.print("Введіть текст текст: ");
//        String text = scanner.nextLine();
//
//        String[] words = text.split("[\\s.,!?;:]+");
//
//        int maxCount = 0;
//        List<String> resultWords = new ArrayList<>();
//
//        // проходжуся по словах
//        for (String word : words) {
//            int count = 0;
//
//            // кількість символів вслові
//            for (char c : word.toCharArray()) {
//                if (c == targetChar) {
//                    count++;
//                }
//            }
//
//            // Якщо поточна кількість більша за максимальну, оновлюємо максимум і очищаємо список
//            if (count > maxCount) {
//                maxCount = count;
//                resultWords.clear();
//                resultWords.add(word);
//            } else if (count == maxCount && count > 0) {
//                // Якщо кількість дорівнює поточному максимуму, додаємо слово до списку
//                resultWords.add(word);
//            }
//        }
//
//        //Виводимо слова, що містять символ максимальну кількість разів
//        if (resultWords.isEmpty()) {
//            System.out.println("Жодне слово не містить символу '" + targetChar + "' більше одного разу.");
//        } else {
//            System.out.println("Слова, що містять символ '" + targetChar + "' максимальна кількість разів (" + maxCount + "):");
//            for (String word : resultWords) {
//                System.out.println(word);
//            }
//        }
//    }
//}


