public class Monster{
  public int health = 15;

  public boolean isAlive(){
    if (health > 0){
      return true;
    }
    return false;
  }
  
  public int attack(being){
    being.health -= 3;
    return 3;
  }
}
