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