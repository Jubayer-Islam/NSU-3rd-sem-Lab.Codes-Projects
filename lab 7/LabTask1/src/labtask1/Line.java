
package labtask1;

public class Line {
  private Point start;
  private Point end;
  
 Line(int x1,int y1,int x2,int y2)
{
  Point point1 = new Point(x1,y1);
  Point point2= new Point(x2,y2);
  
  start= point1;
  end=point2;
 
} 
    public Point getStartPoint()
    {
      return start;
    }
   public Point getEndPoint()
   {
      return end;
   }
    /*
 public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
 
  
   public void setStart(Point start)
      {
          this.start=start;
      }
      public void setEnd(Point end)
      {
          this.end=end;
      }*/
      public double length()
      {
          double length=0;
          length=start.distance(end);
           // length = getStartPoint().distance(getEndPoint());
        //length = this.start.distance(this.end);
          return length;
      }
   
}
