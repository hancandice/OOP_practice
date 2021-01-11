package mckdh.decorator.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.BomberAirplane;
import mckdh.decorator.airplane.airplanestate.AirplaneState;
import mckdh.decorator.airplane.cockpit.PowerArmorOnDefaultCockpit;
import mckdh.decorator.pilot.FightPilot;
import mckdh.decorator.pilot.Pilot;

public class PilotTest {
	Pilot pilot = null;
	
	@Before
	public void setUp() throws Exception {
		Airplane airplane = new BomberAirplane();
		airplane.cockpitSet(new PowerArmorOnDefaultCockpit());
		pilot = new FightPilot(airplane);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntoCockpit() {
		AirplaneState airplane = pilot.intoCockpit();
		
		assertNotNull(airplane);
	}

	@Test
	public void checkAirplane() {
		//메인 작업 
		boolean result = pilot.checkAirplane();
		assertTrue(result);
	}
	
	@Test
	public void turnOnAirplane() {
		//메인 작업 
		boolean result = pilot.turnOnAirplane();
		assertTrue(result);
	}
	
	@Test
	public void increaseSpeedOnLand() {
		//메인 작업 
		boolean result = pilot.increaseSpeedOnLand();		
		assertTrue(result);
	}
	
	@Test
	public void takeOff() {
		//메인 작업 
		boolean result = pilot.takeOff();
		assertTrue(result);
	}
	
	@Test
	public void wheelIntoBody() {

		//메인 작업 
		AirplaneState airplane = pilot.wheelIntoBody();

		assertNotNull(airplane);
	}
}
