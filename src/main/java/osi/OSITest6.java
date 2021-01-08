package osi;


import java.io.IOException;

public class OSITest6 {


    public void test(String data) throws IOException, InterruptedException{
        Inner inner = new Inner(data);
        doStuff("mkdir", inner);
    }

    private void doStuff(String command, Inner inner) throws IOException, InterruptedException {
        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(command+inner.getSuperInner());
        process.waitFor();
    }

    public static class Inner{
        private String superInner;
        public Inner(String superInner){
            this.superInner = superInner;
        }

        public String getSuperInner() {
            return superInner;
        }
    }
}