Logic:
1. Array divided into two parts - sorted + unsorted
2. Take first element of unsorted part and insert it into the right position in sorted part
3. Increment sorted pointer and unsorted pointer

Code:
```
sort(int[] array, int length) {
	for (int unsorted = 0; unsorted < length; unsorted++) {
		int current = unsorted;
		while(current - 1 >= 0 && array[current - 1] > array[current]) {
			swap(array, current, current -1);
			current--;
		}
	}
}
```