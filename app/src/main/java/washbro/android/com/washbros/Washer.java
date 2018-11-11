package washbro.android.com.washbros;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paen3 on 11/10/2018.
 */

public class Washer {
    Integer timeStart;
    String name;
    public Washer(){

    }
    public Washer(Integer timeStart, String name){
        this.name = name;
        this.timeStart = timeStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Integer timeStart) {
        this.timeStart = timeStart;
    }
    public int calcTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        int s = Integer.parseInt(sdf.format(new Date()));

    }
}
