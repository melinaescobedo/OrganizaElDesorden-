/*
@Authors:
    Melina Escobedo 		    164094
    Victor A. Canales 		    162329
    David F. Rosas 		    163031
    Rodrigo Campos 		    163962
*/

public abstract class Character {
    WeaponBehavior weapon;
    MovementBehavior movement;
	Strong strong;
	Velocity velocity;
	Intelligence intelligence;
	Health health; 
  
    public abstract void fight();
    
    public void showCharacter(){
        fight();
        weapon.useWeapon();
        movement.move();
    }
  
    public void setWeaponBehavior(WeaponBehavior wB){
  	weapon = wB;
    }
    public void setMovementBehavior(MovementBehavior mB){
  	movement = mB;
    }
    
}
