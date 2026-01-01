/*Write a Java program to copy all of the mappings from the specified
map to another map.
 */
import java.util.Map;
import java.util.HashMap;
public class CopyMap {
    public static void main(String[] args){
        Map<Integer,String> game=new HashMap<>();
        game.put(1,"football");
        game.put(4,"volleyball");
        game.put(3,"cricket");
        game.put(5,"basketball");
        System.out.println("The list of game before :"+game);
        Map<Integer,String> copyGame=new HashMap<>();
        copyGame.putAll(game);
        System.out.println("The list of game after copy:"+copyGame);
        //Write a Java program to remove all of the mappings from a map.
       /* copyGame.clear();
        System.out.println("Remove all of the mapping from a copy map:" +copyGame);*/
        //Write a Java program to check whether a map contains key-value mappings (empty) or not.
        if (copyGame.isEmpty()){
            System.out.println("The copyGAme is empty:");
        }
        else {
            System.out.println("The copyGAme is not empty:");
        }
    }
}
