import annotation.ReflectionClass;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import java.lang.reflect.InvocationTargetException;


public class AnnotationProcessor {

    public void process(String packageName) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {

        try (ScanResult scanResult = new ClassGraph()
                .whitelistPackages(packageName)
                .scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {

                Class<?> annotatedClass = Class.forName(classInfo.getName());
                ReflectionClass reflectionClass = annotatedClass.getAnnotation(ReflectionClass.class);

                if (reflectionClass != null) {
                    Class cl = Class.forName(classInfo.getName());
                    Object o = cl.getDeclaredConstructor().newInstance();
                    System.out.println(o.toString());
                }
            }
        }
    }
}

