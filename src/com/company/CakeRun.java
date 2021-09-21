package com.company;

public class CakeRun {
    public static void main(String[] args) {
    Cake kage = new Cake(3);
        System.out.println(kage);
        double weightOfIngredients = kage.weightOfAllIngredients();
        System.out.printf("Den samlede vægt af alle ingredienser er: %.1f gram\n", weightOfIngredients);
        double weightOfCake = kage.weightOfCake(kage.weightOfAllIngredients());
        System.out.printf("Den samlede vægt af hele kagen er: %.1f gram\n", weightOfCake);
        double totalEnergyInCake = kage.totalEnergy();
        System.out.printf("Den samlede energimængde i kagen er: %.1f kJ", totalEnergyInCake);
    }



}
