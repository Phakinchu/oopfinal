package GamePackage;

import org.newdawn.slick.opengl.*;

import static UtilityTools.DrawingTools.*;

public class Tile {

    private float x, y, width, height;
    private Texture texture;
    private TILE_TYPE type;

    public Tile(float x, float y, float width, float height, TILE_TYPE type){
        //Tile constructor
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.texture = ezLoad(type.textureName);
    }

    public void Draw(){
        DrawSquareTexture(texture, x, y, width, height);
    }

    public Texture getTexture() {
        return texture;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
