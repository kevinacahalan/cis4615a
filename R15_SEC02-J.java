// https://wiki.sei.cmu.edu/confluence/display/java/SEC02-J.+Do+not+base+security+checks+on+untrusted+sources

// bad code
public RandomAccessFile openFile(final java.io.File f) {
  askUserPermission(f.getPath());
  // ...
  return (RandomAccessFile)AccessController.doPrivileged(new PrivilegedAction <Object>() {
    public Object run() {
      return new RandomAccessFile(f, f.getPath());
    }
  });
}
