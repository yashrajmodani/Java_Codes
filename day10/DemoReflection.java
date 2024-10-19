//package day10;
//
//import javax.crypto.SecretKey;
//import java.lang.reflect.*;
//import java.util.Arrays;
//
//public class DemoReflection {
//    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//        Student s = new Student();
//        Class c = s.getClass();
//
//        Field[] fields = c.getDeclaredFields();
//        for (Field field : fields)
//        {
//            System.out.println(field.getName());
//            System.out.println(field.getType());
//            if(field.getName().equals("rollNo"))
//            {
//                field.setAccessible(true);
//                field.setInt(s,110);
//            }
//            if(field.getName().equals("name"))
//            {
//                field.setAccessible(true);
//                field.set(s,"sss");
//            }
//        }
//        Constructor [] cons = c.getDeclaredConstructors();
//        for (Constructor con :cons)
//        {
//            System.out.println(con.getParameterCount());
//            if(con.getParameterCount()==2)
//            {
//                Parameter[] param = con.getParameters();
//                System.out.println(Arrays.toString(param));
//                Student s1 = (Student) con.newInstance(235,"mmmm");
//                s1.displayData();
//            }
//        }
//        Method [] methods = c.getDeclaredMethods();
//        for(Method m: methods)
//        {
//            System.out.println(m.getName());
//            if(m.getName().equals("privateMethod"))
//            {
//                m.setAccessible(true);
//                m.invoke(s);
//            }
//            if(m.getName().equals("staticMethod"))
//            {
//                m.invoke(null);
//            }
//            if(m.getName().equals("methodWithParam"))
//            {
//                Parameter[] param = m.getParameters();
//                System.out.println(Arrays.toString(param));
//                m.invoke(s,456,"ttt");
//            }
//
//        }
//
//        for(Method m: methods){
//            if(m.getDeclaredAnnotations(CreatedBy.class)!=null)
//            {
//                CreatedBy anno = m.getDeclaredAnnotations(CreatedBy.class);
//                if(anno.priority() == 1)
//                {
//                    m.invoke(s);
//                }
//            }
//        }
//
//
//
//
//    }
//}
