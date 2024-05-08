
package watch;


public class time {
   int hour,minute,second;
    
    
    public time(int hr,int min,int sec){
    hour= ((hr>=0 && hr<24)?hr:0);
    minute=((min>=0 && hr<60)?min:0);
    second=((sec>=0 && sec<60)?sec:0);
    
}
  public String toString(){
      
      return String.format("%02d:%02d:%02d %s",(hour==0||hour==12)?12:hour%12,minute,second,(hour>=12?"PM":"AM"));

  }
  
}
