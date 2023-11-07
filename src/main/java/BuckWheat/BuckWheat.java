package BuckWheat;

public class BuckWheat {
    public static void main(String[] args) {
        int month = 1;
        int kgMonth = 6;
        int costKg = 100;
        int allKgForOneMonth = month * kgMonth;
        System.out.println(allKgForOneMonth);

        int totalPrice = allKgForOneMonth * costKg;

        for (int i = allKgForOneMonth; i > 0; i -= 6) {
            totalPrice = allKgForOneMonth * costKg;

            System.out.println(totalPrice);
        }
    }
}