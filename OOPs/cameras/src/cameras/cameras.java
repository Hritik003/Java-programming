package cameras;

public class cameras {
public static void main(String[] args) {
	 camera camera  = new camera();
	 camera.Serialnumber = "1356";
	 Position Position = new Position();
	 Position.pan = 5;
	 Position.tilt = 10;
	 Position.zoom = 15;
	 
	 camera.SetPosition(Position);
	 
	 System.out.println(camera);
}
}
