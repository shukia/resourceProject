package osi;


import java.io.IOException;

public class OSITest4 {
    private static String data;


    public void test(String data) throws IOException, InterruptedException{
        OSITest4.data = data;
        doStuff("mkdir");
    }

    private void doStuff(String command) throws InterruptedException, IOException {
        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(command+data);
        process.waitFor();
    }
}