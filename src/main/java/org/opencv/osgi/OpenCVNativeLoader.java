package org.opencv.osgi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.opencv.core.Core;

/**
 * This class is intended to provide a convenient way to load OpenCV's native
 * library from the Java bundle. If Blueprint is enabled in the OSGi container
 * this class will be instantiated automatically and the init() method called
 * loading the native library.
 */
public class OpenCVNativeLoader implements OpenCVInterface {

    public void init() {
        /*
         * System.loadLibrary("opencv_java430"); Logger.getLogger("org.opencv.osgi")
         * .log(Level.INFO, "Successfully loaded OpenCV native library.");
         */
        String osName = System.getProperty("os.name");
        if (osName.toLowerCase().startsWith("win")) {
            try {

                File jniLibDirFile = new File("lib");
                String libNameSuffix = ".dll";
                if (!jniLibDirFile.exists()) {
                    jniLibDirFile.mkdirs();
                }
                File libFile = new File(jniLibDirFile.getAbsolutePath(), Core.NATIVE_LIBRARY_NAME + libNameSuffix);
                if (!libFile.exists()) {
                    InputStream is = OpenCVNativeLoader.class.getClassLoader()
                            .getResourceAsStream("jniLibs/" + Core.NATIVE_LIBRARY_NAME + libNameSuffix);
                    if (null != is) {
                        FileOutputStream fos = new FileOutputStream(libFile);
                        final byte[] bytes = new byte[1024];
                        for (int len; (len = is.read(bytes)) != -1; fos.write(bytes, 0, len))
                            ;
                        fos.flush();
                        fos.close();
                        System.loadLibrary("lib/" + Core.NATIVE_LIBRARY_NAME);
                        is.close();
                        Logger.getLogger(getClass().getPackageName()).log(Level.INFO,
                                "Successfully loaded OpenCV native library.");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
