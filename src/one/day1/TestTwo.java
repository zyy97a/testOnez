package one.day1;

import java.lang.reflect.Method;

public class TestTwo {

    public static void main(String[] args) {
        try {
            //1����ȡStudent������ֽ���
            Class clazz = Class.forName("one.day1.Student");

            //2����ȡmain����
            Method methodMain = clazz.getMethod("main", String[].class);//��һ���������������ƣ��ڶ��������������βε����ͣ�
            //3������main����
            // methodMain.invoke(null, new String[]{"a","b","c"});
            //��һ���������������ͣ���Ϊ������static��̬�ģ�����Ϊnull���ԣ��ڶ���������String���飬����Ҫע����jdk1.4ʱ�����飬jdk1.5֮���ǿɱ����
            //������ʱ��  new String[]{"a","b","c"} ���3�����󡣡���������Ҫ����ǿת��
            methodMain.invoke(null, (Object)new String[]{"a","b","c"});//��ʽһ
            // methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//��ʽ��

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
