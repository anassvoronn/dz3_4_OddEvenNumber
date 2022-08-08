package org.dz.solution;

public class EvenNumberChecker {
    public boolean check(final int number){
        for (int i = 1; i < 10; i++){
            if (i % 2 == 0){
                System.out.println("Even " + i);
            }else {
                System.out.println("Odd " + i);
            }
        }
        return false;
    }
}
