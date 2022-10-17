// https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution

// bad code:
class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;
 
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
