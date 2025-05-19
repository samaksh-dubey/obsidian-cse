Utilize two logics
1. partition logic to return the pivot index (p)
2. sort logic to recurssively call sort on low, p-1 and p to high

```java
  static void sort(int[] arr, int low, int high) {
    if (high <= low)
      return;

    int pivot = partition(arr, low, high);
    sort(arr, low, pivot - 1);
    sort(arr, pivot, high);
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low - 1, j = high + 1;

    while(true) {
      do {
        i++;
      } while (arr[i] < pivot);

      do {
        j--;
      } while (arr[j] > pivot);

      if (i >= j)
        return j;

      swap(arr, i, j);
    }
  }

  static void swap(int[] arr, int i , int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[i] = temp;
  }
```