import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JFrame;


public class MainScreen extends Canvas{

    Canvas can;
    JFrame frame;
    HashMap<String, Color> map;
    
    public void CreateScreen()
    {
        frame = new JFrame("Galaxy");
        can = new MainScreen();
        can.setSize(1920,1080);
        frame.add(can);
        can.setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);
        System.out.print("screen was created");
        
    }
    //mapa que traduz a cor de string para propriedade lida pelo paint component
    public void mapBuilder(){
        map = new HashMap<String, Color>();
        map.put("Red", Color.RED);
        map.put("Blue", Color.BLUE);
        map.put("Yellow", Color.YELLOW);     
    }

    public void paint(Graphics g){
        mapBuilder();
       /* CreateStars star = new CreateStars();
        star.starInformmation();
        String colour = star.colour;
        int [] pos = star.starpos;
        int size = star.size;
        g.setColor(map.get(colour));
        g.fillOval(pos[0], pos[1], size, size);*/

        //Cria um novo objeto estrela
        CreateStars star = new CreateStars();

        for(int i = 0; i < 100; i++){
            //o objeto dá uma posição, cor e tamanho à estrela
            String StarType = star.StarTypeGenerator();
            
            g.setColor(map.get(StarType));
            g.fillOval(star.starLocation[i].x, star.starLocation[i].y, star.size, star.size);
        }
        
    }
    
}