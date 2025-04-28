public class Circle {
    private double radius;

    public double getRadius() { 
        return this.radius;
    }

    public double area() {
        return this.radius * this.radius * 3.14;
    }
    public double circumference() {
        return this.radius * 6.28;
    }
}
/*
  2. Create a Circle class

It should have a _radius_ as its instance variable<br>
Create a constructor that takes in the radius and sets it from a parameter.<br>
Create getters for all instance varaibles.<br>
Create two methods, _area_ and _circumference_ which will return the the respective values as doubles.  Use 3.14 as PI.<br>

*/