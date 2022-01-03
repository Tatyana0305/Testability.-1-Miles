public class Main {
    public static void main(String[] args) {
        BonusMilesServic service = new BonusMilesServic();
        int miles1 = service.calculate(10000);
        int amount1 = service.calculate(10000);
        int miles2 = service.calculate(500);
        int amount2 = service.calculate(500);
        int miles3 = service.calculate(3000);
        int amount3 = service.calculate(3000);
        int miles4 = service.calculate(1000);
        int amount4 = service.calculate(1000);
        System.out.println("Сумма покупки составила " + amount1 + " рублей." + " Ваш бонус: " + miles1 + " миль(я)");
        System.out.println("Сумма покупки составила " + amount2 + " рублей." + " Ваш бонус: " + miles2 + " миль(я)");
        System.out.println("Сумма покупки составила " + amount3 + " рублей." + " Ваш бонус: " + miles3 + " миль(я)");
        System.out.println("Сумма покупки составила " + amount4 + " рублей." + " Ваш бонус: " + miles4 + " миль(я)");

    }
}
