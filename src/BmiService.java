public class BmiService {
    public double calculate(int weightKg, double heightMetr) {
        double index = weightKg / (heightMetr * heightMetr);
        return (int) index;
    }

}
