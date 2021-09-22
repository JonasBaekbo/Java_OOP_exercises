package com.company;

public class Test {
    public static void main(String[] args) {
        /*//Personopgave
        Person Person = new Person("Jonas", 23);
        String personName = Person.getName();
        int personAge = Person.getAge();
        Person.hasBirthday();
        Person.getAge();
        System.out.println(Person);*/

        //Terningeopgave
        /*Dice Dice = new Dice();
        Dice.roll();
        int rollOnDice = Dice.getFaceValue();
        System.out.println(rollOnDice);*/

        Die[] Die = new Die[5];
        int sum =0;
        for (int i =0; i < Die.length; i++){
            Die[i] = new Die();
        }
        for (com.company.Die die : Die) {
            die.roll();
            sum += die.getFaceValue();
            System.out.println(die.getFaceValue());
        }
        System.out.println("summen af alle rul med terningen er: " + sum);

        /*//Lampe opgave
        Lamp skrivebord = new Lamp(false);
        Lamp sengelampe = new Lamp(true);
        Lamp loftslampe = new Lamp(false);

        skrivebord.trykPåKontakt();
        sengelampe.trykPåKontakt();
        loftslampe.trykPåKontakt();

        System.out.printf("Skrivebordslampen er: %s, Sengelampen er: %s, Loftslampen er: %s", skrivebord, sengelampe, loftslampe);
*/

    }
}
