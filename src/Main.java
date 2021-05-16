public class Main {
    public static void main(String[] args) {
        int priceTicket = 100_050; // в копейках
        int mileBonus = 2_000; // в копейках
        int totalMile = priceTicket / mileBonus;
        System.out.println("totalMile: " + totalMile);
    }

}