package domain; 
 
public class Exercise { 
    /**
     * Static method that encrypt input string with Caesar's ecnryption
     * @param input string to encrypt
     * @param displacementVaule number of encryption displacements
     * @return encrypted string
     */
    public static String Calculate(String input, int displacementVaule) {
        StringBuilder result = new StringBuilder();

        for (char item : input.toCharArray()) {
            result.append((char)((int)item + displacementVaule));
        }

        return result.toString();
    } 
} 