import java.lang.reflect.InvocationTargetException;

public class Executor {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        AnnotationProcessor ap = new AnnotationProcessor();

        ap.ReflectionClassProcess("ru.levelup"); //ReflectionClass
        ap.randomIntProcess("ru.levelup");
        ap.randomStringProcess("ru.levelup");

    }
}
