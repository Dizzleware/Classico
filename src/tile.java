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
        SetPoints();
    }

    public tile(int x, int y){
        position.x = x;
        position.y = y;
        SetPoints();
    }

    public tile(int x, int y, COLOR c){
        position.x = x;
        position.y = y;
        color = c;
        SetPoints();
    }

    public tile(){

    }

    //Variables
    Point position;
    COLOR color;
    TriPoint coords;
    int height;
    int sideLength;
    Point[] vertices = new Point[6];

    //Gameplay variables
    double influenceModifier;
    double visibilityModifier;
    double resourceModifier;
    double populationModifier;

    int population, visibility, influence, credits;
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

    public void draw(Graphics2D g){
        g.setColor(Color.BLACK);
        for(int i = 0; i < 6; i++){
            if(i == 0){
                g.drawLine(vertices[0].x, vertices[0].y, vertices[1].x, vertices[1].y);
                continue;
            }

            g.drawLine(vertices[i].x, vertices[i].y, vertices[i + 1].x, vertices[i + 1].y);

        }
    }
    public void changeColor(COLOR c){
        color = c;
    }

    public void changeHeight(int h){
        height = h;
    }

}
