
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class RedSquare extends JApplet
{
   public void paint(Graphics graphics)
   {
      int z = 0;
      while(z != 10){
         z++;
         Random rand = new Random();
         float r = rand.nextFloat();
         float g = rand.nextFloat();
         float b = rand.nextFloat();
         Color randomColor = new Color(r, g, b);
         graphics.setColor(Color.randomColor);
         int x = 100;
         int y = 100;
         int size = 200;
         graphics.fillRect(x,y,size,size);
      
      }
      
   }
}