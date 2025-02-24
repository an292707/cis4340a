// Rule.09 Locking (LCK)
// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

public class SomeObject {
  //changeValue locks on the class object's monitor  
  public static synchronized void changeValue() {
    // ...
  }
}

// Untrusted code
synchronized (SomeObject.class) {
  while (true) {
    Thread.sleep(Integer.MAX_VALUE); // Indefinitely delay someObject
  }
}
