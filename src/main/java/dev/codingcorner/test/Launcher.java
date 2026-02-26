package dev.codingcorner.test;

import dev.codingcorner.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(Version.getVersion());

        WindowManager window = new WindowManager("CODING CORNER ENGINE", 800, 400, false);
        window.init();

        while (!window.windowShouldClose()) {
            window.update();
        }

        window.cleanup();
    }
}
