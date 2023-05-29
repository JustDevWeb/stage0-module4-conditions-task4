package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greatest = first > second ? first : second;
        System.out.println(greatest);
    }
}
