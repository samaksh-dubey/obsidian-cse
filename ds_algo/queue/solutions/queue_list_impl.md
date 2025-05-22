Utilize two pointers; front and rear


```java
class Queue {
  Node front, rear;
  int size;

  Queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  isEmpty() {
    return front == null;
  }

  void enqueue(int val) {
    Node node = new Node(val);
    if (isEmpty()) {
      this.front = this.rear = node;
    } else {
      this.rear.next = node;
      this.rear = this.rear.next;
    }
    this.size++;
  }

  int dequeue() {
    if(isEmpty())
      throw Exception("Underflow");
    
    int val = this.front.val;
    this.front = this.front.next;
    this.size--;
    return val;
  }
}
```