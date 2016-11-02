package GamePackage;

public enum TILE_TYPE {

    Grass("Grass", true),Storm("testStorm",true);


    protected String textureName;
    protected boolean buildable;

    TILE_TYPE(String textureName, boolean buildable){
        this.textureName = textureName;
        this.buildable = buildable;
    }
}