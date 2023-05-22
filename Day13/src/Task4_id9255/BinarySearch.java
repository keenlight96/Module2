package Task4_id9255;

public class BinarySearch {

    public static int search(int[] list, int number) {
        int low = 0;
        int high = list.length - 1;
        int index = -1;
        while (high > low) {
            index = (high + low) / 2;
            if (list[index] == number)
                return index;
            else if (number > list[index])
                low = index + 1;
            else
                high = high - 1;

        }
        return index;
    }
}
