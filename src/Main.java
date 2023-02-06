public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача №1");


        var maksim = new Human("Максим", 35, "Минск", "Брэнд-менеджер");
        var anya = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        var katya = new Human("Катя", 28, "Калининград", "Продакт-менеджер");
        var artem = new Human("Артём", 27, "Москва", "Директор по развитию бизнес-систем");
        var vladimir = new Human("Владимир",21 , "Казань" , "");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        katya.setAge(-3) ;
        System.out.println(katya.getAge());

        System.out.println();
        System.out.println("Задача №2");

        var roza = new Flower ("Роза обыкновенная", "","Голландия", 35.59, 0);
        var hrizantema = new Flower ("Хризантема", "","", 15, 5);
        var pion = new Flower ("Пион", "","Англия", 69.9, 1);
        var gipsofila = new Flower ("Гипсофила", "","Турция", 19.5, 10);

        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);


    }
}