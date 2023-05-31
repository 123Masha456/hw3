
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1 ");
        byte a = 100;
        short b = 15000;
        int c = 3500100;
        long d = 51230001;
        float oneTwo = 5.78f;
        double threeFour = 7.123456f;
        System.out.println("Значение переменной с типом byte равно " +  a );
        System.out.println("Значение переменной с типом short равно " + b );
        System.out.println("Значение переменной с типом int равно " + c );
        System.out.println("Значение переменной с типом long равно " + d );
        System.out.println("Значение переменной с типом float равно " + oneTwo );
        System.out.println("Значение переменной с типом double равно " + threeFour );}

    public static void task2() {
        System.out.println("Задача 2 ");
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
    public static void task3() {
        System.out.println("Задача 3 ");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short totalPaper = 480;
        System.out.println("На каждого ученика расчитано " + (totalPaper / (LP + AS + EA)) + " листов бумаги ");}

    public static void task4() {
        System.out.println("Задача 4 ");
        byte number = 16;
        byte time = 2;
        System.out.println("Машина производит за единицу времени (1 минута) " + number / time + " единиц товара (бутылок)");
        byte twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела " + ((number / time) * twentyMinutes) + " штук бутылок" );
        byte hour = 60;
        byte day = 24;
        System.out.println("В одних сутках " + (day * hour ) + " минут");
        short minutesInDay = 1440;
        System.out.println("За " + minutesInDay + " минут (одни сутки) машина произвела " + (minutesInDay * (number / time)) + " штук бутылок");
        System.out.println("В трех сутках " + (minutesInDay * 3) + " минут" );
        System.out.println("За " + (minutesInDay * 3) + " минут (трое суток) машина произвела " + ((minutesInDay * 3) * (number / time)) + " штук бутылок");
        byte mounth = 30;
        System.out.println( "В одном месяце (в среднем) " + mounth + " дней (суток)");
        System.out.println("Следовательно, в одом месяце (в среднем) " + mounth * minutesInDay + " минут");
        System.out.println("Из этого следует, что за " + mounth + " дней (один месяц) машина произвела " + ((minutesInDay * mounth) * (number / time)) + " штук бутылок");}

    public static void task5() {
        System.out.println("Задача 5 ");
        byte totalCans = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        System.out.println("В школе, исходя из условий задачи, " + (totalCans / (whiteCan + brownCan)) + " классов");
        System.out.println("В школе, где " + (totalCans / (whiteCan + brownCan)) + " классов, нужно " + ((totalCans / (whiteCan + brownCan)) * whiteCan) + " банок белой краски и " + ((totalCans / (whiteCan + brownCan)) * brownCan) + " банок коричневый краски." );
    }
    public static void task6() {
        System.out.println("Задача 6 ");
        byte banana = 5;
        byte oneBananaGr = 80;
        short milk = 200;
        byte oneMilkMl = 100;
        byte oneMilkGr = 105;
        byte iceCream = 2;
        short oneIceCreamGr = 100;
        byte egg = 5;
        byte oneEggGr = 70;
        System.out.println("Всего в граммах спортзавтрак составляет " + ((banana * oneBananaGr) + ((milk / oneMilkMl) * oneMilkGr) + (iceCream * oneIceCreamGr) + (egg * oneEggGr)));
        float sportBreakfast = 1160f;
        System.out.println("В одном киллограмме 1000 граммов");
        System.out.println("Следовательно, спортзавтрак в килограммах составляет " + (sportBreakfast / 1000));
    }
    public static void task7() {
        System.out.println("Задача 7 ");
        byte lostKg = 7;
        short kg = 1000;
        System.out.println("В одном килограмме " + kg + " граммов");
        System.out.println("Всего спортсмену надо потерять " + (kg * lostKg) + " граммов");
        short lostGrOne = 250;
        short lostGrTwo = 500;
        System.out.println("С учетом потери " + lostGrOne + " граммов ежедневно, потребуется " + ((kg * lostKg) / lostGrOne) + " дней" );
        System.out.println("С учетом потери " + lostGrTwo + " граммов ежедневно, потребуется " + ((kg * lostKg) / lostGrTwo) + " дней" );
        System.out.println("В среднем теряется " + ((lostGrOne + lostGrTwo) / 2) + " граммов в день" );
        System.out.println("С учетом потери " + ((lostGrOne + lostGrTwo) / 2) + " граммов ежедневно, потребуется " + ((kg * lostKg) / ((lostGrOne + lostGrTwo) / 2)) + " дней" );
    }
    public static void task8() {
        System.out.println("Задача 8 ");
        long Masha = 67760;
        long Denis = 83690;
        long Kristina = 76230;
        System.out.println("При увеличении зарплаты на 10 процентов, Маша теперь получает " + (Masha + ((Masha / 100) * 10)) + " рублей. Годовой доход вырос на " + (((Masha + ((Masha / 100) * 10)) * 12) - (Masha * 12)) + " тысяч рублей.");
        System.out.println("При увеличении зарплаты на 10 процентов, Денис теперь получает " + (Denis + ((Denis / 100) * 10)) + " рублей. Годовой доход вырос на " + (((Denis + ((Denis / 100) * 10)) * 12) - (Denis * 12)) + " тысяч рублей.");
        System.out.println("При увеличении зарплаты на 10 процентов, Кристина теперь получает " + (Kristina + ((Kristina / 100) * 10)) + " рублей. Годовой доход вырос на " + (((Kristina + ((Kristina / 100) * 10)) * 12) - (Kristina * 12)) + " тысяч рублей.");

    }
}