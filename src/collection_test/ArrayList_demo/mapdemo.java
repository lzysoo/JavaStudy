package collection_test.ArrayList_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapdemo {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<Student,String>();
        Student s1 = new Student("Tony",21);
        Student s2 = new Student("Lisa",18);
        map.put(s1,"666");
        map.put(s2,"888");
        //遍历1----根据键找值：1、先获取键的集合；2、遍历键的集合得到键；3、根据键到集合中去找值
        Set<Student> set = map.keySet();
        for(Student key:set){
            String value = map.get(key);
            System.out.println(key.getName()+"-"+key.getAge()+"-"+value);
        }

    }
}
