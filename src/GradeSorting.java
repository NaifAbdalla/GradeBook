public class GradeSorting {

    static int partition(double array[], int low, int high) {

        double pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                i++;

                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    public static void Sort(double[] array, int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);

            Sort(array, low, pi - 1);

            Sort(array, pi + 1, high);
        }
    }

}
