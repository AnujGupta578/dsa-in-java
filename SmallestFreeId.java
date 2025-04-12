import java.lang.reflect.Array;

public class SmallestFreeId {

    public static void main(String[] args) {

        int[] arr = new int[] {3, 0, 1, 2, 5};

        int missingNumber = findSmallestFreeId(arr);
        System.out.println("FreeId: " + missingNumber);
    }

    public static int findSmallestFreeId(int[] array) {

        int smallestId = 0;
        boolean found = false;

        while(!found) {

            for (int i = 0; i < array.length; i++) {

                if(array[i] == smallestId) {
                    found = false;
                    break;
                } else {
                    found = true;
                }
            }
            if(!found) {
                smallestId++;

            }
        }
      return smallestId;
    }
}
