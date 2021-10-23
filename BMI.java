public class BMI {
    public static String calculateBMI(double weight, double height) {
        if (!(0 < weight && weight <= 150) || !(0 < height && height <= 2)) {
            return "Invalid input";
        }
        double bmi = weight / (height * height);
        bmi = (double) Math.round(bmi * 10) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        }
        else if (bmi <= 22.9) {
            return "Bình thường";
        }
        else if (bmi <= 24.9) {
            return "Thừa cân";
        }
        else {
            return "Béo phì";
        }
    }
}
