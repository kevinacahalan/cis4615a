// https://wiki.sei.cmu.edu/confluence/display/java/OBJ05-J.+Do+not+return+references+to+private+mutable+class+members

// bad code
class MutableClass {
  private Date d;
 
  public MutableClass() {
    d = new Date();
  }
 
  public Date getDate() {
    return d;
  }
}