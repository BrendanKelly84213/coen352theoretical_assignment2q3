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
    private static void flip2( int[]x , int a, int b ) {
        if (a <= b) {
        }
    }

    public static void print(int[] x) {
        for ( int i : x ) {
            System.out.print(i);
        }
        System.out.println();
    }

}// Class ReverseArray
