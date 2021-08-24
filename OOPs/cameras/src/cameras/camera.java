package cameras;

public class camera {

	private boolean  Active = true;
	String Serialnumber;
	
	Cameratype cameratype = Cameratype.PTZ;
			
	enum Cameratype {PTZ, EPTZ, STATIONARY};
	
	public camera(String SerialNumber) {
		this.Serialnumber = SerialNumber;
	}

	public String toString() {
		return " Serial number :" + Serialnumber + "\n" + " Active :" +Active + "\n" +" Position :" +Position.toString() ;
	}
	private Position Position = new Position();
	
	boolean getActive() {
		return Active;
	}
	//getter 
	
	Position getPosition()  /* getter method always returns a value. Also called as "accessors" */
	{
		return Position;
	}
	//setter
	void SetPosition(Position Position) {
		this.Position = Position;   /* as the name suggest, setter method sets or updates a value. Also called as "mutators" */
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
	void setcameratype(String Cameratype) {
		this.cameratype =  camera.Cameratype.valueOf(Cameratype);
	}
}
