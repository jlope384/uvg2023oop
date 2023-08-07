

/**
 * @author MAAG
 * Class generated ChatGPT
 * Prompt utilizado> En c�digo java quiero una clase llamada "Analizer" con un m�todo est�tico
llamado "Analize" el cu�l recibe un par�metro llamado "allWords" de tipo ArrayList
de Strings, que contiene varias palabras, el m�todo debe recorrer todo el ArrayList
buscando las palabras pal�ndromas, cada palabra pal�ndroma la guarda en otro ArrayList
de Strings el cual deber� devolver al final del m�todo.
 */
import java.util.ArrayList;

public class Analyzer {
	
    public static ArrayList<String> analyze(ArrayList<String> allWords) {
        ArrayList<String> palindromeWords = new ArrayList<>();
        
        for (String word : allWords) {
            if (isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }
        
        return palindromeWords;
    }
    
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
}