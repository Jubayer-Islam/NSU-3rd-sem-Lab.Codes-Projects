
package q1;


public class DebitAccount extends Account {
 double minBalance;
   public DebitAccount (int accID,String owner,double balance,double interestRate,double minBalance)
   {
       super( accID, owner, balance, interestRate);
       this.minBalance=minBalance;
       
   }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
     public String toString()
    {
        return super.toString()+
                " \n Min Balance:"+this.minBalance;
    
}
}
