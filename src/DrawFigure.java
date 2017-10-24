import java.util.*;
/**
 * Created by lugas on 24.10.2017.
 */
public class DrawFigure {

    public static void main (String[] args){
        DrawFigure drawFigure = new DrawFigure();
        drawFigure.rectangle(6, 3);
        //**drawFigure.emptyRectangle(5, 4);
        drawFigure.printTriangle();

    }

    public static void rectangle (int width, int height) {
        int i;
        int j;
        for ( i = 0; i < height; i++ ) {
            for ( j = 0; j < width; j++) {
                printStars(width);
            }
            System.out.println("");
        }
    }



    //** public static void emptyRectangle(int width, int height) {
    //**     for (int i = 1; i <= i; i++) {
    //**         for (int j = 1; j <= i; j++) {
    //**             if (i == 1 || i == 5)
    //**                 System.out.print("* ");
    //**             else if (j == 1 || j == 4)
    //**                 System.out.print("* ");
    //**             else
    //**                System.out.print("  ");
    //**        }
    //**         System.out.println();
    //**    }
    //** }

    public static void printTriangle(){
        for (int j=6; j<0; j++)
        {
            for (int i=0; i>j; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void printStars(int amount) {
        System.out.print(" * ");

    }

}
