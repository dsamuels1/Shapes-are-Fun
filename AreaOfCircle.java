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
public class AreaOfCircle {
    
    double circleArea(double radius) {
        if(radius < 0) {
            return -1;
        }else {
        return Math.PI * radius;
        }
    }
    
    
}
