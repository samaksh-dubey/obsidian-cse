```java
class MinStack {
  Stack stack;
  int min;

  MinStack() {
    this.stack = new Stack();
  }

  boolean isEmpty() {
    return this.stack.isEmpty();
  }

  boolean isFull() {
    return this.stack.isFull();
  }

  int size() {
    return this.stack.size();
  }

  void push(int val) {
    if (isEmpty()) {
      this.stack.push(val);
      this.min = val;
    } else if (this.min < val) {
      this.stack.push(val);
    } else {
      this.stack.push(2 * val - this.min);
      this.min = val;
    }
  }

  int peek() {
    if (min < this.stack.peek())
      return this.stack.peek();
    else
      return this.min;
  }

  int pop() {
    if (min > this.stack.peek()) {
      int val = this.min;
      this.min = 2 * this.min - this.stack.pop();
      return val;
    } else {
      return this.stack.pop();
    }
  }

  int min() {
    if(isEmpty()) {
      throw Exception("Underflow");
    }

    return this.min;
  }
}
```