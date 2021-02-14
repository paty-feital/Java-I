
public class FluxoStackOverflow {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            System.out.println("Erro " + ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}

// Exception in thread "main" java.lang.StackOverflowError
// at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:406)
// at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:289)
// at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:131)
// at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:208)
// at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
// at java.base/java.io.PrintStream.writeln(PrintStream.java:722)
// at java.base/java.io.PrintStream.println(PrintStream.java:1028)
// at FluxoDireto.metodo2(FluxoDireto.java:22)
// at FluxoDireto.metodo2(FluxoDireto.java:23)
// at FluxoDireto.metodo2(FluxoDireto.java:23)
