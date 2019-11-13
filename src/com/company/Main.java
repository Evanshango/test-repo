package com.company;

public class Main {

    public static void main(String[] args) {

//        forLoop();
//        iterateWhileLoop();
        whileLoop();

        outputGoats();
    }

    private static void outputGoats() {
        int sheep = 50;
        int goats = 20;

        int x = 0;

        while (x <= sheep){
            if ((x%5) == 0){
                goats = goats - 2;
            } else if (goats == 0){
                System.out.println("Can't reduce goats past this point");
            } else {
                System.out.println("Number of goats " + goats);
            }
            x++;
        }
    }

    private static void whileLoop() {
        System.out.println("running while loop");
        int i = 10;
        while (i < 20) {
            System.out.println("the value of i is " + i);
            i++;
        }
    }

    private static void forLoop() {
        System.out.println("executing a for loop");

        for (int x = 2; x <= 30; x += 2) {
            System.out.println("the value of x is " + x);
        }
    }

    private static void iterateWhileLoop() {
        System.out.println("Iterating while loop called");
        int[] x = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int limit = x.length;
        int i = 0;
        while (i < limit) {
            System.out.println("value " + x[i]);
            i++;
        }
    }

    /**
     * a while statement with an if inside
     * 1. variable sheep = sheep
     * 2. variable goats = goats
     * 3. Total no of sheep = 50
     * 4. Total no of goats = 20
     * 5. check if no of sheep is even, increment no of goats by 1
     * 6. output no of goats
     */

}
