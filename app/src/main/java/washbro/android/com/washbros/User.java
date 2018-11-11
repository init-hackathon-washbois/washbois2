package washbro.android.com.washbros;

/**
 * Created by paen3 on 11/10/2018.
 */

public class User {
    String id;
    String roomID;
    String userName;
    public User(){


    }
    public User(String id,String roomID,String userName){
        this.id = id;
        this.roomID = roomID;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

