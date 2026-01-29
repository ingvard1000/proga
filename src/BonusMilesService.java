public class BonusMilesService {
    public int calculate(int price) {
        int p = price / 20;
        int miles = (p > 0) ? p : 0;
        return miles;
    }
}
