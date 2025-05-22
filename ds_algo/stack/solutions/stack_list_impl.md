Stack has 3 functions:
1. push(int key)
2. pop(int key)
3. peek(int key)

```java
class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class Stack {
  Node top;
  int size;

  boolean isEmpty() {
    return top == null;
  }

  int size() {
    return size;
  }

  void push(int key) {
    Node node = new Node(key);
    node.next = top;
    top = node;
    size++;
  }

  int peek() {
    if (isEmpty())
      throw Exception("Underflow");
    
    return top.val;
  }

  int pop() {
    if (isEmpty())
      throw Exception("Underflow");

    int val = top.val;
    top = top.next;
    size--;
    return val;
  }
}
```