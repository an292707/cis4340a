// Rule 08. Visibility and Atomicity (VNA)
// VNA02-J. Ensure that compound operations on shared variables are atomic

final class Adder {
  private final AtomicInteger a = new AtomicInteger();
  private final AtomicInteger b = new AtomicInteger();

  public int getSum() {
    return a.get() + b.get();
  }

  public void setValues(int a, int b) {
    this.a.set(a);
    this.b.set(b);
  }
}
