package entities;

public class Mobile {
	public Mobile(String mobileno, String name, double balance) {
		this.mobileno = mobileno;
		this.name = name;
		this.balance = balance;
	}

	private String mobileno;

	public String getMobileNo() {
		return mobileno;
	}

	public void setMobileNo(String mobileno) {
		this.mobileno = mobileno;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		String display = mobileno + " " + name + " " + balance;
		return display;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || !(obj instanceof Mobile)) {
			return false;
		}

		Mobile m = (Mobile) obj;
		return m.mobileno.equals(this.mobileno);

	}

	@Override
	public int hashCode() {
		return mobileno.hashCode();
	}

}
