package model;

public class OperatorPerson
{

	private String name;
	private int lifePoint;
	private	int ammo;
	
	public OperatorPerson(int i) {
		
	}

	public OperatorPerson()
	{
		// TODO Auto-generated constructor stub
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
