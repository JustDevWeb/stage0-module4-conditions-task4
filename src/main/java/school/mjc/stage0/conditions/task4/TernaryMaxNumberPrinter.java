package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

    int result = (first > second && first > third || ((first == second || first == third ) && (first > second || first > third))) ? first : (second > first && second > third || (second == third && second > first)) ? second : (third > first && third > second) ? third : 0;

    System.out.println(result);
    }
}
