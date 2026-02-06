public class ReverseArray {
    public static void main(String[] args) {
        int[] x1 = {2,3,1,4};
        int[] x2 = {1,2,3,4,5};
        print(flip(x1)); // outputs {4,1,3,2}
        print(flip(x2)); // outputs {5,4,3,2,1}
    }

    // Reverse the elements in x and return that array:
    public static int[] flip(int[] x) {
        flip2(x, 0, x.length-1);
        return x;
    }

    // Reverse the elements in x in place, so do not create new arrays: private static void flip2( int[]x , int a, int b ) {
    // a = 0, b = 3
    // swap 0 and 2
    // swap 1 and 3
    // 2314 -> middleIndex = 2
    // 1324
    // 1423

    // a = 0, b = 1
    // 41 -> middleIndex = 1
    // swap 0 and 1
    //

    private static void flip2( int[]x , int a, int b ) {
        if (b - a <= 0) {
            return;
        }

        if (b - a == 1) {
            int temp = x[b];
            x[b] = x[a];
            x[a] = temp;
            return;
        }

        int length = b - a + 1;
        int middleIndex = a + length / 2;
        int oddCompensator = length % 2 == 0 ? 0 : 1;
        for (int i = 0; i < middleIndex; ++i) {
            int left = i + a;
            int right = middleIndex + i + oddCompensator;
            // swap
            int temp = x[right];
            x[right] = x[left];
            x[left] = temp;
        }

        flip2(x, a, middleIndex - 1);
        flip2(x, middleIndex + oddCompensator, b);
    }

    public static void print(int[] x) {
        for ( int i : x ) {
            System.out.print(i);
        }
        System.out.println();
    }

}// Class ReverseArray
