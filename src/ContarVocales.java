public class ContarVocales {
    public static int contarVocales(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();
        for (char c : frase.toCharArray()) {
            if ("aeiou".contains(String.valueOf(c))) {
                contador++;
            }
        }
        return contador;
    }
}
