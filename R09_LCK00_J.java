// Rule.09 Locking (LCK)
// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

public class SomeObject {
  private static final Object lock = new Object(); 

  public static void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}

// Compliant :)
