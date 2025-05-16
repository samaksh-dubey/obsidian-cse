Logic:
1. Array divided into two parts - sorted + unsorted denoted by single pointer unsorted
2. Take first element of unsorted part and insert it into the right position in sorted part (This happens inside a nested loop and right after this loop)
3. Increment unsorted pointer

Piecewise Code:
```java
  static void sort(int[] arr, int len) {
    for (int unsorted = 1; unsorted < len; unsorted++) {
      int val = arr[unsorted];
      int index = findIndexInSortedArray(arr, val, 0, unsorted);
		  shiftRight(arr, index, unsorted);
		  arr[index] = val;
    }
  }

  static int findIndexInSortedArray(int[] arr, int val, int left, int right) {
    int found = right;
    while (right > left && arr[right-1] > val) {
      found = right - 1;
      right--;
    }
    return found;
  }

  static void shiftRight(int[] arr, int left, int right) {
    while (right > left) {
      arr[right] = arr[right-1];
      right--;
    }
  }
```

Unified Code:
```java
  
```