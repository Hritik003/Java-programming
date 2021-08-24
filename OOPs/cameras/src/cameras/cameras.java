package cameras;

import cameras.camera.Cameratype;

public class cameras {
public static void main(String[] args) {
	 camera camera  = new camera("13156");
	 camera.setcameratype("EPTZ");
	 
	 camera.cameratype = Cameratype.EPTZ;
	 Position Position = new Position();
	 Position.pan = 5;
	 Position.tilt = 10;
	 Position.zoom = 15;
	 
	 camera.SetPosition(Position);
	 
	 System.out.println(camera);
	 
}
}
