
package q1;



    public class SavingAccount extends Account{
   
    double minAmmount;
    public SavingAccount(int accID,String owner,double balance,double interestRate,double minAmmount)
    {
        super(accID, owner, balance, interestRate);
        
        this.minAmmount=minAmmount;
        
        
    }

   

    public double getMinAmmount() {
        return minAmmount;
    }

    public void setMinAmmount(double minAmmount) {
        this.minAmmount = minAmmount;
    }
    
    
    public String toString()
    {
        return super.toString()+
                "\n Min Ammount of deposit :"+this.minAmmount;
                
    }
}
