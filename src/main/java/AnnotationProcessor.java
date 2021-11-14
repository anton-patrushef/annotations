import annotation.RandomInt;
import annotation.ReflectionClass;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class AnnotationProcessor {

    public void ReflectionClassProcess(String packageName) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {

        try (ScanResult scanResult = new ClassGraph()
                .whitelistPackages(packageName)
                .scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {

                Class<?> classFromPackage = Class.forName(classInfo.getName());
                ReflectionClass annotatedClass = classFromPackage.getAnnotation(ReflectionClass.class);

                if (annotatedClass != null) {
                    Class cl = Class.forName(classInfo.getName());
                    Object o = cl.getDeclaredConstructor().newInstance();
                    System.out.println(o.toString());
                }
            }
        }
    }


    public void randomIntProcess(String packageName) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException  {

        try (ScanResult scanResult = new ClassGraph()
                .whitelistPackages(packageName)
                .scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {
                Class<?> classFromPackage = Class.forName(classInfo.getName());

                Field[] fields = classFromPackage.getDeclaredFields(); //getClass().getDeclaredFields();
                for (Field field : fields) {
                    RandomInt annotation = field.getAnnotation(RandomInt.class);

                    if (annotation != null) {

                        if(!field.getType().toString().equals("int")){
                            throw new java.lang.RuntimeException("this is not int field");
                        }

                        Object o = classFromPackage.getDeclaredConstructor().newInstance();

                        field.setAccessible(true);
                        field.set(o, RandInt.randInt(annotation.minValue(), annotation.maxValue()));
                        System.out.println(o.toString());
                    }
                }
            }
        }
    }
}

