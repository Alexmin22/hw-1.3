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

    public static void task1 () {
        System.out.println("Задача 1");
        int pixel = 1000000;
        System.out.println("Значение переменной pixel с типом int равно " + pixel);
        byte cat = 2;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short carGarage = 33;
        System.out.println("Значение переменной carGarage с типом short равно " + carGarage);
        long popPeople = 80000000;
        System.out.println("Значение переменной popPeople с типом long равно " + popPeople);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float keyNumber = 27.12F;
        long bigNumber = 987678965549L;
        double someNumber = 2.786;
        short moreNumber = 569;
        short newShort = -159;
        int againShort = 27897;
        byte notShort = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short firstTeacher = 23;
        short secondTeacher = 27;
        short thirdTeacher =30;
        int totalStudents = firstTeacher + secondTeacher + thirdTeacher;
        short totalPaper = 480;
        int eachStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + eachStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte numBottles = 16;
        byte startTime = 2;
        int oneMinute = numBottles / startTime;
        byte firstCondition = 20;
        int twentyMinuts = oneMinute * firstCondition;
        System.out.println("За 20 минут машина произвела " + twentyMinuts + " штук бутылок");
        short secondCondition = 24 * 60;
        int perDay = oneMinute * secondCondition;
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        short thirdCondition = (24 * 60) * 3;
        int threeDay = oneMinute * thirdCondition;
        System.out.println("За три дня машина произвела " + threeDay + " штук бутылок");
        int fourthCondition = (24 * 60) * 30;
        int fourDays = oneMinute * fourthCondition;
        System.out.println("За месяц машина произвела " + fourDays + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte totalDye = 120;
        byte whiteDye = 2;
        byte brownDye = 4;
        int oneCabinet = whiteDye + brownDye;
        int numClasses = totalDye / oneCabinet;
        int totalWhiteDye = numClasses * whiteDye;
        int totalBrownDye = numClasses * brownDye;
        System.out.println("В школе, где " + numClasses + "  классов, нужно " + totalWhiteDye +
                " банок белой краски и " + totalBrownDye + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        byte bananaPiece = 5;
        byte bananaPieceWheight = 80;
        int bananaGramms = bananaPiece * bananaPieceWheight;

        short milkMl = 200;
        double milkMlWheight = 1.05;
        double milkGramms = milkMl * milkMlWheight;

        byte iceCreame = 2;
        byte iceCreameWheight = 100;
        int iceCreameGramms = iceCreame * iceCreameWheight;

        byte egg = 4;
        byte eggWheight = 70;
        int eggGramms = egg * eggWheight;

        double breakfastGramms = eggGramms + iceCreameGramms + milkGramms + bananaGramms;
        double breakfastKilo = breakfastGramms / 1000;
        System.out.println("Общий вес завтрака  " + breakfastGramms + " граммов, что составляет: " + breakfastKilo + " килограмм.");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte totalLoseWheight = 7;
        short grammInKilo = 1000;
        int totalLoseWheightGramms = totalLoseWheight * grammInKilo;
        short lightLoseGramm = 250;
        short hardLoseGramm = 500;

        int hardTrain = totalLoseWheightGramms / hardLoseGramm;
        System.out.println("Если сбрасывать по " + hardLoseGramm + " грамм ежедневно, вам понадобится: "
                + hardTrain + " дней.");

        int lightTrain = totalLoseWheightGramms / lightLoseGramm;
        System.out.println("Если сбрасывать по " + lightLoseGramm + " грамм ежедневно, вам понадобится: "
                + lightTrain + " дней.");

        float remainder = totalLoseWheightGramms / ((hardLoseGramm + lightLoseGramm) / 2F);
        int average = totalLoseWheightGramms / ((hardLoseGramm + lightLoseGramm) / 2);
        System.out.println("В среднем у вас уйдет " + remainder + " дней тренировок." + " Если округлённо, то "
                + average + " дней тренировок.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int christina =76230;
        byte coefficientPercent = 10;
        float coefficient = coefficientPercent / 100F;
        short year = 12;

        float increasedSalaryMasha = masha + (masha * coefficient);
        float incYearSalaryMasha = increasedSalaryMasha * year;
        int annualIncomeMasha = masha * year;
        float incomeDifferenceMasha = incYearSalaryMasha - annualIncomeMasha;
        System.out.println("Сотрудник Маша теперь получает " + increasedSalaryMasha +
                " рублей в месяц. А в год это: " + incYearSalaryMasha + " рублей. Годовой доход вырос на "
                + incomeDifferenceMasha + " рублей!");

        float increasedSalaryDenis = denis + (denis * coefficient);
        float incYearSalaryDenis = increasedSalaryDenis * year;
        int annualIncomeDenis = denis * year;
        float incomeDifferenceDenis = incYearSalaryDenis - annualIncomeDenis;
        System.out.println("Сотрудник Денис теперь получает " + increasedSalaryDenis +
                " рублей в месяц. А в год это: " + incYearSalaryDenis + " рублей. Годовой доход вырос на "
                + incomeDifferenceDenis + " рублей!");

        float increasedSalaryChristina = christina + (christina * coefficient);
        float incYearSalaryChristina = increasedSalaryChristina * year;
        int annualIncomeChristina = christina * year;
        float incomeDifferenceChristina = incYearSalaryChristina - annualIncomeChristina;
        System.out.println("Сотрудник Кристина теперь получает " + increasedSalaryChristina +
                " рублей в месяц. А в год это: " + incYearSalaryChristina + " рублей. Годовой доход вырос на "
                + incomeDifferenceChristina + " рублей!");

    }
}