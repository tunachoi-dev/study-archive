package cond;

public class Test3 {
    public static void main(String[] args) {
        int dollar = 10;
        int currencyExchange = 0;
        switch(dollar) {
            case 10:
                currencyExchange = 1_400;
                break;
            case 50:
                currencyExchange = 1_420;
                break;
            case 100:
                currencyExchange = 1_450;
                break;
            default:
                currencyExchange = 1_300;
                break;
        }
        int won = dollar * currencyExchange;

        System.out.println("환전 금액은 " + won + "원입니다.");
    }
}
