import java.util.Scanner;
public class Demo{
    
    public static void main(String[] args){
        System.out.println("#### Beispiel Rabatt ####");
        System.out.println(berechneRabatt(20000));
        
        System.out.println("#### Beispiel switch case ####");
        gebeEssenAus();
        
    }
    
    /**
     * Gibt das Essen am Wochentag aus 1 = Mo, 5 = Fr
     * 
     * @param wochenTagAlsZahl
     */
     public static void gebeEssenAus(){
         
         Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("welchen Tag möchtest Du angezeigt bekommen?");
            int wochenTagAlsZahl = scanner.nextInt();
            switch(wochenTagAlsZahl){
                case 1 -> {System.out.println("Nudeln mit Sauce");
                          System.out.println("Guten Appetit");}
                case 2 -> System.out.println("Die Mensa ist geschlossen.");
                case 3 -> System.out.println("Die Mensa ist geschlossen.");
                case 4 -> System.out.println("Pizza");
                case 5 -> System.out.println("Milchreis mit Kirschen");
                default -> System.out.println("Falscher Wert");
        }
        } while(true);
     }
    
    
    
    
    /**
     * Berechnet Rabatt auf Basis des Gesamtpreises
     * >1000 -> 5% Rabatt
     * >5000 -> 10% Rabatt
     * >10000 -> 20% Rabatt
     * 
     * @param totalAmount Gesamtbetrag des Einkaufs
     * @return Berechneter Rabatt
     */
     public static double berechneRabatt(double totalAmount){
         
         if (totalAmount > 1000 && totalAmount <=5000)
             return totalAmount*0.05;
         if (totalAmount > 5000 && totalAmount <=10000)
            return totalAmount*0.10;
         if (totalAmount > 10000)
            return totalAmount*0.2;
        return 0;    
     }
     
     
     public static double berechneRabatt2(double totalAmount){
         if (totalAmount > 10000)
             return totalAmount*0.20;
         if (totalAmount > 5000)
            return totalAmount*0.10;
         if (totalAmount > 1000)
            return totalAmount*0.05;
        return 0;    
     }
     
    
    
}