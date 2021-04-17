/*
@Authors:
	Melina Escobedo 			164094
    Victor A. Canales 		    162329
    David F. Rosas 				163031
    Rodrigo Campos 				163962
*/

// FANTASY CHARACTERS //

public abstract class Character{
	WeaponBehavior weapon;
	Strong strong;
	Velocity velocity;
	Intelligence intelligence;
	Health health;
  
  public Character(){
  }
  
  public abstract void fight(){
  }
  
  public abstract void setWeapon(){
  }
  
  public abstract void setMove(){
  }
  
}


public class King extends Character{
	@Override
  public void fight(){
  	
  }
}

public class Queen extends Character{
	@Override
  public void fight(){
  	
  }
}

public class Knight extends Character{
	@Override
  public void fight(){
  	
  }	
}

public class Troll extends Character{
		@Override
  public void fight(){
  	
  }
}


// M O V E S //
public interface CharacterMovement{
	public void moveCharacter();
}

public class chestToEarthMovement extends CharacterBehavior{
	@Override
	public void moveCharacter(){
  	System.out.println("I'm underground!");
  }
}
  
  public class SpeedMovement extends CharacterBehavior{
	@Override
	public void moveCharacter(){
  	System.out.println("I start running with super speed!");
  }
}
  
public class WalkingMovement extends CharacterBehavior{
	@Override
	public void moveCharacter(){
  	System.out.println("I start walking");
  }
}

public class RunningMovement extends CharacterBehavior{
	@Override
	public void moveCharacter(){
  	System.out.println("I start running");
  }
}


// W E A P O N S //
public interface WeaponBehavior{
	public void useWeapon();
}

public class KnifeBehavior extends WeaponBehavior{
	@Override
	public void useWeapon(){
  	System.out.println("I'm using the knife");
  }
}

public class AxeBehavior extends WeaponBehavior{
	@Override
	public void useWeapon(){
  	System.out.println("I'm using the axe");
  }
}
public class SwordBehavior extends WeaponBehavior{
	@Override
	public void useWeapon(){
  	System.out.println("I'm using the sword");
  }
}

public class BowAndArrowBehavior extends WeaponBehavior{
	@Override
	public void useWeapon(){
  	System.out.println("I'm using the bow and arrow");  
  }
}