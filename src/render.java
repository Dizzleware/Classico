/**
 * Created by Cayle J. Elsey on 3/5/14.
 */
import javax.swing.*;
import java.awt.*;

public class render extends JFrame {
    public render(int x, int y){
        setSize(x, y);
        setVisible(true);
        add(new panelPlus());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

       class panelPlus extends JPanel {

    tile c = new tile(50,100);
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
        drawTile(c, g);
    }

    public void drawTile(tile Tile, Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(50,60,100,200);
    }

    public void doDrawing(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(100,50,200,100);
    }
}