// Rule 05. Object Orientation (OBJ)
// OBJ01-J. Limit accessibility of fields

private static final String[] items = {/* ... */};

public static final String getItem(int index) {
  return items[index];
}

public static final int getItemCount () {
  return items.length;
}

// Compliant :)
