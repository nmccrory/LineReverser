package linereverser;

/**
 * The purpose of this program was to take in a line and reverse the string using loops
 * CSC 1350
 * @author Nick McCrory
 * @since 10/5/2015
 */
import java.util.Scanner;
public class LineReverser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        int i;
        
        System.out.print("Enter a line of text -> ");
        line = input.nextLine();
        
        System.out.println("\nLine:" + line);
        System.out.print("Reverse:");
        for(i=line.length()-1; i >= 0; i--){
            System.out.print(line.charAt(i));
        }
        System.out.println('\n');
    }
    
}
