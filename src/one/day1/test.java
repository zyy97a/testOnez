package one.day1;

import java.lang.reflect.Field;

public class test {


    public static void main(String[] args) throws Exception {
        //1.��ȡClass����
        Class stuClass = Class.forName("one.day1.syx");
        //2.��ȡ�ֶ�
        System.out.println("************��ȡ���й��е��ֶ�********************");
        Field[] fieldArray = stuClass.getFields();
        for(Field f : fieldArray){
            System.out.println(f);
        }
        System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");
        fieldArray = stuClass.getDeclaredFields();
        for(Field f : fieldArray){
            System.out.println(f);
        }
        System.out.println("*************��ȡ�����ֶ�**������***********************************");
        Field f = stuClass.getField("name");
        System.out.println(f);
        //��ȡһ������
        Object obj = stuClass.getConstructor().newInstance();//����Student����--��Student stu = new Student();
        //Ϊ�ֶ�����ֵ
        f.set(obj, "����ܰ");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"
        //��֤
        syx stu = (syx)obj;
        System.out.println("��֤������" + stu.name);


        System.out.println("**************��ȡ˽���ֶ�****������********************************");
        f = stuClass.getDeclaredField("phoneNum");
        System.out.println(f);
        f.setAccessible(true);//�������䣬���˽���޶�
        f.set(obj, "18888889999");
        System.out.println("��֤�绰��" + stu);

    }
}
