Stack has 3 functions:
1. push(int key)
2. pop(int key)
3. peek(int key)

```java
class Stack {
  int[] arr;
  int SIZE, top;

  Stack(int SIZE) {
    this.SIZE = SIZE;
    top = -1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  boolean isFull() {
    return top + 1 == SIZE;
  }

  int size() {
    return top + 1;
  }

  void push(int key) {
    if (isFull())
      throw Exception("Overflow");
    
    arr[++top] = key;
  }

  int peek() {
    if (isEmpty())
      throw Exception("Underflow");
    
    return arr[top];
  }

  int pop() {
    if (isEmpty())
      throw Exception("Underflow");

    return arr[top--];
  }
}
```