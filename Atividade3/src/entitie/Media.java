package entitie;

public class Media {
	
	public String name;
	public double valueUm, valueDois, valueTres;

	public double value(){
		return valueUm + valueDois + valueTres;
	}
	
	public String toString(){
		if (value() >= 60){
			return "PASS" ;
		}
		return "FAILED";
	}
	
	public String missing(){
		if (value() < 60){
		return "MISSING " + String.format("%.2f",60 - value()) + " POINTS";		
		}
		return "";
	}
}