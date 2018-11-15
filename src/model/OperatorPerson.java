package model;

public class OperatorPerson
{

	private String name;
	private int lifePoint;
	private	int ammo;
	
	public OperatorPerson(String name, int lifePoint, int ammo) {
		
		this.name = name;
		this.lifePoint = lifePoint;
		this.ammo = ammo;
		
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public void getLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	
	public int lifePoint() {
		return lifePoint;
	}
	
	public void getAmmo(int ammo) {
		this.ammo = ammo;
	}
	
	public int ammo() {
		return ammo;
	}
}
