package org.example;


import org.example.enums.Dice;

/*
    1. Make an Enum called Dice with values D6, D10, D20 and D100
    2. Add a field for each value representing the maxValue for each roll. You also need to create a constructor.
    3. Make a method called roll that returns a random number between 1 and the maxValue.

 */
public class App 
{
    public static void main( String[] args )
    {
        Dice d6 = Dice.D6;
        System.out.println(d6.roll());
        Dice[] toRoll = {Dice.D6, Dice.D6, Dice.D20, Dice.D100};
        System.out.println(roll(toRoll));

    }

    public static int roll(Dice...dices){
        int sum = 0;
        for(Dice dice : dices){
            sum = sum + dice.roll();
        }
        return sum;
    }
}
