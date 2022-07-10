import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Credit service = new Credit();
            int firstYear = service.calculate(1_000_000, 1, 9.99F);
            int secondYear = service.calculate(1_000_000, 2, 9.99F);
            int thirdYear = service.calculate(1_000_000, 3, 9.99F);
        System.out.println("Ежемесячный платёж: " + firstYear);
        System.out.println("Ежемесячный платёж: " + secondYear);
        System.out.println("Ежемесячный платёж: " + thirdYear);
    }
}
