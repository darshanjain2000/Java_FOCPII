public class Cylinders extends Circle 
{
   
   private double height;
   
   public Cylinders() 
   {
      super();  
      this.height = 1.0;
   }
   public Cylinders(double height) 
   {
      super();  
      this.height = height;
   }
   public Cylinders(double height, double radius) 
   {
      super(radius); 
      this.height = height;
   }
   public Cylinders(double height, double radius, String color) 
   {
      super(radius, color);  
      this.height = height;
   }
   
   public double getHeight() 
   {
      return this.height;
   }
   public void setHeight(double height) 
   {
      this.height = height;
   }

   public double getVolume() 
   {
      return getArea()*height;   
   }

   
   public String toString() 
   {
      return "This is a Cylinder";  // to be refined later
   }
}