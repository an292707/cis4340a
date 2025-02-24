// Rule 01. Declarations and Initialization (DCL)
// DCL00-J. Prevent class initialization cycles

class A {
  public static int a = B.b();
  public static int c() { return 1; }
}

class B {
  publoc static int b() { return A.c(); }
