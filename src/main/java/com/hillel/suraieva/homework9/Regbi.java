package com.hillel.suraieva.homework9;

public class Regbi {
    public static void main(String[] args) {
        int kolTeamMembers = 25;
        int[] ageteam1 = new int[kolTeamMembers];
        int[] ageteam2 = new int[kolTeamMembers];
        int sumAge1 = 0;
        int sumAge2 = 0;

        for (int i = 0; i < ageteam1.length; i++) {
            ageteam1[i] = 18 + (int) (Math.random() * 23);
            sumAge1 += ageteam1[i];
            if (i == 0) {
                System.out.print("Age of members of team1: ");
            }
            if (i == ageteam1.length - 1) {
                System.out.println(ageteam1[i] + ".");
            } else System.out.print(ageteam1[i] + " ,");
        }

        for (int i = 0; i < ageteam1.length; i++) {
            ageteam2[i] = 18 + (int) (Math.random() * 23);
            sumAge2 += ageteam2[i];
            if (i == 0) {
                System.out.print("Age of members of team2: ");
            }
            if (i == ageteam2.length - 1) {
                System.out.println(ageteam2[i] + ".");
            } else System.out.print(ageteam2[i] + " ,");
        }
        System.out.println((double)sumAge1/ageteam1.length);
        System.out.println((double)sumAge2/ageteam2.length);
    }
}
