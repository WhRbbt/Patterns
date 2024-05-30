package CodeSmells.Lab5.Part3.Task4;

public class RemoveControlFlag {
    public void searchElement(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}
