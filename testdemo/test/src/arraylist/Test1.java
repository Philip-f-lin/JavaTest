package arraylist;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("heima001", "張三", "123");
        Student s2 = new Student("heima002", "李四", "456");
        Student s3 = new Student("heima003", "王五", "789");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Integer i = getIndex(list, "heima004");
        System.out.println(i);

    }

    public static Integer getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String realId = s.getId();
            if(realId.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
