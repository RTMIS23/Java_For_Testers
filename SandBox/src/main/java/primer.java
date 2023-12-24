import java.io.File;

public class primer {
    public static void main(String[] args) {
        System.out.println("Hello");


        var configFile = new File("SandBox/build.gradle");
        System.out.println(configFile.getAbsolutePath());
        System.out.println(configFile.exists());
    }
}
