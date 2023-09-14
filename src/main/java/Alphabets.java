import java.util.Iterator;
import java.util.concurrent.*;

public class Alphabets {
    public static void main(String[] args) {
        BlockingQueue<String> alph = new LinkedBlockingDeque<String>();
        alph.add(" A ");
        alph.add(" B ");
        alph.add(" C ");
        alph.add(" D ");
        alph.add(" E ");
        System.out.println(" The contents of the Linked Blocking Queue is : ");
        System.out.println(alph);
        if (alph.contains(" C ")) System.out.println(" Element C successfully founded in the queue ");
        else System.out.println(" No such element exists in the queue. ");
        String top = alph.element();
        System.out.println(" The top element of the queue is : " + top);
        alph.remove(" Y ");
        System.out.println(" The content of the LinkedBlockingDeque after removing elements is : ");
        System.out.println(alph);
        Iterator<String> alphIter = alph.iterator();
        System.out.println(" The content of the Linked Blocking Deque is : ");
        for (int i = 0; i < alph.size(); i++) {
            System.out.print(alphIter.next() + " ");
        }
    }
}