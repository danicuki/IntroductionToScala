void swap(int* a, int* b)
{
    int tmp;
    tmp = *a;
* a = *b;
* b = tmp;
}

int partition(int vec[], int left, int right)
{
    int i, j;

    i = left;
    for (j = left + 1; j <= right; ++j)
    {
        if (vec[j] < vec[left])
        {
            ++i;
            swap(&vec[i], &vec[j]);
        }
    }
    swap(&vec[left], &vec[i]);

    return i;
}

void quickSort(int vec[], int left, int right)
{
    int r;

    if (right > left)
    {
        r = partition(vec, left, right);
        quickSort(vec, left, r - 1);
        quickSort(vec, r + 1, right);
    }
}
