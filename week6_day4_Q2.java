import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        Set<Integer> common = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set2.add(arr2[i]);
        }
        for (int i = 0; i < n3; i++) {
            int elem = arr3[i];
            if (set1.contains(elem) && set2.contains(elem)) {
                common.add(elem);
            }
        }

        int[] result = new int[common.size()];
        int index = 0;
        for (int elem : common) {
            result[index++] = elem;
        }
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
