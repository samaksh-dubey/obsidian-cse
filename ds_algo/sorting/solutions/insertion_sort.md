Logic:
1. Array divided into two parts - sorted + unsorted denoted by single pointer unsorted
2. Take first element of unsorted part and insert it into the right position in sorted part (This happens inside a nested loop and right after this loop)
3. Increment unsorted pointer

Code:
```java
sort(int[] arr, int leng) {
  for (int unsorted = 0; unsorted < len; unsorted++) {
    // hold first element of unsorted array
    int val = arr[unsorted];
    
    // initialize the last index of sorted array
    int indexToInsert = unsorted - 1;
    
    // shift elements in sorted array till element is greater than first element of unsorted array.
    while(indexToInsert >= 0 && arr[indexToInsert] > val) {
      arr[indexToInsert + 1] = arr[indexToInsert];
      indexToInsert--;
    }
    
    // put val of first element of unsorted array in the indexToInset
    arr[indexToInsert] = val;
  }
}
```
