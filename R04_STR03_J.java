// https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string

// bad code
BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);