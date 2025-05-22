heap overview
1. heap has method add, poll, peek
2. any index i has children 2i+1 and 2i+2
3. any index i has parent (i-1)/2

```java
class Heap {
  Vector<Integer> vector;
  int capacity;

  Heap(int capacity) {
    this.vector = new Vector();
  }

  Heap(int[] arr) {
    this.vector = new Vector();

    for(int a: arr) {
      this.vector.addElement(a);
    }

    // Total time complexity O(n)
    int lastLeaf = size() - 1;
    int lastParent = parent(lastLeaf);
    for(int i = lastParent; i >= 0; i++) {
      heapifyDown(i);
    }
  }

  private int parent(int i) {
    return (i-1)/2;
  }

  private int left(int i) {
    return 2 * i + 1;
  }

  private int right(int i) {
    return 2 * i + 2;
  }

  private void swap(int x, int y) {
    int temp = this.vector.get(x);
    this.vector.setElementAt(this.vector.get(y), x);
    this.vector.setElementAt(temp, y);
  }

  public int size() {
    return this.vector.size();
  }

  public isEmpty() {
    return size() == 0;
  }

  private void heapifyDown(int i) {
    int left = left(i);
    int right = right(i);

    int smallest = i;

    if (left < size() && vector.get(left) < vector.get(smallest))
      smallest = left;

    if(right < size() && vector.get(right) < vector.get(smallest))
      smallest = right;

    if(smallest != i) {
      swap(smallest, i);
      heapifyDown(smallest);
    }    
  }

  private void heapifyUp(int i) {
    int parent = parent(i);
    
    if(i > 0 && vector.get(parent) > vector.get(i)) {
      swap(parent, i);
      heapifyUp(parent);
    }
  }

  public void add(int val) {
    vector.addElement(val);
    heapifyUp(size() - 1);
  }

  public int poll() {
    if (size() == 0)
      throw Exception("Underflow");

    int val = vector.firstElement();
    vector.setElementAt(vector.lastElement(), 0);
    vector.remove(size() -1);

    heapifyDown(0);

    return val;
  }

  public int peek() {
    if(size() > 0)
      return vector.get(0);
    throw Exception("Underflow");
  }
}
```