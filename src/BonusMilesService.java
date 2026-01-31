public class BonusMilesService {
    public int calculate(int price) {
        int miles = ((price / 20) > 0) ? (price / 20) : 0;
        return miles;
    }
}
