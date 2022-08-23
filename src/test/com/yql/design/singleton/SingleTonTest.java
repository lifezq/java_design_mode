package com.yql.design.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Package com.yql.design
 * @ClassName SingleTonTest
 * @Description TODO
 * @Author Ryan
 * @Date 2022/8/12
 */
public class SingleTonTest {

    public static void main(String[] args) {
        SingleTon singleTon;
        for (int i = 0; i < 10; i++) {
            singleTon = SingleTon.getInstance();
            System.out.println(System.identityHashCode(singleTon));
        }
    }

    @Test
    public void testSingleton() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingleTon instance1 = constructor.newInstance();
        SingleTon instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testSingleton2() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Field field = SingleTon.class.getDeclaredField("reflectLabel");
        field.setAccessible(true);

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingleTon instance1 = constructor.newInstance();

        field.setBoolean(instance1, false); // 此时单例再次被破坏
        SingleTon instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testSingleton3() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SingleTon instance1 = EnumSingle.getInstance();
        SingleTon instance2 = EnumSingle.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testSingleton4() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    SingleTon instance = EnumSingle.getInstance();
                    System.out.println(instance);
                } catch (NoSuchMethodException | InvocationTargetException |
                        InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Test
    public void testSingleton5() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SingleTon instance1 = EnumSingle.getInstance();
        Constructor<EnumSingle> constructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingle enumSingle = constructor.newInstance();//IllegalArgumentException: Cannot reflectively create enum objects
        SingleTon instance2 = enumSingle.getMyInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

    @Test
    public void testSingleton6() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Person> person1 = Person.class.getDeclaredConstructor(null);
        person1.setAccessible(true);
        Person instance1 = person1.newInstance();
        Constructor<Person> person2 = Person.class.getDeclaredConstructor(null);
        person2.setAccessible(true);
        Person instance2 = person2.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
