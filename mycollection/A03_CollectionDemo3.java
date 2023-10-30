import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*  collection系列集合三種通用的遍歷方式：
            1.迭代器遍歷
            2.增強for遍歷
            3.1ambda表達式遍歷

            迭代器遍歷相關的三個方法：
            Iterator<E> iterator()：取得一個選代器對象
            boolean hasNext ()：判斷目前指向的位置是否有元素
            E next()：取得目前指向的元素並移動指針
        */

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        /*Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        for(String s : coll){
            System.out.println(s);
        }

        coll.forEach(s -> System.out.println(s));


    }
}
