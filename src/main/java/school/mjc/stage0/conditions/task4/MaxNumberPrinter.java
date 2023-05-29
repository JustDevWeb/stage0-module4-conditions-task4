package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {


       if (first > second && first > third || ((first == second || first == third ) && (first > second || first > third) )) {
            System.out.println(first);
        } else {
           if (second > first && second > third || (second == third && second > first)) {
               System.out.println(second);
           } else {
               if (third > first && third > second) {
                   System.out.println(third);
               }
           }
       }
    }
}
