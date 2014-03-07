/**
 * Created by Cayle J. Elsey on 3/1/14.
 */
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;
public class Map extends JFrame {
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

    public Map(int x, int y){
        setSize(x, y);
        setVisible(true);
        add(new Surface());


    }

    //variables
    LinkedList<tile> tiles;
    int xOffset, yOffset;
    int tileWidth;
    Graphics g;
    tile t = new tile(100,100);
    //Methods
    private void loadPredefinedMap(String mapName){

    }

    public void generateMap(int seed){

    }


    public void render(){
        //Traverse tiles linked list, and render them to the JFrame
    }

    public tile searchMap(TriPoint t){

        tile Tile = new tile(t);

        for(int i = 0; i < tiles.size(); i++){
            Tile = tiles.get(i);
            if(t.x == Tile.coords.x){

                if(t.y == Tile.coords.y){
                    return Tile;
                }
            }
        }
        return null;
    }

    public class Surface extends JPanel{

    public Surface(){
        setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g){
             super.paintComponent(g);
             doDrawing(g);
        }

    public void doDrawing(Graphics g){
            Graphics2D g2 = (Graphics2D) g;

            g2.drawLine(100,200,200,400);
        }
    }
}
