public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 10;
        short b = -150;
        int c = 1_000_000;
        long d = -25_000;
        float e = 1.5f;
        double r = 2.125;
        System.out.println("Значение переменной a с типом byte равно " + a );
        System.out.println("Значение переменной b с типом short равно " + b );
        System.out.println("Значение переменной c с типом int равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной e с типом float равно " + e );
        System.out.println("Значение переменной r с типом double равно " + r );
        }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int sumStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int calculatedPaper = paper / sumStudents;
        System.out.println("На каждого ученика рассчитано " + calculatedPaper + " листов бумаги");
    }
}