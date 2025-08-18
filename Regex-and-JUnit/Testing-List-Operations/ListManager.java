import java.util.List;

public class ListManager {

    // Add element to the list
    public void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    // Remove element from the list
    public void removeElement(List<Integer> list, int element) {
        if (list != null) {
            list.remove(Integer.valueOf(element));
        }
    }

    // Get size of the list
    public int getSize(List<Integer> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
