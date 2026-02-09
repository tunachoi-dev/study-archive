package cond;

public class Test2 {
    public static void main(String[] args) {
        int price = 60_000;
        int age = 70;
        int deliveryFee = 3_000;

        if (price >= 50_000) {
            deliveryFee -= 2000;
        }

        if (age >= 65) {
            deliveryFee -= 1000;
        }

        System.out.println("최종 배송비: " + deliveryFee);
    }
}
