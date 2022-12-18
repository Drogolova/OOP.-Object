public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(1988, " ", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");

        maxim.printGreeting();
        anya.printGreeting();
        katya.printGreeting();
        artem.printGreeting();

        Human vladimir = new Human(2001, "Владимир", "Казань", "безработный");

        Flower flower1 = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема", null, 15, 5);
        Flower flower3 = new Flower("Пион", "Англия", 39.9, 1);
        Flower flower4 = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);

        Flower [] bouquet = new Flower[5];
        bouquet[0] = flower1;
        bouquet[1] = flower1;
        bouquet[2] = flower1;
        bouquet[3] = flower4;
        bouquet[4] = flower4;

        Bouquet bouquet1 = new Bouquet(bouquet);
        System.out.println(bouquet1);
    }
}