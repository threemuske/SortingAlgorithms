class MergeSort
{
  void merge(int numbers[], int left, int middle, int right)
  {

    int firstNum = middle - left + 1;
    int secondNum = right - middle;

    int tempLeftNums[] = new int[firstNum];
    int tempRightNums[] = new int[secondNum];

    for (int i = 0; i < firstNum; ++i)
      tempLeftNums[i] = numbers[left + i];
    for (int j = 0; j < secondNum; ++j)
      tempRightNums[j] = numbers[middle + 1 + j];

    int i = 0, j = 0;
    int k = left;
    while (i < firstNum && j < secondNum) {
      if (tempLeftNums[i] <= tempRightNums[j]) {
        numbers[k] = tempLeftNums[i];
        i++;
      }
      else {
        numbers[k] = tempRightNums[j];
        j++;
      }
      k++;
    }
    while (i < firstNum) {
      numbers[k] = tempLeftNums[i];
      i++;
      k++;
    }
    while (j < secondNum) {
      numbers[k] = tempRightNums[j];
      j++;
      k++;
    }
  }

  void mergeSort(int numbers[], int left, int right)
  {
    if (left < right) {
      int m =left+ (right-left)/2;
      mergeSort(numbers, left, m);
      mergeSort(numbers, m + 1, right);
      merge(numbers, left, m, right);
    }
  }
}

