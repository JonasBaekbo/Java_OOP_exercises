package com.company;

public class Cake {
    double gramsOfButter = 250;
    double gramsOfSugar = 250;
    double numberOfEggs = 4;
    double gramsOfFlour = 250;
    double tblspBakingPowder = 1;
    double numberOfLemons = 1;
    double numberOfPersons = 6;
    double conversionFactor;


    public Cake(double desiredNumberOfPersons){

        // Opretter en double-variabel med omregningsfaktoren udfra brugerens input og antal personer i opskriften
        conversionFactor = desiredNumberOfPersons / numberOfPersons;
        setGramsOfButter(gramsOfButter);
        setGramsOfSugar(gramsOfSugar);
        setNumberOfEggs(numberOfEggs);
        setGramsOfFlour(gramsOfFlour);
        setTblspBakingPowder(tblspBakingPowder);
        setNumberOfLemons(numberOfLemons);

    }

    public double getGramsOfButter() {
        return gramsOfButter;
    }

    public void setGramsOfButter(double gramsOfButter) {
        this.gramsOfButter = gramsOfButter * conversionFactor;
    }

    public double getGramsOfSugar() {
        return gramsOfSugar;
    }

    public void setGramsOfSugar(double gramsOfSugar) {
        this.gramsOfSugar = gramsOfSugar * conversionFactor;
    }

    public double getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(double numberOfEggs) {
        this.numberOfEggs = numberOfEggs * conversionFactor;
    }

    public double getGramsOfFlour() {
        return gramsOfFlour;
    }

    public void setGramsOfFlour(double gramsOfFlour) {
        this.gramsOfFlour = gramsOfFlour * conversionFactor;
    }

    public double getTblspBakingPowder() {
        return tblspBakingPowder;
    }

    public void setTblspBakingPowder(double tblspBakingPowder) {
        this.tblspBakingPowder = tblspBakingPowder * conversionFactor;
    }

    public double getNumberOfLemons() {
        return numberOfLemons;
    }

    public void setNumberOfLemons(double numberOfLemons) {
        this.numberOfLemons = numberOfLemons * conversionFactor;
    }

    public double weightOfAllIngredients(){
        double weightOfButter = gramsOfButter;
        double weightOfSugar = gramsOfSugar;
        double weightOfEgg = 60;
        double weightOfFlour = gramsOfFlour;
        double weightOfTblSpBakingPowder = 5;
        double weightOfLemons = 0.8;
        double totalWeightOfIngredients = gramsOfButter + gramsOfSugar + gramsOfFlour + (weightOfEgg * numberOfEggs) + (weightOfTblSpBakingPowder * tblspBakingPowder) + (weightOfLemons * numberOfLemons);

        return totalWeightOfIngredients;
    }

    public double weightOfCake(double weightOfIngredients){
        double totalWeightOfCake = weightOfIngredients - weightOfIngredients / 10;
        return totalWeightOfCake;
    }

    public double totalEnergy(){
        double energyInButter = (3047 / 100) * gramsOfButter;
        double energyInSugar = (1700 / 100) * gramsOfSugar;
        double energyInEgg = (346 / 100) * 60;
        double energyInFlour = (353 / 100) * gramsOfFlour;
        double energyInTblSpBakingPowder = (175 / 100) * 5;
        double energyInLemons = (187 / 100) * 0.8;
        double totalenergyInIngredients = energyInButter + energyInSugar + energyInEgg + energyInFlour + energyInTblSpBakingPowder + energyInLemons;

        return totalenergyInIngredients;
    }

    @Override
    public String toString() {
        return String.format("Ingredienser:\n%.1f g smør\n%.1f g sukker\n%.1f g mel\n%.1f æg\n%.1f tsk. bagepulver\n%.1f økoligiske citroner", getGramsOfButter(), getGramsOfSugar(), getGramsOfFlour(), getNumberOfEggs(), getTblspBakingPowder(), getNumberOfLemons());
    }
}
