package com.bootcamp061.usostring;

public class PracticasString {
    public static void main(String[] args) {
        System.out.println(longitudCadena());
        System.out.println(obtenerCaracter("vulcanizacion", 9));
        System.out.println(extraeSubsecuenciaString("programacion"));
        usoUpperLower("Aprendiendo Java");
        System.out.println(eliminaEspaciosAlincioyFinal("  Hola Mundo  "));
        System.out.println(reemplazaCaracteres('a', 'o'));
        System.out.println("Mensaje contiene palabrota: " + detectorPalabrota("Eres un maldito"));
        detectorUpper("Aprendiendo Java");
    }

    /**
     * Método que devuelve la longitud de una cadena de texto
     * @return longitud
     */
    public static int longitudCadena() {
        String texto = "Aprendiendo Java";
        int longitud = texto.length();
        double val = Math.PI;
        return longitud;
    }

    /**
     * Método que devuelve el caracter en la posición 5 de una cadena de texto
     * @return letra
     */

    public static char obtenerCaracter() {
        String texto = "Montaje de neumaticos";
        char letra = texto.charAt(5);
        return letra;
    }

    /**
     * Método que devuelve el caracter en la posición 5 de una cadena de texto
     * @return letra
     */
    
    public static char obtenerCaracter(String texto, int posicion) {
        char letra = texto.charAt(posicion);
        return letra;
   }

    /**
     * Método que devuelve la subcadena de una cadena de texto
     * @return subcadena
     */
    public static String extraeSubsecuenciaString(String palabra) {
        String resultado = palabra.substring(0, 7);
        return resultado;
    }

    /**
     * Método que convierte una cadena de texto a mayúsculas y minúsculas
     * @return mensaje
     */
    public static void usoUpperLower(String mensaje) {
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje en mayúsculas: " + mensaje.toUpperCase());
        System.out.println("Mensaje en minúsculas: " + mensaje.toLowerCase());
    }

    /**
     * Método que elimina los espacios en blanco al inicio y al final de una cadena de texto
     * @return texto
     */
    public static String eliminaEspaciosAlincioyFinal(String texto) {
        return texto.trim();
    }

    /**
     * Método que reemplaza un caracter por otro en una cadena de texto
     * @return resultado
     */
    public static String reemplazaCaracteres(char oldChar, char newChar) {
        String texto = "Aprendiendo Java";
        String resultado = texto.replace(oldChar, newChar);
        return resultado;
    }

    /**
     * Método que detecta si una cadena de texto contiene una palabrota
     * @return contienePalabrota
     */

    public static boolean detectorPalabrota(String comentario) {
        boolean contienePalabrota = comentario.contains("maldito");
        return contienePalabrota;
    }

    /**
     * Método que detecta si una cadena de texto contiene mayúsculas
     * @return contieneMayusculas
     */

    public static void detectorUpper(String texto) {
        boolean tieneMayusculas = false;
        for(int i = 0; i < texto.length(); i++) {
            if(Character.isUpperCase(texto.charAt(i))) {
                tieneMayusculas = true;
                break;
            }
        }
        if(tieneMayusculas) {
            System.out.println("El texto contiene mayúsculas");
        } else {
            System.out.println("El texto no contiene mayúsculas");
        }
    }

    public static boolean isPassowrdStrong(String password) {
        int count = 0;
        for(Character c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
                break;
            }
        }
        return password.length() >= 8 && count >= 2;
    }
}
