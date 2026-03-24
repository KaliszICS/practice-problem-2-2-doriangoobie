import java.util.*;
public class PracticeProblem {

public static void main(String args[]) {

}

    public static int[] compareSearch(int[] array, int number) {
        int[] x = new int[2];
        x[0] = -1;
        x[1] = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                x[0] = i + 1;
                break;
            }
        }
        if (x[0] == -1) {
            x[0] = array.length;
        }
        
        int loops = 1;
        int min = 0;
        int max = array.length - 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        Collections.sort(list);
        while (max >= min) {
            int mid = (max+min)/2;
            if (list.get(mid) == number) {
                x[1] = loops;
                break;
            } 
            else if (list.get(mid) > number) {
                max = mid - 1;
            } 
            else {
                min = mid + 1;
            }
        loops++;
        }
    if (x[1] == -1) {
        x[1] = loops - 1;
    }
return x;
}
    public static int[] compareStringSearch(String[] array, String word) {
        int[] x = new int[2];
        x[0] = -1;
        x[1] = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                x[0] = i + 1;
                break;
            }
        }
        if (x[0] == -1) {
            x[0] = array.length;
        }
        int loops = 1;
        int min = 0;
        int max = array.length - 1;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        while (max >= min) {
            int mid = (max+min)/2;
            if (list.get(mid).equals(word)) {
                x[1] = loops;
                break;
            } 
            else if (list.get(mid).compareTo(word) > 0) {
            max = mid - 1;
        } 
        else {
            min = mid + 1;
        }
        loops++;
        }
        if (x[1] == -1) {
            x[1] = loops - 1;
        }
        return x;
    }  
}
