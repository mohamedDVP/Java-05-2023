package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int toto = 1;
        int titi = 1;
        sumTwoValues(toto, titi);
        showMaxValue(toto, titi);
    }

    // somme de deux valeurs
    public static void sumTwoValues(int valueOne, int valueTwo) {
        // +, -, /, %, * -> opérateur arithmétique
        int sum = valueOne + valueTwo;
        System.out.println(sum);
    }

    public static void showMaxValue(int valueOne, int valueTwo) {
        // >, <, <=, >=, == ->opérateur de comparaison
        if (valueOne > valueTwo) {
            System.out.println("value One est la plus élevée");
        }
        else if (valueTwo >valueOne){
            System.out.println("value Two est la plus élevée");
        }
        else {
            System.out.println("equivalent");
        }
    }
}
