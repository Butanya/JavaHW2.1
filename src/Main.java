public class Main {

    public static void main(String[] args) {

        int ticketPrice = 50000;
        int rublesForBonus = 20;

        int totalBonus = (ticketPrice / rublesForBonus);

        System.out.println("Поздравляем, у Вас " + totalBonus + " бонусных миль");

    }
}
