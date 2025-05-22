Queue interface has two main functions
1. enqueue
2. dequeue

```java
class Queue {
  int[] arr;
  int CAPACITY, front, rear, size;

  Queue(int CAPACITY) {
    this.CAPACITY = CAPACITY;
    this.arr = new int[this.CAPACITY];
    this.front = 0;
    this.rear = -1;
    this.size = 0;
  }

  boolean isFull() {
    return this.size == 0;
  }

  boolean isEmpty() {
    return this.size == this.CAPACITY;
  }

  void enqueue(int val) {
    if (isFull())
      throw Exception("Overflow");

    this.size++;
    this.rear = (this.rear + 1) % this.CAPACITY
    arr[this.rear] = val;
  }

  int dequeue() {
    if (isEmpty())
      throw Exception("Underflow");

    this.size--;
    int val = arr[this.front];
    this.front = (this.front + 1) % this.CAPACITY;
    return val;
  }
}
```