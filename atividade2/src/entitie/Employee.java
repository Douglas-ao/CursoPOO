package entitie;

public class Employee {

	/*
	  _________________________________________
	 |              Employee  				   |
	 |_________________________________________|
	 |-Name: string              			   |
	 |-GrossSalary: double					   |
	 |-Tax: double							   |
	 |_________________________________________|
	 |+NetSalary(): double					   |
	 |+IncreaseSalary(percentage: double): void|
	 |_________________________________________|
	 */
	
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage){
		grossSalary += grossSalary * percentage / 100.0;
	}

	public String toString(){
		return name + ", $ " + String.format("%.2f", netSalary());
		
	}
	
}
