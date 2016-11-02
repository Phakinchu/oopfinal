package GamePackage;

import org.newdawn.slick.opengl.Texture;

import static UtilityTools.DrawingTools.*;

public class Enemy {

    private float x;
    private float y;
    private float width;
    private float height;
    private int hp;
    private float speed;

    Tile startTile;
    Texture enemyTexture;

    public Enemy(Texture enemyTexture,Tile startTile, float width, float height , int hp ){
        this.enemyTexture = enemyTexture;
        this.x = startTile.getX();
        this.y = startTile.getY();
        this.width = width;
        this.height = height;
        this.hp = hp;
    }

    public void Draw(){
        DrawSquareTexture(enemyTexture, x, y, width, height);
    }
}
