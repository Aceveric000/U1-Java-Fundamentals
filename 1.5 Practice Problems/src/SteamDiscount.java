public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double sale = 0.2;
        int game = 60;

        int discount = (int) (game * sale);
        int total = game - discount;

        System.out.println( total );







    }
}
