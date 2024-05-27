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
        
        System.out.println(totaCost + " - общая стоимость товаров без скидки");
        System.out.println(sumDiscount + " - сумма скидки");
        System.out.println(discountPrice + " - общая стоимость со скидкой ");

        System.out.println(" \n 3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a  a");
        System.out.println(" J  J  aaaaa  v v  aaaaaa");
        System.out.println("  JJ  a     a  v  a      a");

        System.out.println(" \n 4. Вывод min и max значений целых числовых типов");
        byte byteMaxMin = 127;
        System.out.println(byteMaxMin + " - самое большое число типа byte");
        byteMaxMin++;
        System.out.println(byteMaxMin + " - число после инкремента на единицу");
        byteMaxMin--;
        System.out.println(byteMaxMin + " - число после декремента на единицу");
        short shortMaxMin = 32767;
        System.out.println(shortMaxMin + " - самое большое число типа short");
        shortMaxMin++;
        System.out.println(shortMaxMin + " -число после инкремента на единицу");
        shortMaxMin--;
        System.out.println(shortMaxMin + " - число после декремента на единицу");
        int intMaxMin = 2147483647;
        System.out.println(intMaxMin + " - самое большое число типа int");
        intMaxMin++;
        System.out.println(intMaxMin + " - число после инкремента на единицу");
        intMaxMin--;
        System.out.println(intMaxMin + " - число после декремента на единицу");
        long longMaxMin = 9223372036854775807L;
        System.out.println(longMaxMin + " - самое большое число типа long");
        longMaxMin++;
        System.out.println(longMaxMin + " - число после инкремента на единицу");
        longMaxMin--;
        System.out.println(longMaxMin + " - число после декремента на единицу");

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
        System.out.println((int) '$' + " - " + dollar);
        System.out.println((int) '*' + " - " + asterisk);
        System.out.println((int) '@' + " - " + atSign);
        System.out.println((int) '|' + " - " + verticalBar);
        System.out.println((int) '~' + " - " + tilde);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка");
        char leftSlash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("         " + leftSlash + backSlash);
        System.out.println("        " + leftSlash + "  " + backSlash);
        System.out.println("       " + leftSlash + underscore + 
                leftParenthesis + " " + rightParenthesis + backSlash);
        System.out.println("      " + leftSlash + "      " + backSlash);
        System.out.println("     " + leftSlash + underscore + underscore + 
                underscore + underscore + leftSlash + backSlash +
                underscore + underscore + backSlash);

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