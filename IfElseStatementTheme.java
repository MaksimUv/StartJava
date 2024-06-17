import java.math.BigDecimal;


public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        if (!male) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }
        int age = 25;
        if (age > 18) {
            System.out.println("Вы можете посетить данный раздел");
        } else {
            System.out.println("Раздел для лиц старше 18 лет");
        }
        double height = 1.8;
        if (height < 1.8) {
            System.out.println("У вас средний рост");
        } else {
            System.out.println("У вас высокий рост");
        }
        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("Возможно, вас зовут Максим");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Возможно, вас зовут Ilya");
        } else {
            System.out.println("Да как же вас зовут?\n");
        }

        System.out.println("2. Поиск большего числа");
        int x = 10;
        int y = 10;
        if (x > y) {
            System.out.println("x = " + x + ", y = " + y + ", x > y");
        } else if (x < y) {
            System.out.println("x = " + x + ", y = " + y + ", x < y");
        } else if (x == y) {
            System.out.println("x = " + x + ", y = " + y + ", x = y\n");
        }

        System.out.println("3. Проверка числа");
        int numberVar = -10;
        if (numberVar == 0) {
            System.out.println("Переменная равна нулю");
            System.exit(0);
        }
        if (numberVar < 0) {
            if (numberVar % 2 == 1) {
                System.out.println(+ numberVar + " Является отрицательным и нечетным");
            } else {
                System.out.println(+ numberVar + " Является отрицательным и четным");
            }
        } else if (numberVar > 0) {
            if (numberVar % 2 == 0) {
                System.out.println(+ numberVar + " Является положительным и четным");
            } else {
                System.out.println(+ numberVar + " Является положительным и нечетным");
            }
        }

        System.out.println("\n 4. Поиск одинаковых цифр в числах");
        int q = 169;
        int p = 269;
        int q1 = q / 100;
        int q2 = (q % 100) /10;
        int q3 = q % 10;
        int p1 = p / 100;
        int p2 = (p % 100) / 10;
        int p3 = p % 10;
        if (q1 != q2 & q1 != q3 & q1 != p1 & q1 != p2 & q1 != p3 &
                q2 != q3 & q2 != p1 & q2 != p2 & q2 != p3 & q3 != p1 & 
                q3 != p2 & q3 != p3 & p1 != p2 & p1 != p3 & p2 != p3) {
            System.out.println("Все цифры в разрядах разные");
            System.exit(0); 
        }
        else if (q1 == p1 | q2 == p2 | q3 == p3) {
            System.out.println("Исходные числа : " + q + ", " + p);
            if (q1 == p1 & q2 == p2 & q3 == p3) {
                System.out.println("Одинаковые в них цифры : " + q1 +", " + q2 + ", " + q3);
                System.out.println("Номера разрядов : 1 , 2 , 3");
            }
            if (q1 == p1 & q2 == p2) {
                System.out.println("Одинаковые в них цифры : " + q1 + ", " + q2);
                System.out.println("Номера разрядов : 1 , 2");
            }
            if (q1 == p1 & q3 == p3) {
                System.out.println("Одинаковые в них цифры : " + q1 + ", " + q3);
                System.out.println("Номера разрядов : 1 , 3");
            }
            if (q2 == p2 & q3 == p3) {
                System.out.println("Одинаковые в них цифры : " + q2 + ", " + q3);
                System.out.println("Номера разрядов : 2 , 3");
            }
            if (q3 == p3) {
                System.out.println("Одинаковые в них цифры : " + q3);
                System.out.println("Номер разряда : 3");
            }
            if (q2 == p2) {
                System.out.println("Одинаковые в них цифры : " + q2);
                System.out.println("Номер разряда : 2");
            }
            if (q1 == p1) {
                System.out.println("Одинаковые в них цифры : " + q1);
                System.out.println("Номер разряда : 1");
            }
        } else {
            System.out.println("Одинаковых цифр, стоящих в одном и том же разряде нет");
        }

        System.out.println("\n 5. Определение символа по его коду");
        char simbol1 = '\u0057';
        char simbol2 = '\u0058';
        char simbol3 = '\u0031';
        System.out.println("" + simbol1);
        System.out.println("" + simbol2);
        System.out.println("" + simbol3);
        System.out.println((int) simbol3 + " - " + simbol3);
        if ((int)simbol3 >= 65 & (int)simbol3 <= 90) {
            System.out.println("Это заглавная буква");
        }
        else if ((int)simbol3 >= 97 & (int)simbol3 <= 122) {
            System.out.println("Это строчная буква");
        }
        else if ((int)simbol3 >= 48 & (int)simbol3 <= 57) {
            System.out.println("Это цифра");
        } else {
        System.out.println("Это другой символ");
    }

    System.out.println("\n 6. Подсчет начисленных банком %");
    var contribution = new BigDecimal("321123.59");
    var rate = new BigDecimal("0.05");
    var b1 = new BigDecimal("100000");
    var b2 = new BigDecimal("300000");
    if (contribution.compareTo(b1) == -1) {
        rate = new BigDecimal("0.05");
    }
    else if ((contribution.compareTo(b1) == 0) & (contribution.compareTo(b2) == -1)) {
        rate = new BigDecimal("0.07");
    }
    else {
        rate = new BigDecimal("0.1");
    }
    System.out.println("Сумма вклада = " + contribution);
    var sumRate = rate.multiply(contribution);
    System.out.println(String.format("Сумма начисленного процента - %.2f" , sumRate));
    var totalSum = contribution.add(sumRate);
    System.out.println(String.format("Итоговая сумма с процентами - %.2f" , totalSum));

    System.out.println("\n 7. Определение оценки по предметам");
    double hystory = 0.59;
    double programm = 0.92;
    double hystoryMark = 1;
    double programmMark = 1;
    if (hystory <= 0.6) {
        hystoryMark = 2;
    }
    else if (hystory > 0.6 & hystory <= 0.73) {
        hystoryMark = 3;
    }
    else if (hystory > 0.73 & hystory <= 0.91) {
        hystoryMark = 4;
    }
    else if (hystory > 0.91) {
        hystoryMark = 5;
    }
    System.out.println(String.format("История - %.0f" , hystoryMark));
    if (programm <= 0.6) {
        programmMark = 2;
    }
    else if (programm > 0.6 & programm <= 0.73) {
        programmMark = 3;
    }
    else if (programm > 0.73 & programm <= 0.91) {
        programmMark = 4;
    }
    else if (programm > 0.91) {
        programmMark = 5;
    }
    System.out.println(String.format("Программирование - %.0f" , programmMark));
    double GPA = (hystoryMark + programmMark) / 2;
    System.out.println("Средний балл оценок по предметам - " + GPA);
    double averagePercent = (hystory + programm) / 2;
    System.out.println(String.format("Средний процент по предметам - %.2f" , averagePercent));

    System.out.println("\n 8. Расчет годовой прибыли");
    var productSale = new BigDecimal("13025.233");
    var rentCost = new BigDecimal("5123.018");
    var costPrice = new BigDecimal("9001.729");
    var months = new BigDecimal ("12");
    var zeroProfit = new BigDecimal("0");
    var annualProfit = productSale.subtract(rentCost).subtract(costPrice).multiply(months);
    if (annualProfit.compareTo(zeroProfit) == 1) {
        System.out.println(String.format("Прибыль за год : +%.2f", annualProfit));
    }
    else if (annualProfit.compareTo(zeroProfit) == 0) {
        System.out.println("Прибыль за год : " + annualProfit);
    }
    else {
        System.out.println(String.format("Прибыль за год : %.2f", annualProfit));
    }
    }
}
