package domain; 
 
public class Exercise { 
    /**
     * Static method that encrypt input string with Caesar's ecnryption
     * @param Input string to encrypt
     * @param DisplacementVaule number of encryption displacements
     * @return encrypted string
     */
    public static String Calculate(final String Input, final int DisplacementVaule) {
        StringBuilder result = new StringBuilder();

        for (char item : Input.toCharArray()) {
            result.append((char)((int)item + DisplacementVaule));
        }

        return result.toString();
    } 
} 