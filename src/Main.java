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
        System.out.println("Задача1");
        int a=1000000;
        byte b=100;
        short c=10;
        long d=1000000000;
        float e=(float)-2.5;
        double f=1.5f;
        System.out.println("Значение переменной a с типом int равно  "+a);
        System.out.println("Значение переменной b с типом byte равно  "+b);
        System.out.println("Значение переменной c с типом short равно  "+c);
        System.out.println("Значение переменной d с типом long равно  "+d);
        System.out.println("Значение переменной e с типом float равно  "+e);
        System.out.println("Значение переменной f с типом double равно  "+f);
    }
    public static void task2() {
        System.out.println("Задача2");
        float a=27.12f;
        long b=987678965549L;
        float c=2.786f;
        int d=569;
        int e=-159;
        short f=27897;
        byte g=67;
        System.out.println("* "+a+" float");
        System.out.println("* "+b+"  long");
        System.out.println("* "+c+"  float");
        System.out.println("* "+d+"  int");
        System.out.println("* "+e+"  int");
        System.out.println("* "+f+"  short");
        System.out.println("* "+g+"  byte");
    }   public static void task3() {
        System.out.println("Задача3");
        byte ludmilaPavlovna=23;
        byte annaSergeevna=27;
        byte ekaterinaAndreevna=30;
        int student=(ludmilaPavlovna+ekaterinaAndreevna+annaSergeevna);
        short paper=480;
        int papaerForStudent=(paper/student);
        System.out.println("на каждого ученика рассчитано "+papaerForStudent+" листов бумаги");
    }   public static void task4() {
        System.out.println("Задача4");
        byte bottleMin=8;
        int bottleHour=(bottleMin*60);
        System.out.println("За 20 минут машина произвела "+bottleHour/3+" штук бутылок");
        System.out.println("За 1 сутки машина произвела "+bottleHour*24+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottleHour*24*3+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+bottleHour*24*30+" штук бутылок");


    }   public static void task5() {
        System.out.println("Задача5");
        byte jar=120;
        byte wJar=2;
        byte bwJar=4;
        int jarForOneRoom=(wJar+bwJar);
        int  classRoom=(jar/jarForOneRoom);
        System.out.println("В школе где "+classRoom+" классов, нужно "+wJar*classRoom+" банок белой краски и "+bwJar*classRoom+" банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задача6");
        byte banana=80;
        byte milk=105;
        int iceCream=100;
        byte egg=70;
        int breakfastGr=(banana*5)+(milk*2)+(iceCream*2)+(egg*4);
        float breakfastKg=breakfastGr/1000F;
        System.out.println("общий вес завтрака составит "+breakfastGr+" грамм или "+breakfastKg+" кг");
    }
    public static void task7() {
        System.out.println("Задача7");
        byte target=7;
        float bigLoss=0.5F;
        float smLoss=0.25F;
        float fastTarget=(target/bigLoss);
        float longTarget=(target/smLoss);
        System.out.println("если спортсмен будет терять 500 грамм веса в день," +
                " то для того чтоб сбросить 7 кг, ему потребуется "+fastTarget+" дней.");
        System.out.println("Если спортсмен будет терять 250 грамм веса в день, " +
                "то для того чтоб сбросить 7 кг, ему потребуется "+longTarget+" дней.");


    }
    public static void task8() {
        System.out.println("Задача8");
        int masha=67765;
        int denis=83690;
        int kristina=76230;

        float inc1=(masha+(float)masha/10);
        float inc2=(denis+(float)denis/10);
        float inc3=(kristina+(float)kristina/10);
        float mashaYear=(inc1-masha)*12;
        float denisYesr=(inc2-denis)*12;
        float kristinaYear=(inc3-kristina)*12;


        System.out.println("Маша теперь получает "+inc1+" Годовой доход вырос на "+mashaYear+" руб");
        System.out.println("Денис теперь получает "+inc2+" Годовой доход вырос на "+denisYesr+" руб");
        System.out.println("Кристина теперь получает "+inc3+" Годовой доход вырос на "+kristinaYear+" руб");


    }
}