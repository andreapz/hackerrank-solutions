import java.lang.instrument.Instrumentation;

// m.txt
// Premain-Class: ObjectSizeFetcher
// 
// jar -cvfm ObjectSizeFetcher.jar m.txt *.class 
// jar tf ObjectSizeFetcher.jar 
// java -javaagent:ObjectSizeFetcher.jar TestSize

public class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}


// public class TestSize {
// 
//     public static void main(String [] args) {
//         System.out.println(ObjectSizeFetcher.getObjectSize(new Object()));
//     }
// }