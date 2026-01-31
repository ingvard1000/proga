public class BonusMilesService {
    public int calculate(int price, int Coefficient) {
        int miles = ((price / Coefficient) > 0) ? (price / Coefficient) : 0;
        return miles;
    }
}
