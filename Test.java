import java.util.Scanner;

public class Test {

    static int a = 10
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int b = 5;
//        b = sc.nextInt();
//        float f = sc.nextFloat();
//        double d = sc.nextDouble();
//        byte h = sc.nextByte();
//        short s = sc.nextShort();
//        long l = sc.nextLong();
//        char c = sc.next().charAt(0);
//         boolean t = sc.nextBoolean();
        System.out.println("Введите Ваш пол:");
        char gender = sc.next().charAt(0);
        System.out.println("Ваш пол: " + gender);

        System.out.println( "Add your Car:" );
        short car = sc.nextShort();
        System.out.println("Your car" + car);

        System.out.println("Введите возраст: ");
        byte age = sc.nextByte();
        System.out.println("Ваш возраст: " + age);

        System.out.println("Введите дату рождения: ");
        String str = sc.next();
        System.out.println("Дата рождения: "+str);

        System.out.println("Add surname" );
        System str = sc.nextBoolean();
        System.out.println("Your surname :"+ surname);



        System.out.println("Введите вес:");
        float weight = sc.nextFloat();
        System.out.println("Введите имя: ");

        String name = sc.next();
        System.out.println("|-----------|------------|---------|------------|---------|");
        System.out.println("|---Имя-----|----Вес-----|-Возраст-|--surname---|---car---|);
        System.out.println("|-" +name+"-|---" + weight + "-----|---" + age + "----|"|---" + surname + "-----|---" + car + "-----|);
        System.out.println("|-----------|------------|---------|------------|---------|");

        System.out.println("Таблица созданная форматированием: ");

        System.out.println("|-----------|-------|---------|---------|");
        System.out.println("|---Имя-----|--Вес--|-Возраст-|--surname--|---car---|");
        System.out.printf("|%11s| %6.2f| %8d|\n", name, weight, age, surname, car);
        System.out.println("|-----------|-------|---------|-------|-------|");



    }

    public void out(){

    }
}