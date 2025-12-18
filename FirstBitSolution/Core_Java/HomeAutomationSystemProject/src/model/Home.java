package model;
import java.util.ArrayList;
import java.util.List;

public class Home {
	private String homeName;
	private List<Room>rooms;
	
	public Home(String homeName) {
		this.homeName=homeName;
		this.rooms=new ArrayList<>();
	}
	//add a room to home
	public void addRoom(Room room) {
		if (room !=null) {
			rooms.add(room);
			System.out.println("Room added to home: "+room.getRoomName());
		}
	}
	public List<Room>getRooms(){
		return rooms;
	}
	//final room by name
	public Room getRoom(String roomName) {
		for (Room room:rooms) {
			if(room .getRoomName().equalsIgnoreCase(roomName)) {
				return room;
			}
		}
		return null;
	}
	public void showHomeStatus() {
		System.out.println("Home: "+homeName);
		for(Room room:rooms) {
			room.showRoomStatus();
		}
	}

} 