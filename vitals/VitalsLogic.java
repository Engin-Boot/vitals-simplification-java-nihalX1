package vitals;

import java.util.ArrayList;
import java.util.List;

public class VitalsLogic {
	
	public static List<Vital> l1 = new ArrayList<>();
	
	public static IReporter irep = ReporterFactory.getReporterInstance();
	
	public static boolean checkIfVitalFine(Vital vital) {
		return (vital.getValue() > vital.getLowLimit() && vital.getValue() < vital.getHighLimit());
	}
	
	public static List<Vital> getAllVitals() {
		return l1;
	}
	
	public static void addVital(Vital vital) {
		l1.add(vital);
	}
	
	
	public static boolean checkAll(List<Vital> allVitals) {
		for(Vital vital: allVitals) {
			if(!checkIfVitalFine(vital)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static String  checkVitalHighOrLow(Vital vital) {
		if(vital.getValue()<vital.getLowLimit()) {
			return "low";
		}
		else if(vital.getValue()>vital.getHighLimit()) {
			return "high";
		}
		else {
			return "normal";
		}
	}
	
	public static void checkAllHighOrLow(List<Vital> allVitals) {
		for(Vital vital: allVitals) {
			irep.alert(vital.getName(), checkVitalHighOrLow(vital));
		}
	}
	
	public static void check() {
		System.out.println("Are all Vitals fine = "+ checkAll(getAllVitals()));
		checkAllHighOrLow(getAllVitals());
		l1.clear();
	}
	


}
