import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");

        System.out.println(coll.contains("aaa"));
    }
}
