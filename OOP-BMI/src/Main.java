public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete("FranzeG", 1.75, 65);
        BMI bmi = new BMI("", a.weight, a.height);


        System.out.print(bmi.calculateBMI());
    }
}