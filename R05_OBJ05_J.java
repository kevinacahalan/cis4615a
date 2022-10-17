// https://wiki.sei.cmu.edu/confluence/display/java/OBJ05-J.+Do+not+return+references+to+private+mutable+class+members

// good code
public Date getDate() {
  return (Date)d.clone();
}
