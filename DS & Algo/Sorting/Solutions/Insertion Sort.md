Logic:
1. Array divided into two parts - sorted + unsorted denoted by single pointer unsorted
2. Take first element of unsorted part and insert it into the right position in sorted part (This happens inside a nested loop)
3. Increment unsorted pointer

Code:
```
sort(int[] array, int length) {
	for (int unsorted = 0; unsorted < length; unsorted++) {
		int val = array[unsorted];
		int current = unsorted - 1;
		
		while(current >= 0 && array[current] > val) {
			array[current + 1] = array[current];
			current--;
		}
	}
}
```