package GamePackage;

import static UtilityTools.DrawingTools.*;

public class TileGrid {

    private Tile[][] map;

    public TileGrid(){
        map = new Tile[20][15];
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length ; j++) {
                map[i][j] = new Tile(i * 32, j * 32, 32, 32, TILE_TYPE.Grass);
            }
        }
    }

    public TileGrid(int[][] newMap){
        map = new Tile[20][15];
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length ; j++) {
                if(newMap[j][i] == 0){
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TILE_TYPE.Grass);
                }
                else{
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TILE_TYPE.Storm);
                }
            }
        }
    }

    public void drawGrid(){
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length ; j++) {
                Tile tile = map[i][j];
                DrawSquareTexture(tile.getTexture(), tile.getX(), tile.getY(), tile.getWidth(), tile. getHeight());
            }
        }
    }
}
