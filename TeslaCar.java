package edu.fiu.sysdesign;

public class TeslaCar implements SelfCheckCapable {

	// private static Object teslaCar;
	private preCheck enter;
	private batteryOperation battery;
	private safetySystem sensors;
	private navigationSystem maps;
	private shutDown exit;
	private String preCheck;

	public TeslaCar() {
		battery = new batteryOperation();
		enter = new preCheck();
		sensors = new safetySystem();
		maps = new navigationSystem();
		exit = new shutDown();

	}

	public static void main(String[] args) {
		TeslaCar TeslaCar = new TeslaCar();
		TeslaCar.runSelfCheck();
	}
	// TODO Auto-generated method stub

	public void startCar() {

	}

	public void runCar() {

	}

	public void stopCar() {

	}

	public String getComponentName() {

		return (String) preCheck;
	}

	public boolean selfCheck() {
		return false;

	}

	public boolean runSelfCheck() {
		return false;

	}
}
