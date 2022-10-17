// https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution

// bad code:

class GameWeapon implements Serializable {
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
