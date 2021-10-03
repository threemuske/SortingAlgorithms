class BucketSort {
  static int getMaxVal(int numbers[], int size) {
    int maxim = numbers[0];
    for (int i = 1; i < size; i++)
        if (numbers[i] > maxim)
            maxim = numbers[i];
    return maxim;
  }

  static void bucketSort(int numbers[], int size, int exponen) {
    int output[] = new int[size];
    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);
    for (i = 0; i < size; i++)
        count[(numbers[i] / exponen) % 10]++;
    for (i = 1; i < 10; i++)
        count[i] += count[i - 1];

    for (i = size - 1; i >= 0; i--) {
      output[count[(numbers[i] / exponen) % 10] - 1] = numbers[i];
      count[(numbers[i] / exponen) % 10]--;
    }

    for (i = 0; i < size; i++)
        numbers[i] = output[i];
  }

  static void bucketSort(int numbers[], int size) {
    int m = getMaxVal(numbers, size);
    for (int exp = 1; m / exp > 0; exp *= 10)
        bucketSort(numbers, size, exp);
  }
}
