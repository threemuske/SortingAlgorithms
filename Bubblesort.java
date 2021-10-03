class Bubblesort {
   void bubbleSort(int numbers[], int size) {
    int i, j, t;
    boolean isSwapped;
    for (i = 0; i < size - 1; i++) {
      isSwapped = false;
      for (j = 0; j < size - i - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          t = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = t;
          isSwapped = true;
        }
      }
      if (isSwapped == false)
        break;
    }
  }
}
