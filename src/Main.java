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
        System.out.println("Задача 1");
        byte a = 10;
        short b = -150;
        int c = 1_000_000;
        long d = -25_000;
        float e = 1.5f;
        double r = 2.125;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной r с типом double равно " + r);
    }

    public static void task2() {
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int sumStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int calculatedPaper = paper / sumStudents;
        System.out.println("На каждого ученика рассчитано " + calculatedPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte productivity = 16 / 2;
        byte a = 20;
        short day = 60 * 24;   // сутки
        int b = day * 3;       // 3 дня
        int month = day * 30;  // месяц
        int c = productivity * a;
        System.out.println("За 20 минут машина произвела " + c + " штук бутылок");
        int d = day * productivity;
        System.out.println("За сутки машина произвела " + d + " штук бутылок");
        int e = b * productivity;
        System.out.println("За трое суток машина произвела " + e + " штук бутылок");
        int f = month * productivity;
        System.out.println("За месяц машина произвела " + f + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte whitePaint = 2;
        byte brownPaint = 4;
        int sumPaint = whitePaint + brownPaint;
        byte repair = 120;
        int allClass = repair / sumPaint;
        int allWhitePaint = allClass * whitePaint;
        int allBrownPaint = allClass * brownPaint;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        int allBanana = banana * 5;
        byte milk = 105;
        int allMilk = milk * 2;
        byte iceCream = 100;
        int allIceCream = iceCream * 2;
        byte egg = 70;
        int allEgg = egg * 4;
        int breakfast = allIceCream + allBanana + allEgg + allMilk;
        float inKilograms = breakfast / 1000f;
        System.out.println(breakfast + " грамм");
        System.out.println(inKilograms + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short a = 250;
        short b = 500;
        short weight = 7000;
        int oneVersion = weight / a;
        int twoVersion = weight / b;
        System.out.println(oneVersion + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + a + " грамм");
        System.out.println(twoVersion + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + b + " грамм");
        int mean = (twoVersion + oneVersion) / 2;
        System.out.println(mean + " дней в среднем уйдет на похудение");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        float promotionMasha = masha * 1.1f;
        float promotionDenis = denis * 1.1f;
        float promotionKristina = kristina * 1.1f;
        int annualIncomeMasha = masha * 12;
        int annualIncomeDenis = denis * 12;
        int annualIncomeKristina = kristina * 12;
        float promotionAnnualIncomeMasha = promotionMasha * 12;
        float promotionAnnualIncomeDenis = promotionDenis * 12;
        float promotionAnnualIncomeKristina = promotionKristina * 12;
        float differenceMasha = promotionAnnualIncomeMasha - annualIncomeMasha;
        float differenceDenis = promotionAnnualIncomeDenis - annualIncomeDenis;
        float differenceKristina = promotionAnnualIncomeKristina - annualIncomeKristina;
        System.out.println("Маша теперь получает " + promotionMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + promotionDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + promotionKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}