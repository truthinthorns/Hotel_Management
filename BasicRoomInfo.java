/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


/**
 *
 * @author justw
 */
public class BasicRoomInfo 
{
    int number;
    Boolean filled;
    HotelRoom.RoomType type;
    
    BasicRoomInfo(int n,Boolean b,HotelRoom.RoomType t) 
    {
        number = n;
        filled = b;
        type = t;
    }
    
    Boolean getFilled() {return filled;}
    HotelRoom.RoomType getType() {return type;}
    int getRoomNumber() {return number;}
    
    void SetFilled(Boolean b) {filled = b;}
}