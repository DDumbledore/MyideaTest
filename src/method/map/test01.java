package method.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName test01
 * @Description
 * @Author 卡布达丶
 * @Date 2021/8/25 1:47
 * @Version 1.0
 */

//  测试一下map取出之后直接修改,集合中的值会不会变
public class test01 {
    public static void main(String[] args) {
        //String 类型的不会改,因为是重新生成的String对象
        Map<String, String> map = new HashMap<>();
        map.put("1","石原里美");
        map.put("2","杨幂");
        // 获取杨幂的值
        String string = map.get("2");
        string = "迪迦";
        for (String value : map.values()) {
            System.out.println(value);
            /*石原里美
            杨幂*/
        }
        System.out.println("-----------------------------");
        // 引用数据类型会改变
        Map<String, Student> map01 = new HashMap<>();
        map01.put("1",new Student("id01","石原里美"));
        map01.put("2",new Student("id01","石原里美"));
        Student student = map01.get("2");
        student.setName("迪迦");
        for (Student value : map01.values()) {
            System.out.println(value);
        }
        System.out.println(System.currentTimeMillis());
        /*Student{ID='id01', name='石原里美'}
        Student{ID='id01', name='迪迦'}*/

    }
}
