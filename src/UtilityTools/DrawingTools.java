package UtilityTools;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.lwjgl.opengl.GL11.*;

public class DrawingTools {

    public static final int WIDTH=640, HEIGHT= 480;

    public static void BeginSession() {

        Display.setTitle("Project");

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }


        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, WIDTH, HEIGHT, 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
        glEnable(GL_TEXTURE_2D);
    }

    public static void DrawSquareTexture(Texture texture, float x, float y, float width, float height){
        texture.bind();
        glTranslatef(x, y, 0);
        glBegin(GL_QUADS);
        glTexCoord2f(0, 0);
        glVertex2f(0, 0);
        glTexCoord2f(1, 0);
        glVertex2f(width, 0);
        glTexCoord2f(1, 1);
        glVertex2f(width, height);
        glTexCoord2f(0, 1);
        glVertex2f(0, height);
        glEnd();
        glLoadIdentity();
    }

    public static Texture loadTexture(String path, String fileType){
        Texture texture = null;
        InputStream input = ResourceLoader.getResourceAsStream(path);

        try {
            texture = TextureLoader.getTexture(fileType, input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texture;
    }

    public static Texture ezLoad(String fileName){
        Texture texture = null;
        texture = loadTexture("Resources/" + fileName + ".png", "PNG");
        return texture;
    }
}
