

import sensors.Testable;
import sensors.Proximity.Direction;

// the purpose of the Simulation class is to create a controllable environment using pre-defined sensor data to simulate IoT in the real world.
public class Simulation extends Testable {
	public Simulation() {
		// Section A
		super(150);
		
		// Section B
		setupSpeed(0, 150);
		setupObjectDist(31680, 0);
		setupObjectDir(Direction.STATIONARY);
		setupCrossingDist(26400, 0);
		setupGatesOpen(false);
		setupW1RPM(1000, 1000);
		setupW2RPM(1000, 1000);
		setupW3RPM(1000, 1000);
		setupW4RPM(1000, 1000);
		
		// Section C
		setObjectDist(null, 149);
		setCrossingDist(null, 149);
	}
}
