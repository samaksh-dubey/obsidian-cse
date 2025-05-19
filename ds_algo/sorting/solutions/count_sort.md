1. store frequency of element(i) in an array at in index(i)
2. calculate the starting position of element(i) in the array
3. traverse original array annd store the array[i] and increase the position by 1

```java
  static void sort(int[] arr, int n, int max) {
    int[] output = new int[n];
    int[] freq = new int[max + 1];
    for(int i = 0; i < n; i++) {
      freq[arr[i]]++;  
    }

    int total = 0;
    for (int i = 0; i < max + 1; i++) {
      int oldCount = freq[i];
      freq[i] = total;
      total = total + oldCount;
    }

    for (int i: arr) {
      output[freq[i]] = i;
      freq[i]++;
    }

    for(int i = 0; i < n; i++) {
      arr[i] = output[i];
    }
  }
```