package vitals;

public class ReporterOne implements IReporter {

	@Override
	public void alert(String vitalName, String message) {
		System.out.println(vitalName + " " + message);
	}

}
