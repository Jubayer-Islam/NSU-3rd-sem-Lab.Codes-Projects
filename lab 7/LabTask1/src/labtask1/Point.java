
package labtask1;


public class Point {
    private int x;
    private int y;

   
    
     Point(int x, int y)
    {
        this.x=x;
        this.y=y;
        
    }
     /* public Point()
               {
                   this.x=0;
                   this.y=0;
               }*/
       public int getX()
       {
           return this.x;
       }
       public int setX(int x)
       {
         return this.x=x;
       }
      
       public int getY()
       {
          return this.y;
       }
       public int setY(int y)
       {
          return this.y=y;
       }
       
      public String toString()
      {
          return "x coordinate is "+this.x+ " and y coordinate" +this.y;
      }
       
      public double distance(Point point2)
      {
         double Distance=0;
         int x1=this.getX();
         int y1=this.getY();
         int x2=point2.getX();
         int y2=point2.getY();
         Distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
       
         /* int x2=point2.getX();
         int y2=point2.getY();
         
         distance=Math.sqrt((this.x-x2)*(this.x-x2)+(this.y-y2)*(this.y-y2));*/
         return Distance;
         
      }
     
     
}
