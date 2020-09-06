package vitals;

public class Tests {
	
	public static void runTests() {
		VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    	
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == true);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 60));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 200));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 80));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 250));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 10));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 200));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 60));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 80));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 40));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 60));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 200));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	    VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
	    VitalsLogic.addVital(new Vital("spo2", 90, 200, 250));
	    VitalsLogic.addVital(new Vital("water", 30, 150, 10));
	    
	    assert(VitalsLogic.checkAll(VitalsLogic.getAllVitals()) == false);
	    VitalsLogic.l1.clear();
	    
	}

}
