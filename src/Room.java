import java.util.ArrayList;

public class Room extends MapSite {
    public int roomNumber;
    public MapSite[] mapsites;
    public ArrayList<Wall> sides;

    public Room() {
        sides = new ArrayList<>();
    }

    public Wall getSide(int i) {
        return new Wall();
    }

    public void setSide(int i, Wall wall) {
    }

    @Override
    public void enter() {

    }
}
