/**
 * Created by Cayle J. Elsey on 3/2/14.
 */
public class TriPoint {
    public TriPoint(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    public TriPoint(){
        x = 0;
        y = 0;
        z = 0;
    }
    int x, y, z;

    public void setX(int a){
        x = a;
    }

    public void setY(int a){
        y = a;
    }

    public void setZ(int a){
        z = a;
    }

}
