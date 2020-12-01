public class Cone // ( double radius, double height )
{
    private double radius;  // radius of the base
    private double height;  // height of the cone
  
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
  
    public double area() {
        // returns area of cone
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
  
    public double volume() {
        // returns volume of cone
        return Math.PI * radius * radius * height / 3.0;  
    }

    public void setHeight(double height) {
        if (height >= 0)
            this.height = height ;
        }
    

    public void setRadius(double radius) {
        if (radius >= 0)
            this.radius = radius ;
        }
    

    public double getHeight( ) {
      return height;
    }
    
    public double getRadius( ) {
      return radius;
    }

    // Added methods

    public double slantHeight() { 
        // s = √(r2 + h2)
        return (Math.sqrt((radius * radius) + (height * height))); 
    }

    public double angle() {
        // evaluates to the angle at the apex of the cone
        // θ = arc tan (radius/height)
        return Math.atan(radius / height);
    }

    // End of added methods

  
}
