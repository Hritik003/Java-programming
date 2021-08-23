package cameras;

public class camera {

	private boolean  Active = true;
	String Serialnumber;
	
	public String toString() {
		return " Serial number :" + Serialnumber + "\n" + " Active :" +Active + "\n" +" Position :" +Position.toString() ;
	}
	private Position Position = new Position();
	
	boolean getActive() {
		return Active;
	}
	
	Position getPosition()
	{
		return Position;
	}
	
	void SetPosition(Position Position) {
		this.Position = Position;
	}
	void SetPosition(int x, int y, int z)
	{
		Position.pan = x;
		Position.tilt = y;
		Position.zoom = z;
	}
	
	void SetPosition(int i, int j)
	{
		SetPosition(i,j,0);
	}
	void SetPosition()
	{
		reset();
	}

	private void reset() {
		Position.pan =0;
		Position.tilt =0;
		Position.zoom =0;
		
	}
}
