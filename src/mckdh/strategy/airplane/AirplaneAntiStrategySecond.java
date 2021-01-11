package mckdh.strategy.airplane;

import mckdh.strategy.airplane.cockpit.anti.ComfortableCockpit;
import mckdh.strategy.airplane.cockpit.anti.HightechCockpit;
import mckdh.strategy.airplane.cockpit.anti.PowerArmorCockpit;

public class AirplaneAntiStrategySecond {

	protected int airplaneSpeed = 0; //속도
	protected boolean airplaneSuitableLift = false; //적당한 양력을 얻었는가.
	protected String airplaneState = ""; //상태
	protected String wheelState = ""; //상태
	protected int airplaneAltitude = 0; //고도
	
	protected int armorPower = 100; // 비행기 기체의 방어력을 100으로 가정 
	
	protected PowerArmorCockpit armorCockpit;
	protected HightechCockpit hightechCockpit;
	protected ComfortableCockpit comfortableCockpit;
	
	String kindCockpit = "";

	//********************** 조종석 관련 *******************//
	public AirplaneAntiStrategySecond(String kindCockpit) { // 조종석 종류(kindCockpit)을 인자로 받는 생성자 
	
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();		// 최초에 1번 객체 생성 	
			armorPower += armorCockpit.armorFeature();  // 관련 로직 쓸때마다 어느 객체를 쓸 것인지 if 문을 쓴다. 
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			armorPower += hightechCockpit.armorFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			armorPower += comfortableCockpit.armorFeature();
		} 
		
		System.out.println("이 배행기의 방어력은 ["+armorPower+"] 입니다.");
	}


	//********************** 조종석 관련 연동 메소드 *******************//
	
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		int result = 0;
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();
			result = armorCockpit.armorFeature();
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			result = hightechCockpit.armorFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			result = comfortableCockpit.armorFeature();
		} 
		return result;
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨 
	public int chairFeature() {
		int result = 0;
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();
			result = armorCockpit.chairFeature();
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			result = hightechCockpit.chairFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			result = comfortableCockpit.chairFeature();
		} 
		return result;
	}
	
	// 계기판 기능 구현, 실제로는 계기판 관련 각종 로직이 구현됨 
	public int panelFeature() {
		int result = 0;
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();
			result = armorCockpit.panelFeature();
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			result = hightechCockpit.panelFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			result = comfortableCockpit.panelFeature();
		} 
		return result;
	}
	
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨 
	public int comfortableFeature() {
		int result = 0;
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();
			result = armorCockpit.comfortableFeature();
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			result = hightechCockpit.comfortableFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			result = comfortableCockpit.comfortableFeature();
		} 
		return result;
	}
	
	// 탈출 장비 기능 구현, 실제로는 탈출 장비 관련 각종 로직이 구현됨 
	public int escapeFeature() {
		int result = 0;
		if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorCockpit = new PowerArmorCockpit();
			result = armorCockpit.escapeFeature();
		} else if(kindCockpit.equals("최첨단 조종석")) {
			hightechCockpit = new HightechCockpit();						
			result = hightechCockpit.escapeFeature();
		} else if(kindCockpit.equals("편의성 강화 조종석")) {
			comfortableCockpit = new ComfortableCockpit();									
			result = comfortableCockpit.escapeFeature();
		} 
		return result;
	}
	
	//********************** 이륙 관련 메소드 *******************//
	// 비행기 점검을 합니다.
	public boolean checkAirplane() {
		boolean result = false;
		System.out.println("비행기 점검을 합니다. 아직은 점검 했다고 가정하고..");
		result = true;
		System.out.println(result+" 정상입니다.");
		return true;
	}
	
	// 비행기 시동을 켭니다.
	public boolean turnOnAirplane() {
		boolean result = false;
		System.out.println("비행기 시동을 켭니다. 아직은 시동 켰다고 가정하고..");
		result = true;
		System.out.println(result+" 정상입니다.");
		return result;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	public boolean increaseSpeedOnLand() {
		airplaneSpeed = 296;
		System.out.println("비행기 속도가 "+airplaneSpeed+" 입니다. 비행기가 적당한 양력을 얻었다고 가정하고..");
		airplaneSuitableLift = true;
		System.out.println("양력이 "+airplaneSuitableLift+"입니다.");
		return airplaneSuitableLift;
	}
	
	// 이륙을 합니다. 
	public String takeOff() {
		System.out.println("이륙 시도..");
		airplaneState = "비행";
		System.out.println("비행기 상태가 ["+airplaneState+"] 입니다.");
		airplaneAltitude = 1000;				
		System.out.println("비행기 고도는 ["+airplaneAltitude+"] 입니다.");
		return airplaneState;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	public String wheelIntoBody() {
		wheelState = "바퀴숨김";
		System.out.println("비행기 바퀴는 ["+wheelState+"] 상태 입니다.");
		return wheelState;
	}
}
