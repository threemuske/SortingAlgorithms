class InsertionSort {
  void insertionSort(int numbers[]) {
    int size = numbers.length;
    for (int i = 1; i < size; ++i) {
      int key = numbers[i];
      int j = i - 1;
      while (j >= 0 && numbers[j] > key) {
        numbers[j + 1] = numbers[j];
        j = j - 1;
      }
      numbers[j + 1] = key;
    }
  }
}
