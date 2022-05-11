package PatternMatchingAlgo;

public class BruteForce {
    public static void findBrute(String text, String pattern){

        int matches = 0;
        int n = text.length();
        int m = pattern.length();
        for(int i=0; i<=n-m ; i++){ // Recorre to do  el texto basado en un primer indice
            int k = 0;              // Es el indice en el patron, este indice debe ser menor a m
            while(k<m && text.charAt(i+k) == pattern.charAt(k)){
                k++;
                matches = matches + 1; // Cada vez que se pregunta
            }


            if (k==m){
                System.out.println("Tenemos C: "+ matches); // Concurrencias
                System.out.println("Tenemos D, en esa posicion esta el patron: " + i);      // Desplazamiento o indice donde se encuentra
                System.out.println("Tenemos F: " + i);      // F = D
            }

        }

    }


    public static void main(String[] args) {
        findBrute("ababbaabaaab", "abaa");
    }


}
