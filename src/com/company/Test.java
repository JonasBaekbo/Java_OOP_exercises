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

        /*//Terningeopgave
        Dice Dice = new Dice();
        Dice.roll();
        int rollOnDice = Dice.getFaceValue();
        System.out.println(rollOnDice);*/

        Lamp skrivebord = new Lamp(false);
        Lamp sengelampe = new Lamp(true);
        Lamp loftslampe = new Lamp(false);

        skrivebord.trykPåKontakt();
        sengelampe.trykPåKontakt();
        loftslampe.trykPåKontakt();

        System.out.printf("Skrivebordslampen er: %s, Sengelampen er: %s, Loftslampen er: %s", skrivebord, sengelampe, loftslampe);


    }
}
