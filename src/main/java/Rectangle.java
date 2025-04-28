public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }
    
    public double getWidth() {
        return this.width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return (this.length + this.width) * 2;
    }
    



}
/*
  1. Create a Rectangle class:

It should have _length_ and _width_ as its two instance variables.  They should be doubles<br>
Create a constructor that takes in the length and width and sets them from parameters.<br>
Create getters for all instance varaibles.	<br>
Create two methods, _area_ and _perimeter_ which will return the the respective values as doubles.<br>

*/