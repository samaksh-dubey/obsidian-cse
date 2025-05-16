1. Divide array into two parts = sorted + unsorted
2. Find smallest element position in unsorted array
3. Swap first element with smallest element in unsorted array
4. Increment unsorted array

```java
  static void sort(int arr[], int length) {
    for(int unsrtStart = 0; unsrtStart < length; unsrtStart++) {
      int minIndex = findMinIndex(arr, unsrtStart, length - 1);
      swap(arr, unsrtStart, minIndex);
    }
  }

  static int findMinIndex(int[] arr, int left, int right) {
    int minIndex = left;
    for (int i = left; i <= right; i++) {
      if (arr[minIndex] > arr[i]) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
```