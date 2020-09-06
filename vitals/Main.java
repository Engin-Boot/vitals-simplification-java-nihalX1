package vitals;

public class Main {

    public static void main(String[] args) {
    	VitalsLogic.addVital(new Vital("bpm", 70, 150, 1600));
    	VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
    	VitalsLogic.addVital(new Vital("water", 30, 150, 40));
        //assert(vitalsAreOk(80, 97, 40) == true);
        //assert(vitalsAreOk(60, 98, 40) == false);
    	
        VitalsLogic.check();
        
        VitalsLogic.addVital(new Vital("bpm", 70, 150, 130));
    	VitalsLogic.addVital(new Vital("spo2", 90, 200, 97));
    	VitalsLogic.addVital(new Vital("water", 30, 150, 40));
    	
    	VitalsLogic.check();
    	
    }
}
