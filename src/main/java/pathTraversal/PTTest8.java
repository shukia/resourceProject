package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest8 {
    private final String BASE_DIRECTORY = "src/";
    public void Test(String filename, String subDirName) {
        try {
            String dirpath = getvalue(BASE_DIRECTORY) + subDirName + "subsubdir/";
            new File(dirpath + filename).delete();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.print("sdfsf");
    }

    public String getvalue(String str){
        return str+ "tempdir/";
    }

}