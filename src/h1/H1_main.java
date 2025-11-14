package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 60;
        double price = 7;

        price = 2.00;
        switch (zone) {
            case 1:
                price += 0.00;
                break;
            case 2:
                price += 0.35;
                break;
            case 3, 4:
                price += 0.50;
                break;
            case 5:
                price += 0.70;
                break;
            default:
                price = 4;
        }
        System.out.println("Dein Ticket kostet " + price + "€");
    }
}

