import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberOfCores = 3;
        short hdCapacity = 980;
        int cpuGen = 8145;
        long numberOfUsbPorts = 3;
        float cpuFrequencyMin = 2.10f;
        double cpuFrequencyMax = 2.30;
        char osVersion = '2';
        boolean is64BitOs = true;
        System.out.println(numberOfCores + " - количество ядер процессора");
        System.out.println(hdCapacity + " - емкость жесткого диска");
        System.out.println(cpuGen + " - поколение процессора");
        System.out.println(numberOfUsbPorts + " - количество USB портов");
        System.out.println(cpuFrequencyMin + " - частота процессора минимальная");
        System.out.println(cpuFrequencyMax + " - частота процессора максимальная");
        System.out.println(osVersion + " - версия операционной системы");
        System.out.println(is64BitOs + " - 64-х разрядная система ");

        System.out.println(" \n 2. Расчет стоимости товара со скидкой");
        var penPrice = new BigDecimal("105.5");
        var bookPrice = new BigDecimal("235.83");
        var discount = new BigDecimal("0.11");
        var totaCost = penPrice.add(bookPrice);
        var sumDiscount = totaCost.multiply(discount);
        var discountPrice = totaCost.subtract(sumDiscount);
        System.out.println(String.format("%.2f", totaCost) + " - общая стоимость товаров без скидки");
        System.out.println(String.format("%.2f", sumDiscount) + " - сумма скидки");
        System.out.println(String.format("%.2f", discountPrice) + " - общая стоимость со скидкой ");

        System.out.println(" \n 3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a  a");
        System.out.println(" J  J  aaaaa  v v  aaaaaa");
        System.out.println("  JJ  a     a  v  a      a");

        System.out.println(" \n 4. Вывод min и max значений целых числовых типов");
        byte byteMaxMin = 127;
        System.out.println(byteMaxMin + " - самое большое число byte");
        byteMaxMin++;
        System.out.println(byteMaxMin + " - число после инкремента");
        byteMaxMin--;
        System.out.println(byteMaxMin + " - число после декремента");
        short shortMaxMin = 32767;
        System.out.println(shortMaxMin + " - самое большое число short");
        shortMaxMin++;
        System.out.println(shortMaxMin + " -число после инкремента");
        shortMaxMin--;
        System.out.println(shortMaxMin + " - число после декремента");
        int intMaxMin = 2147483647;
        System.out.println(intMaxMin + " - самое большое число  int");
        intMaxMin++;
        System.out.println(intMaxMin + " - число после инкремента");
        intMaxMin--;
        System.out.println(intMaxMin + " - число после декремента");
        long longMaxMin = 9223372036854775807L;
        System.out.println(longMaxMin + " - самое большое число long");
        longMaxMin++;
        System.out.println(longMaxMin + " - число после инкремента");
        longMaxMin--;
        System.out.println(longMaxMin + " - число после декремента");

        System.out.println(" \n 5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("С помощью третьей переменной");
        System.out.println("a = " + a + ", b = " + b + " - исходные значения переменных");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("a = " + a + ", b = " + b + 
                " - значения переменных после перестановки");
        System.out.println("C помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + ", b = " + b + 
                " - значения переменных после арифметических операций");
        System.out.println("С помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + ", b = " + b + 
                " - значения переменных после побитовых операций");

        System.out.println(" \n 6. Вывод символов и их кодов");
        
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("         " + slash + backslash);
        System.out.println("        " + slash + "  " + backslash);
        System.out.println("       " + slash + underscore + 
                leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println("      " + slash + "      " + backslash);
        System.out.println("     " + slash + underscore + underscore + 
                underscore + underscore + slash + backslash +
                underscore + underscore + backslash);

        System.out.println("\n 8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int productNumber = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит :");
        System.out.println("  сотен = " + hundreds);
        System.out.println("  десятков = " + tens);
        System.out.println("  единиц = " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + productNumber);

        System.out.println(" \n 9. Вывод времени");
        int time = 86399;
        int hh = (time / 60) / 60;
        int mm = (time / 60) % 60;
        int ss = time % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}