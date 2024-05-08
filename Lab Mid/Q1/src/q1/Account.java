
package q1;



   
    
public class Account {
    int accID;String owner;double balance;double interestRate;
    
    public  Account(int accID,String owner,double balance,double interestRate)
    {
        this.accID= accID;this.owner= owner;this.balance =balance;this.interestRate= interestRate;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return " Account:{" + "accID=" + accID + ", owner=" + owner + ", balance=" + balance + ", interestRate=" + interestRate + '}';
    }

    
}
