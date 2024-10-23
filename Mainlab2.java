import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int getIntInput(Scanner scanner, String message) {
        while (true) {
            out.print(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                out.println("Введите число");
                scanner.next();
            }
        }
    }

    private static char getCharInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.next().charAt(0);
            } catch (InputMismatchException e) {
                out.println("Введите символ.");
                scanner.next();
            }
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();

        // Создание объектов класса Person (в maine) Задача 1.2
        out.print("Задача 1.2 \nЧеловек\n");
        Person cleopatra = new Person("Клеопатра", 152);
        Person pushkin = new Person("Пушкин", 167);
        Person vladimir = new Person("Владимир", 189);

        // Вывод на экран
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(vladimir);
        out.print("\n");

        // Задача 1.3
        out.print("Задача 1.3 \nИмена\n");

        Name name1 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name2 = new Name("Маяковский", "Владимир");
        Name name3 = new Name("Клеопатра");

        System.out.println(name1); // Пушкин Александр Сергеевич
        System.out.println(name2); // Маяковский Владимир
        System.out.println(name3); // Клеопатра
        out.print("\n");

        // Задача 2.2
        // Создание объектов человека
        out.print("Задача 2.2 \nЧеловек с именем\n");

        Person person1 = new Person(name1, 167);
        Person person2 = new Person(name2, 189);
        Person person3 = new Person(name3, 152);

        // Вывод информации о людях
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        out.print("\n");

        // Создание городов Задача 3.3
        out.print("Задача 3.3 \nГорода\n");
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Добавление путей между городами с указанной стоимостью
        A.addPath(B, 5);
        A.addPath(D, 6);
        B.addPath(A, 5);
        B.addPath(C, 3);
        B.addPath(F, 1);
        C.addPath(B, 3);
        C.addPath(D, 4);
        D.addPath(C, 4);
        D.addPath(A, 6);
        E.addPath(D, 2);
        E.addPath(F, 2);
        F.addPath(A, 1);
        F.addPath(E, 2);

        // Вывод информации о городах и путях
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        out.print("\n");

        out.print("Задача 5.5 \nДроби\n");

        // Создание нескольких дробей Задача 5.5
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);

        // Примеры операций
        Fraction resultAdd = f1.add(f2);
        Fraction resultSubtract = f1.subtract(f2);
        Fraction resultMultiply = f1.multiply(f2);
        Fraction resultDivide = f1.divide(f2);

        // Выводим примеры
        System.out.println(f1 + " + " + f2 + " = " + resultAdd);
        System.out.println(f1 + " - " + f2 + " = " + resultSubtract);
        System.out.println(f1 + " * " + f2 + " = " + resultMultiply);
        System.out.println(f1 + " / " + f2 + " = " + resultDivide);

        // Комплексная операция: f1.sum(f2).div(f3).minus(5)
        Fraction sum = f1.add(f2);            // (f1 + f2)
        Fraction division = sum.divide(f3);   // (f1 + f2) / f3
        Fraction complexResult = division.subtract(5); // ((f1 + f2) / f3) - 5
        System.out.println("(" + f1 + " + " + f2 + ") / " + f3 + " - 5 = " + complexResult);
    }
}
