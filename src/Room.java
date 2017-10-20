public class Room extends MapSite{
    public int roomNumber;
    public MapSite[] mapSite;
    public Wall[] walls;

    public Wall getSide(int i){
        return new Wall();
    }

    public void setSide(int i, Wall wall){}

    @Override
    public void enter() {

    }
}
