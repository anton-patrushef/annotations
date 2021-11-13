import java.lang.reflect.InvocationTargetException;

public class Executor {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        AnnotationProcessor ap = new AnnotationProcessor();

        ap.process("ru.levelup");
//       ap.process("ru.levelup.package2");

    }
}
