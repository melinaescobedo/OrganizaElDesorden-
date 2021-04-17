public class Test {
    public static void main (String args []){
        Character king, troll, queen, knight;
        
        king = new King();
        troll = new Troll();
        queen = new Queen();
        knight = new Knight();
        
        knight.setWeaponBehavior(new KnifeBehavior());
        troll.setMovementBehavior(new RunBehavior());
        king.showCharacter();
        troll.showCharacter();
        queen.showCharacter();
        knigth.showCharacter();
    }
}