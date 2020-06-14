import org.opencv.osgi.OpenCVNativeLoader;

public class Test {
    public static void main(String[] args) {
        new OpenCVNativeLoader().init();
    }
}