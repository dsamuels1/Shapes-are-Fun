/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithshapes;

/**
 *
 * @author Logan
 */
public class FunWithShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length, width;
        system.out.print("Enter in the Length and width of the square so we can calculate the area\n");
        length = system.in.read();
        width = system.in.read();
        double area = calcArea(length,width);
        system.out.print("The area of the square with length " + length + " and " + width + " is " + area + ".\n");
        
        double triBase = 5;
        double triHeight = 5.4;
        System.out.println(new AreaOfTriangle().getArea(triBase, triHeight));
        
        double pybase = 5;
        double pyheight = 8.9;
        System.out.println(new VolumeOfPyramid(pybase, pyheight).getVolume());
    }
    
}
