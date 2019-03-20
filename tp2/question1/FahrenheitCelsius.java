package question1;

/**
 * FahrenheitCelsius converts values of temperature given in Celsius to Fahrenheit 
 * 
 * @author Elias El-Keserwany
 * @version 18-03-2018-01
 */
public class FahrenheitCelsius {

    /**
     * Enter temperature values (as Integers) in Fahrenheit to convert to Celsius
     * 
     * @param args are the Fahrenheit values entered by the command line.
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for (int i=0; i<args.length;i++) {
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
        }
        // format
        // imposés

    }

    /**
     * la méthode à compléter.
     * 
     * @param f la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float resultat = ((float) (f-32)*5/9);
        return (float)((int)(resultat*10)/10.0);
    }

}
