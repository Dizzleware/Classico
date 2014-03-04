/**
 * Created by Cayle J. Elsey on 3/1/14.
 */

import java.awt.*;

public class tile {
    //enums
    enum COLOR{
        RED,
        GREEN,
        BLUE,
        BROWN,
        YELLOW,
        BLACK,
        ORANGE,
        PURPLE,
        PINK,
        GREY;
    }

    enum DIRECTION{
        LEFT,
        RIGHT,
        LUP,
        RUP,
        LDOWN,
        RDOWN;
    }

    //Constructors
    public tile(Point p){
        position.x = p.x;
        position.y = p.y;
        coords = new TriPoint();
    }

    public tile(int x, int y){
        position.x = x;
        position.y = y;
    }

    public tile(int x, int y, COLOR c){
        position.x = x;
        position.y = y;
        color = c;
    }

    //Variables
    Point position;
    COLOR color;
    TriPoint coords;
    int height;
    int sideLength;
    Point[] vertices = new Point[6];
    //Methods
    public boolean hasNeighbor(DIRECTION dir, Map map){

        switch(dir){
            case LDOWN:
                if(map.searchMap(new TriPoint(coords.x, coords.y - 1, coords.z + 1)) != null){return true;}
            case RDOWN:
                if(map.searchMap(new TriPoint(coords.x + 1, coords.y - 1, coords.z)) != null){return true;}
            case LEFT:
                if(map.searchMap(new TriPoint(coords.x - 1, coords.y, coords.z + 1)) != null){return true;}
            case RIGHT:
                if(map.searchMap(new TriPoint(coords.x + 1, coords.y, coords.z - 1)) != null){return true;}
            case RUP:
                if(map.searchMap(new TriPoint(coords.x, coords.y + 1, coords.z - 1)) != null){return true;}
            case LUP:
                if(map.searchMap(new TriPoint(coords.x - 1, coords.y + 1, coords.z)) != null){return true;}
        }
        return false;

    }

    public void SetPoints(){
        vertices[0] = new Point(position.x, position.y + sideLength);
        vertices[1] = new Point(position.x - sideLength/2, position.y + sideLength / 2);
        vertices[2] = new Point(vertices[1].x, position.y + sideLength / 2);
        vertices[3] = new Point(position.x, position.y + sideLength);
        vertices[4] = new Point(position.x + sideLength / 2, position.y - sideLength / 2);
        vertices[5] = new Point(position.x + sideLength / 2, position.y + sideLength / 2);
    }
    public void changeColor(COLOR c){
        color = c;
    }

    public void changeHeight(int h){
        height = h;
    }

}
