/**
 * Created by Cayle J. Elsey on 3/1/14.
 */
import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        //Main function, whoopdy do

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                Lines2 lines = new Lines2();
                lines.setVisible(true);
            }
        });

        tile genesis = new tile(100,100);
        genesis.sideLength = 10;



    }
}
