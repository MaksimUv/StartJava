public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int a = - 10;
        int b = 21;
        int c = 0;
        int evenSum = 0;
        int oddSum = 0;
        int i = 0;
        do { 
            c = a + i;
            if (c % 2 == 0) {
                evenSum = evenSum + c;
            } else {
                oddSum = oddSum + c;
            }
            i++;
        } while (c < b);
        System.out.println("В отрезке [" + a + "," + b + "] сумма четных чисел = " + evenSum +
                 " a нечетных = " + oddSum);

        System.out.println("\n2.Вывод чисел между min и max в порядке убывания");
        int x1 = -1;
        int x2 = 10;
        int x3 = 5;
        int max = 0;
        if ((x1 > x2) && (x1 > x3)) {
            max = x1;
        }
        if ((x2 > x1) && (x2 > x3)) {
            max = x2;
        }
        if ((x3 > x1) && (x3 > x2)) {
            max = x3;
        }
        int min = 0;
        if ((x1 < x2) && (x1 < x3)) {
            min = x1;
        }
        if ((x2 < x1) && (x2 < x3)) {
            min = x2;
        }
        if ((x3 < x1) && (x3 < x2)) {
            min = x3;
        }
        for (int j = 10; j >= -1; j--)
            System.out.print(j + ", ");

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + ", ");
            sum = sum + digit;
            number /= 10;
        }
        System.out.println("\nСумма цифр равна = " + sum);

        System.out.println("\n4.Вывод чисел в несколько строк");
        int a1 = 1;
        int b1 = 24;
        for (int k = a1; k < b1; k += 10) {
            System.out.printf("%2d", k);
            if (k < 10) {
                for (int k1 = k + 2; k1 < 10; k1 += 2) {
                    System.out.printf("%3d", k1 < b1 ? k1 : 0);
                }
                System.out.println();
            }
            if (k > 10 && k < 20) {
                for (int k1 = k + 2; k1 < 20; k1 += 2) {
                    System.out.printf("%3d", k1);
                }
                System.out.println();
            } else if (k > 20 && k < 30) {
                for (int k1 = k + 2; k1 < 30; k1 += 2) {
                    System.out.printf("%3d", k1 < b1 ? k1 : 0);
                }
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        int numberX = 3242592;
        System.out.print("В " + numberX);
        int summOfTwo = 0;
        while (numberX > 0) {
            int digitX = numberX % 10;
            if (digitX == 2) {
                summOfTwo = summOfTwo + 1;
            }
            numberX /= 10;
        }
        if (summOfTwo % 2 == 0) {
            System.out.print(" четное");
        } else {
            System.out.print(" нечетное");
        }
        System.out.print(" (" + summOfTwo + ") количество двоек");

        System.out.println("\n\n6.Вывод геометрических фигур");
        for (int i1 = 0; i1 < 5; i1++)
            System.out.println("**********");
        System.out.println("          ");

        int rectangle = 5;
        int i3 = 0;
        int j3 = 0;
        while (i3 < rectangle) {
            System.out.println();
            j3 = i3;
            while (j3 < rectangle) {
                System.out.print("#");
                j3++;
            }
            i3++;
        }
        System.out.println("\n");

        int j5 = 1;
        int i5 = 1;
        do {
            System.out.println();
            for (j5 = i5; j5 <= 1; j5++) {
                System.out.print("$");
            }
            i5--;
        } while (i5 >= 0);
        do {
            System.out.println(" ");
            for (j5 = i5; j5 <= 1; j5++) {
                System.out.print("$");
            }
            i5++;
        } while (i5 <= 2);
        System.out.println("\n");

        System.out.println("\n7.Вывод ASCII - символов");
        int decimalCode = 33;
//int spec = 33;
//char exclamationMark = '!';
        String decimal = "DECIMAL";
        String character = "CHARACTER";
        String description = "DESCRIPTION";
        System.out.printf("%-9s %-11s %-10s %n ", decimal, character, description);
        for (decimalCode = 33; decimalCode >= 33 && decimalCode <= 47; decimalCode += 2)
            System.out.printf(" %-11s %-12s %-15s %n ", decimalCode, (char) decimalCode, Character.getName(decimalCode));
//System.out.printf(Character.getName(decima) + " ");
        for (decimalCode = 98; decimalCode >= 98 && decimalCode <= 122; decimalCode += 2)
            System.out.printf(" %1$-11s %2$-12s %3$-15s %n ", decimalCode, (char) decimalCode, Character.getName(decimalCode));

        System.out.println("\n\n8. Проверка,является ли число палиндромом");
        int numberY = 1234321;
        int numberX8 = 0;
        int numberZ = numberY;
        while (numberZ > 0) {
            numberX8 = numberX8 * 10 + numberZ % 10;
            numberZ = numberZ / 10;
        }
        if (numberY == numberX8) {
            System.out.println("Число " + numberX8 + " - палиндром");
        }

        System.out.println("\n\n9. Проверка, является ли число счастливым");
        int happyNamber = 123321;
        int firstHalf = happyNamber / 1000;
        int secondHalf = happyNamber % 1000;
        int firstHalfCycle = firstHalf;
        int firstHalfSumm = 0;
        int secondHalfCycle = secondHalf;
        int secondHalfSumm = 0;
        while (firstHalfCycle > 0) {
            firstHalfSumm = firstHalfSumm + (firstHalfCycle % 10);
            firstHalfCycle = firstHalfCycle / 10;
        }
        while (secondHalfCycle > 0) {
            secondHalfSumm = secondHalfSumm + (secondHalfCycle % 10);
            secondHalfCycle = secondHalfCycle / 10;
        }
        if (firstHalfSumm == secondHalfSumm) {
            System.out.println("Число " + happyNamber + " - счастливое");
            System.out.println("Сумма цифр " + firstHalf + " = " + firstHalfSumm);
            System.out.println("Сумма цифр " + secondHalf + " = " + secondHalfSumm);
        } else {
            System.out.println("Число " + happyNamber + " - не счастливое число");
        }

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");
        //int i7, j7;
        System.out.println("    ТАБЛИЦА  ПИФАГОРА\n");
        System.out.printf("   |");
        for (int i7 = 1; i7 < 10; i7++) {
            System.out.printf("%2d ", i7);
        }
        System.out.printf("\n---|--------------------------\n");
    //System.out.printf("--------------\n");
        for (int i7 = 1; i7 < 10; i7++) {
            System.out.printf("%2d |", i7);
            for (j7 = 1; j7 < 10; j7++)
                System.out.printf("%2d ", i7 * j7);
            System.out.printf("\n");
        }
    }
}



