// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98; // вес
        double heightM = 1.87; // рост

        int bmi = service.calculate(weightKg, heightM);

        System.out.println("Индекс массы тела: " + bmi);
    }
}


