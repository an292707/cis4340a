// Rule 08. Visibility and Atomicity (VNA)
// VNA02-J. Ensure that compound operations on shared variables are atomic

final class Adder {
  private int a;
  private int b;

  public synchronized int getSum() {
    // Check for overflow
    return a + b;
  }

  public synchronized void setValues(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

// Compliant :)
