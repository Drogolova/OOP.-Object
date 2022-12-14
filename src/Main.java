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
    }
}