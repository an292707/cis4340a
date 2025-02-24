// Rule 01. Declarations and Initialization (DCL)
// DCL00-J. Prevent class initialization cycles

class A {
  public static int a = B.b();
}

class B {
  public static int b() { return A.c(); }
  public static int c() { return 1; }
}

// Compliant :) (including fixing some typos)
