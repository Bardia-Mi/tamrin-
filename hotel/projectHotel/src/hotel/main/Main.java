package hotel.main;

import hotel.rooms.RoomEnti;
import hotel.rooms.RoomServ;

public class Main {

    public static void main(String[] args) {


        try{
            RoomServ.getInstance().save(new RoomEnti());
        }catch (Exception h){
            System.out.println("fail to save room..."+h.getMessage());
        }


    }
}
