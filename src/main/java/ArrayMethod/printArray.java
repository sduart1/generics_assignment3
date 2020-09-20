
package ArrayMethod;

/**
 *
 * @author steveduarte
 * @Description Array method to print an array of different types
 */
public class printArray {

    // This method will take an array of type String[] or Integer[]
    // and print it with formatting
    public static <T> void printArray(T[] array){
        for(T t: array){
            System.out.print(t+"\n");
        }
    }
}
