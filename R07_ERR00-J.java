// https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions

// bad code:
try {
  //...
} catch (IOException ioe) {
  ioe.printStackTrace();
}