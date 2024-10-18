import static java.lang.System.out;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

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

    // Задание 1
    public int sumLastNumbs(int x) {
        int lastCislo = x % 10;
        int secondLastChislo = (x / 10) % 10;
        return Math.abs(lastCislo + secondLastChislo);
    }

    public boolean isPositive (int x) {
        return x >= 0;
    }

    public boolean isUpperCase (char x) {
        return Character.isUpperCase(x);
    }

    public boolean isDivisor (int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 0;
    }

    public int lastNumbsSum (int a, int b) {
        return Math.abs(a % 10 + b % 10);
    }

    // Задание 2
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0.0;
        }
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public boolean sum3 (int x, int y, int z) {
        if (x + y == z)
            return true;
        else if (x + z == y)
            return true;
        else if (y + z == x)
            return true;
        else return false;
    }

    public String age (int x) {
        int lastChislo = x % 10;
        int lastTwoChislo = x % 100;

        if (lastChislo == 1 && lastTwoChislo != 11) {
            return x + " год";
        } else if ((lastChislo == 2 || lastChislo == 3 || lastChislo == 4) && (lastTwoChislo < 12 || lastTwoChislo > 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public void printDays() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        x = x.toLowerCase();
        switch (x) {
            case "понедельник":
                out.println("Понедельник");
            case "вторник":
                out.println("Вторник");
            case "среда":
                out.println("Среда");
            case "четверг":
                out.println("Четверг");
            case "пятница":
                out.println("Пятница");
            case "суббота":
                out.println("Суббота");
            case "воскресенье":
                out.println("Воскресенье");
                break;
            default:
                out.println("Это не день недели");
                break;
        }
    }

    // Задание 3
    public String reverseListNumbs (int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public int pow (int x, int y) {
        if (y == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        int lastChislo = x % 10;

        while (x > 0) {
            if (x % 10 != lastChislo) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        int NumberRandom = random.nextInt(10);

        int tries = 0;
        Scanner scanner = new Scanner(System.in);
        int userChislo = -1;
        while (userChislo != NumberRandom) {
            System.out.print("Введите число от 0 до 9: ");
            userChislo = scanner.nextInt();
            tries++;

            if (userChislo == NumberRandom) {
                out.println("Вы угадали число");
            } else {
                out.println("Вы не угадали число, попробуйте снова");
            }
        }
        out.println("Количество попыток: " + tries);
    }

    // Задание 4
    public int findLast (int [] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int[] add (int [] arr, int x, int pos) {
        int [] newArr = new int[arr.length + 1];

        for (int i=0; i < pos; i++) {
            newArr[i] = arr [i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr [i];
        }
        return newArr;
    }

    public void reverse (int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int [] concat (int [] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();

        int x = getIntInput(scanner, "Задача 1.2 \nСумма последних двух цифр числа \nВведите желаемое число: ");
        out.println("Сумма последних двух цифр числа = " + methods.sumLastNumbs(x) + "\n");

        x = getIntInput(scanner, "Задача 1.4 \nЯвляется число положительным или отрицательным\nВведите число: ");
        out.println("Если число положительное будет true, если отрицательное false: " + methods.isPositive(x) + "\n");

        out.print("Задача 1.6 \nОпределение заглавной буквы в диапазоне A-Z\nВведите букву: ");
        char character = getCharInput(scanner);
        out.println("Если введена заглавная буква A-Z выведется true, иначе false: " + methods.isUpperCase(character) + "\n");

        int a = getIntInput(scanner, "Задача 1.8 \nОпределение деления нацело\nВведите делимое:");
        int b = getIntInput(scanner, "Введите делитель: ");
        out.println("Есди делится, выводится true, если нет, то false: " + methods.isDivisor(a, b) + "\n");

        a = getIntInput(scanner, "Задача 1.10 \nСумма разряда единиц\nВведите первое число: ");
        b = getIntInput(scanner, "Введите второе число: ");
        a = methods.lastNumbsSum(a, b);
        out.println( "Первое число + второе = " + a);

        b = getIntInput(scanner, "Введите третье число: ");
        a = methods.lastNumbsSum(a, b);
        out.println( "Сумма ед (1-2) + третье = " + a);

        b = getIntInput(scanner, "Введите четвёртое число: ");
        a = methods.lastNumbsSum(a, b);
        out.println( "Сумма ед (1-3) + четвёртое = " + a);

        b = getIntInput(scanner, "Введите пятое число: ");
        a = methods.lastNumbsSum(a, b);
        out.println( "Сумма ед (1-4) + пятое = " + a + "\n");

        x = getIntInput(scanner, "Задача 2.2 \nБезопасное деление\nВведите делимое: ");
        int y = getIntInput(scanner, "Введите делитель: ");
        out.println(methods.safeDiv(x, y) + "\n");

        x = getIntInput(scanner, "Задача 2.4 \nСтрока сравнения\nВведите первое число: ");
        y = getIntInput(scanner, "Введите второе число: ");
        out.println("Сравнение: " + methods.makeDecision(x, y) + "\n");

        x = getIntInput(scanner, "Задача 2.6 \nТройная сумма\nВведите первое число: ");
        y = getIntInput(scanner, "Введите второе число: ");
        int z = getIntInput(scanner, "Введите третье число: ");
        out.println("Если два любых числа можно сложить так, чтобы получить третье, то выводится true, иначе false: " + methods.sum3(x, y, z) + "\n");

        x = getIntInput(scanner, "Задача 2.8 \nОпределение года\nВведите количество лет: ");
        out.println(methods.age(x) + "\n");

        out.print("Задача 2.10 \nДень недели\nВведите день недели: ");
        methods.printDays();

        x = getIntInput(scanner, "Задача 3.2 \nВывод чисел от самого большого до нуля\nВведите число: ");
        out.println(methods.reverseListNumbs(x) + "\n");

        x = getIntInput(scanner, "Задача 3.4 \nВозведение в степень\nВведите число, которое надо возвести в степень: ");
        y = getIntInput(scanner, "Введите степень: ");
        out.println("Число после возведения в степень равно: " + methods.pow(x, y) + "\n");

        x = getIntInput(scanner, "Задача 3.6 \nПроверка всех цифр числа на одинаковость\nВведите число: ");
        out.println("Если все цифры в числе одинаковы, выводится true, иначе false: " + methods.equalNum(x) + "\n");

        x = getIntInput(scanner, "Задача 3.8 \nЛевый треугольник\nВведите из скольки строк вы хотите увидеть прямой треугольник по левому краю: ");
        methods.leftTriangle(x);

        out.print("\nЗадача 3.10 \nУгадай число загаданное компьютером\n");
        methods.guessGame();

        int[] array = new int[6];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        out.println(Arrays.toString(array) + "\n");

        x = getIntInput(scanner, "Задача 4.2 \nПоиск последнего вхождения заданного значения\nВведите проверяемое значение:");
        int index = methods.findLast(array, x);
        out.println("Индекс последнего вхождения " + x + " в массив: " + index + "\n");

        x = getIntInput(scanner, "Задача 4.4 \nДобавление в массив\nВведите добавляемое значение: ");
        int pos = getIntInput(scanner, "Введите позицию, куда вставить ваше значение: ");
        int[] newArr = methods.add(array, x, pos);
        out.println("Новый массив: " + Arrays.toString(newArr) + "\n");

        out.print("Задача 4.6 \nЗапись массива справа налево\n");
        methods.reverse(array);
        out.println("Реверс массива: " + Arrays.toString(array) + "\n");

        out.print("Задача 4.8 \nОбъединение двух массивов\n");
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10) + 1;
        }
        int[] array2 = new int[4];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10) + 1;
        }
        out.println("Массив 1: " + Arrays.toString(array1) + "\nМассив 2: " + Arrays.toString(array2));

        int[] result = methods.concat(array1, array2);
        out.println("Объединенный массив: " + Arrays.toString(result) + "\n");

        out.print("Задача 4.10 \nУдаление отрицательных значений в массиве\n");
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        out.println("Массив с отрицательными значениями: " + Arrays.toString(array));
        result = methods.deleteNegative(array);
        out.println("Массив без отрицательных значений: " + Arrays.toString(result));
    }
}
