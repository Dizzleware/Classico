/**
 * Created by Cayle J. Elsey on 3/1/14.
 */
import java.util.LinkedList;
import java.util.Random;
public class Map {
    //enums

    //Constructors
    public Map(){
        generateMap((int)Math.random());
    }
    public Map(int seed){
        generateMap(seed);
    }

    public Map(LinkedList<tile> tiles){

    }

    //variables
    LinkedList<tile> tiles;
    //Methods
    private void loadPredefinedMap(String mapName){

    }

    public void generateMap(int seed){

    }

    public void renderMap(){
        //Traverse tiles linked list, and render them to the JFrame
    }

}
