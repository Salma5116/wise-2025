public class Demo6{
    
    public static void main(String[] args){
        
        int[] laenge10 = createArray(10);
        printArray(laenge10);
        int[] extendedArray = extendArray(laenge10, 10);
        System.out.println("%%%%%%%%%");
        printArray(extendedArray);
    }
    
    /**
     * Sie nimmt einen Eingabearray und erweitert den Array um x Stellen (Array hat dann Länge Eingabearray.length + x)
     * 
     * @param int[] Eingabearray
     * @param x Anzahl zusätzlicher Stellen 
     * @return verlängerter Array
     */
     public static int[] extendArray(int[] eingabeArray, int x){
         int[] ergebnisArray = new int[x + eingabeArray.length];
         for (int index = 0; index < eingabeArray.length; index++){
             ergebnisArray[index] = eingabeArray[index];
         }
         return ergebnisArray;
     }
    
     
     
     
     
     
    
    /**
     * Legt einen int-Array der Länge n an und schreibt an die Stelle i den Wert i
     * 
     * @param n Länge des Arrays
     * @return den erstellten Array
     */
     public static int[] createArray(int n){
         int[] ergebnisArray = new int[n];  //Array anlegen
         for (int index = 0; index < n; index++){ //Array mit Werten belegen
             ergebnisArray[index] = index;
         }
         return ergebnisArray;
     }
     
     /**
      * Gib die einzelnen Elemente des Arrays auf der Konsole aus
      * 
      * @param int[] der Array
      */
      public static void printArray(int[] arr){
          for(int elem : arr){
              System.out.println(elem);
          }
      }
     
    
    
}