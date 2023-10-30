import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*  List系列集合的五種遍歷方式：
            1.迭代器
            2.列表迭代器
            3.增強for
            4.Lambda表達式
            5.普通for循環*/

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/

        /*for (String s : list) {
            System.out.println(s);
        }*/

        //list.forEach(s -> System.out.println(s));

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String s = it.next();
            if("bbb".equals(s)){
                it.add("qqq");
            }

        }
        System.out.println(list);
    }
}
