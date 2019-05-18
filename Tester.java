import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;




class TarrifPlanManagement implements TarrifPlanDAO{

	private List<TarrifPlan> plans;

	public TarrifPlanManagement() {
		plans = new ArrayList<>();
	}


	@Override
	public void savePlan(String name, String typeOfPlan, Double tarrif, int validity, Double rental) {
		TarrifPlan newPlan = new TarrifPlan(name, typeOfPlan, tarrif, validity, rental);
		this.plans.add(newPlan);
	}


	@Override
	public List <TarrifPlan> getAllPlans() {
		return this.plans;
	}

	@Override
	public void deletePlan(TarrifPlan plan) {
		this.plans.remove(plan);
	}



	@Override
	public void updateTarrif(TarrifPlan plan, Double tarrif) {
		plan.setTarrif(tarrif);
	}

}


/*
 * to add plan "ADD name typeOfPlan Tarrif Validity Rental"
 * remove plan 
*/
public class Tester {
	public static void main(String[] args) {
		TarrifPlanDAO obj = new TarrifPlanManagement();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String inp = scan.nextLine();
			String[] inpList = inp.split(" ");
			switch(inpList[0]) {
				case "ADD":
					obj.savePlan(inpList[1],inpList[2],Double.parseDouble(inpList[3]), Integer.parseInt(inpList[4]), Double.parseDouble(inpList[5]));
					break;
				case "SHOWALL":
					for ( TarrifPlan p : obj.getAllPlans())
						System.out.println(p.toString());
					break;
				case "DELETE":
					int index = 0;
					boolean found = false;
					for ( TarrifPlan p : obj.getAllPlans()) {
						if(p.getName().equals(inpList[1])) {
							found = true;
							break;
						}
						index++;
					}
					if(found)  {
						obj.deletePlan(obj.getAllPlans().get(index));
						System.out.println("Deleted");
					} else {
						System.out.println("Not found");
					}
					break;
				case "UPDATE":
					index = 0;
					found = false;
					for ( TarrifPlan p : obj.getAllPlans()) {
						if(p.getName().equals(inpList[1])) {
							found = true;
							break;
						}
						index++;
					}
					if(found)  {
						obj.updateTarrif(obj.getAllPlans().get(index), Double.parseDouble(inpList[2]));
						System.out.println("Updated");
					} else {
						System.out.println("Plan not found.");
					}
					break;

				default:
					System.out.println("No such case");

			}
		}


	}
}