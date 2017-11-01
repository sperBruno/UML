
public class Room extends MapSite {
	public int roomNumber;
	public MapSite[] mapsites;
	public Wall[] sides;

	public Wall getSide(int i) {
		return new Wall();
	}

	public void setSide(int i, Wall wall) {
	}
}
