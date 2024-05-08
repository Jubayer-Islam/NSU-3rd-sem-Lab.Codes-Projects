
package abstraction;


public  class teilzeitArbeiter extends Employee {
    private int workingHours;
	public teilzeitArbeiter(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

   
        @Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}
}
