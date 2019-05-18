
public class TarrifPlan {

	private String name;
	private int validity;
	private Double tarrif, rental;
	private String typeOfPlan;
	TariffPlan(String name, String typeOfPlan, Double tarrif, int validity, Double rental) {
		this.name  = name;
		this.typeOfPlan = typeOfPlan;
		this.tarrif = tarrif;
		this.validity = validity;
		this.rental = rental;
	}

	public int getValidity() {
		return this.validity;
	}

	public Double getTarrif() {
		return this.tarrif;
	}

	public String getName() {
		return this.name;
	}

	public Double getRental() {
		return this.rental;
	}

	public String getTypeOfPlan() {
		return this.typeOfPlan;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public void setTarrif(Double tarrif) {
		this.tarrif = tarrif;
	}

	public void setRental(Double rental) {
		this.rental = rental;
	}
	public void setTypeOfPlan(String typeOfPlan) {
		this.typeOfPlan = typeOfPlan;
	}

}

