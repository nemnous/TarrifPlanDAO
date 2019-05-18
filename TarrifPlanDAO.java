import java.util.List;

public interface TarrifPlanDAO {
	List <TarrifPlan> getAllPlans();
	void savePlan(String name, String typeOfPlan, Double tarrif, int validity, Double rental);
	void deletePlan(TarrifPlan plan);
	void updateTarrif(TarrifPlan plan, Double tarrif);
}