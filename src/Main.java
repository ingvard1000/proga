public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int Coefficient = 20;  // количество потраченных рублей для начисления 1 бонусной мили
        int miles = service.calculate(price, Coefficient);
        System.out.println(miles);
    }
}