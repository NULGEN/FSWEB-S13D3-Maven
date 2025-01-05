package org.example;

public class Wall {


    double width;
    double height;

//    public  Wall(){
//
//    }
    public  Wall(double width, double height){
        this.width = width;
        this.height = height;


    }
    public  double getWidth(){
        return  this.width;
    }
    public  double getHeight(){
        return  this.height;
    }
    public  double setWidth(double number ){
        if(number<0){
            return this.width = 0; }
        else {
            return this.width  = number;
        }

    }
    public  double setHeight(double number){
        if(number<0){
            return  this.height=0;
        }
        else{
            return  this.height= number;
        }
    }
    public  double getArea(){
        return  this.width * this.height;
    }
}
