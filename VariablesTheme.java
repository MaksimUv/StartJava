import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberOfCores = 3;
        short hdCapacity = 980;
        int processorGeneration = 8145;
        long numberOfUsbPorts = 3;
        float processorFrequencyMin = 2.10f;
        double processorFrequencyMax = 2.30;
        char osVersion = '2';
        boolean is64BitOs = true;
        System.out.println(numberOfCores + " - количество ядер процессора");
        System.out.println(hdCapacity + " - емкость жесткого диска");
        System.out.println(processorGeneration + " - поколение процессора");
        System.out.println(numberOfUsbPorts + " - количество USB портов");
        System.out.println(processorFrequencyMin + " - частота процессора минимальная");
        System.out.println(processorFrequencyMax + " - частота процессора максимальная");
        System.out.println(osVersion + " - версия операционной сиситемы");
        System.out.println(is64BitOs + " - 64-х разрядная система \n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        var pen = new BigDecimal("105.5");
        var book = new BigDecimal("235.83");
        var costPenBook = pen.add(book);
        var penBookDiscount = new BigDecimal("0.89");
        var discount = costPenBook.multiply(penBookDiscount);
        
        System.out.println(costPenBook + " - общая стоимость товаров без скидки");
        System.out.println(costPenBook.subtract(discount) + " - сумма скидки");
        System.out.println(discount + " - общая стоимость со скидкой \n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a  a");
        System.out.println(" J  J  aaaaa  v v  aaaaaa");
        System.out.println("  JJ  a     a  v  a      a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte threeDigitNumber = 127;
        short fiveDigitNumcer = 32767;
        int tenDigitNumber = 2147483647;
        long nineteenDigitNumber = 9223372036854775807L;
        System.out.println(threeDigitNumber + " - самое большое число тиапа byte");
        threeDigitNumber++;
        System.out.println(threeDigitNumber + " - число после инкремента на единицу");
        threeDigitNumber--;
        threeDigitNumber--;
        System.out.println(threeDigitNumber + " - число после декремента на единицу\n");
        System.out.println(fiveDigitNumcer + " - самое большое число типа short");
        fiveDigitNumcer++;
        System.out.println(fiveDigitNumcer + " -число после инкремента на единицу");
        fiveDigitNumcer--;
        fiveDigitNumcer--;
        System.out.println(fiveDigitNumcer + " - число после декремента на единицу\n");
        System.out.println(tenDigitNumber + " - самое большое число типа int");
        tenDigitNumber++;
        System.out.println(tenDigitNumber + " - число после инкремента на единицу");
        tenDigitNumber--;
        tenDigitNumber--;
        System.out.println(tenDigitNumber + " - число после декремента на единицу\n");
        System.out.println(nineteenDigitNumber + " - самое большое число типа long");
        nineteenDigitNumber++;
        System.out.println(nineteenDigitNumber + " - число после инкремента на единицу");
        nineteenDigitNumber--;
        nineteenDigitNumber--;
        System.out.println(nineteenDigitNumber + " - число после декремента на единицу\n");

        System.out.println("5. Перестановка значений переменных");
        int two = 2;
        int five = 5;
        int variable;
        System.out.println("С помощью третьей переменной");
        System.out.println("two = " + two + ", five = " + five + " - исходные значения переменных");
        variable = two;
        two = five;
        five = variable;
        System.out.println("two = " + two + ", five = " + five + 
                " - значения переменных после перестановки\n");
        System.out.println("C помощью арифметических операций");
        two = two - 3;
        five = five + 3;
        System.out.println("two = " + two + ", five = " + five + 
                " - значения переменных после арифметических операций\n");
        System.out.println("С помощью побитовой операции ^");
        int seven = 7;
        two = two ^ seven;
        five = five ^ seven;
        System.out.println("two = " + two + ", five = " + five + 
                " - значения переменных после побитовых операций\n");

        System.out.println("6. Вывод символов и их кодов");
        int dollar = 36;
        char dollarChar = (char) dollar;
        int asterisk = 42;
        char asteriskChar = (char) asterisk;
        int atSign = 64;
        char atSignChar = (char) atSign; 
        int verticalBar = 124;
        char verticalBarChar = (char) verticalBar;
        int tilde = 126;
        char tildeChar = (char) tilde;
        System.out.println(dollar + "\n" + dollarChar);
        System.out.println(asterisk + "\n" + asteriskChar);
        System.out.println(atSign + "\n" + atSignChar);
        System.out.println(verticalBar + "\n" + verticalBarChar);
        System.out.println(tilde + "\n" + tildeChar);
        System.out.println();
       
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char leftSlash = '/';
        int rightSlashInt = 92;
        char rightSlashChar = (char) rightSlashInt;
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("         " + leftSlash + "" + rightSlashChar);
        System.out.println("        " + leftSlash + "  " + rightSlashChar);
        System.out.println("       " + leftSlash + "" + underscore + "" + leftParenthesis + 
                " " + rightParenthesis + "" + rightSlashChar);
        System.out.println("      " + leftSlash + "      " + rightSlashChar);
        System.out.println("     " + leftSlash + "" + underscore + "" + underscore + "" + 
                underscore + "" + underscore + "" + leftSlash + "" + rightSlashChar + "" + 
                underscore + "" + underscore + "" + rightSlashChar);
        System.out.println();

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 120;
        int sumNumber = hundreds + tens + units;
        int productNumber = hundreds * tens * units;
        System.out.println("Число 123 содержит :");
        System.out.println("сотен = " + hundreds);
        System.out.println("десятков = " + tens);
        System.out.println("единиц = " + units);
        System.out.println("Сумма его цифр = " + sumNumber);
        System.out.println("Произведение = " + productNumber);

        System.out.println();
        System.out.println("9. Вывод времени");
        int time = 86399;
        int timeHours = (time / 60) / 60;
        int timeMinutes = (time / 60) % (timeHours * 60);
        int timeSec = 86399 % 60;
        System.out.println(timeHours + ":" + timeMinutes + ":" + timeSec);
    }
}