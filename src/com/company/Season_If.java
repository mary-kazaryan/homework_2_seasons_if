package com.company;

public class Season_If {

    public static void main(String[] args) {

	// Написать программу для вывода названия поры года по номеру месяца.
    // При решении используйте оператор if-else-if.

        int season = 3;

        if (season == 1) {
            System.out.println("It's winter!");
        }
        else if (season == 2) {
            System.out.println("It's spring!");
        }
        else if (season == 3) {
            System.out.println("It's summer!");
        }
        else if (season == 4) {
            System.out.println("It's autumn!");
    }
        else System.out.println("There's no season like this!");
    }

}


