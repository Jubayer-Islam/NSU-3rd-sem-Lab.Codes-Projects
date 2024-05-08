
package file;


public class Quiz {
    private int Id;
    private int mark;
    
    public Quiz (int id,int mark)
    {
        this.Id=id;
        this.mark=mark;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
}
