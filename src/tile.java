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

    //Methods
    public boolean hasNeighbor(DIRECTION dir, Map map){

        switch(dir){
            case LDOWN:

            case RDOWN:

            case LEFT:

            case RIGHT:

            case RUP:

            case LUP:

        }
        return false;
    }

    public void changeColor(COLOR c){
        color = c;
    }

    public void changeHeight(int h){
        height = h;
    }

}
