
import java.util.Queue;
import java.util.LinkedList;
public class QueueImplement {
    public static void main(String[] args) {
        Queue<String> color = new LinkedList<>();
        color.add("Red");
        color.add("Black");
        color.add("Green");
        color.add("Yellow");
        System.out.println("Elements in queue before deletion:"+color);
        color.remove();
        System.out.println("The element in queue after deletion:"+color);
        String head= color.peek();
        System.out.println("The head of the queue:"+head);
        System.out.println("The number of elements in queue after deletion:"+color);
        System.out.println(color.hashCode());

    }


}
