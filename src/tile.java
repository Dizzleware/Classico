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
    Point coords;
    int height;

    //Methods
    public boolean hasNeighbor(DIRECTION dir){

        return false;
    }

    public void changeColor(COLOR c){
        color = c;
    }

    public void changeHeight(int h){
        height = h;
    }

}
