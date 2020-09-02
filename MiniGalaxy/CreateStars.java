import java.awt.Graphics;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Arrays;
import java.util.Random;
import java.awt.Canvas;
import java.awt.Point;

public class CreateStars extends Canvas {
    
    Random gen = new Random();

    Point[] starLocation = new Point[100];
    int[] coordinates = new int[2];

    int size, min,max, n;

    String starColor;
    String starType;
    
   /* private int[] coordinates(){
        int max = 300;
        int min = 100;
        
        int[] pos = new int[2];

        int x = (int) Math.random() * ((max - min) + 1) + min ;
        int y = (int) Math.random() * ((max - min) + 1) + min ;

        pos[0] = x;
        pos[1] = y;
        return pos;
    }
    
    private int starSize(){
        int max = 100;
        int min = 40;

        int size = (int) Math.random() * ((max - min) + 1) + min ;
        return size;
    }
    public void starInformmation(){
        coordinates();
        starSize();
        starpos = coordinates();
        size = starSize();
        colour = "Red";
    }
*/
    

    public String StarTypeGenerator(){
     

     int type = gen.nextInt(2);
     
     
     
     switch (type) {
        
         case 1:
             //red giant 
             min = 40;
             max = 100;
             starBuilder(max, min);
             return "Red";
        case 2:
             //blue star
             min = 50;
             max = 70;
             starBuilder(max, min);
             return "Blue";
         case 0:
             //yellow dwarf
             min = 30;
             max = 60;
             starBuilder(max, min);
             return "Yellow";  
         default:
             return null;

     }

    }
    

    //Gerar posição 
    //encontrar um algoritmo para verificar se num quadrado de tamanho x existe algum pixel não preto
    private void starBuilder(int maxSize, int minSize){
        //gerar tamanho da estrela
        size = gen.nextInt(maxSize-minSize) + minSize;
        boolean exists = true;
        
        do{
            Point coordinates = new Point(gen.nextInt(1900), gen.nextInt(1000));
            exists = Arrays.asList(starLocation).contains(coordinates);
            if(!exists){
                starLocation[n] = coordinates;
                n++;
            }
        }while(exists);
        
    }

}

