
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

public class Main {
    public static Human[] humans = new Human[5];
    public static Flower[] flowers = new Flower[4];
    public static Car[] cars = new Car[5] ;
    public static void printHuman(){
        for (Human human : humans) {
                System.out.println(human);
            }

    }
    public static void printFlower(){
        for (Flower flower : flowers) {
            System.out.println(flower);
        }

    }
    public static void printCar(){
        for (Car car : cars) {
            System.out.println(car);
        }

    }




    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача №1.1");
        Human maksim = new Human("Максим", 35, "Минск", "Брэнд-менеджер");
        Human anya = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград", "Продакт-менеджер");
        Human artem = new Human("Артём", 27, "Москва", "Директор по развитию бизнес-систем");
        Human vladimir = new Human("Владимир",21 , "Казань" , "");
        humans[0] = maksim;
        humans[1] = anya;
        humans[2] = katya;
        humans[3] = artem;
        humans[4] = vladimir;
        printHuman();
        katya.setAge(-3) ;
        System.out.println(katya.getAge());

        System.out.println();
        System.out.println("Задача №1.2");
        Flower roza = new Flower ("Роза обыкновенная", "","Голландия", 35.59, 0);
        Flower hrizantema = new Flower ("Хризантема", "","", 15, 5);
        Flower pion = new Flower ("Пион", "","Англия", 69.9, 1);
        Flower gipsofila = new Flower ("Гипсофила", "","Турция", 19.5, 10);
        flowers[0] = roza;
        flowers[1] = hrizantema;
        flowers[2] = pion;
        flowers[3] = gipsofila;
        printFlower();
        calculate(flowers);


        System.out.println();
        System.out.println("Восставшие машины: ");
        Car car1 = new Car("LADA","GRANTA",1.7,"жёлтый",2015,"Россия",
                "АКПП", "седан", "A762КА138",5,"W");
        Car car2 = new Car("AUDI","A8 50L TDI quattro",3.0,"чёрный",2020,
                "Германия","","","",0,"");
        Car car3 = new Car("BMW","Z8",3.0,"чёрный",2021,"Германия",
                "","","",0,"S");
        Car car4= new Car("KIA","SPORTAGE 4",2.4,"красный",2018,
                "Южная Корея","","","",0,"");
        Car car5 = new Car("HYUNDAY","AVANTE",1.6,"оранжевый",2016,
                "Южная Корея","","","",0,"");
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        Key  кey1 = car1.new Key(true,false);
        Insurance insurance1 = car1.new Insurance(2020-03-15, 5000.35, "FS00012345");
        printCar();
        System.out.println(insurance1);

    }
    public static void calculate(Flower[] flowers  )  {
        int lifeSpan = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть: \n";
        for (int i = 0 ; i < flowers.length; i++){
            if (flowers[i] !=null) {
                text += " " + flowers[i].getName() + " " + "из " + flowers[i].getCountry() + " \n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10;
        text += "\n";
        text += "Сумма букета = " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок годности: " + lifeSpan;
        System.out.println(text);

    }
}