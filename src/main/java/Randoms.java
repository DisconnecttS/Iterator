import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected List list = new ArrayList<>();
    protected int next = 0;
    public Randoms(int min, int max) {
        int x = random.nextInt(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {


        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                if (list.size() > next) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {

                return null;
            }
        };
    }

    //...
}
