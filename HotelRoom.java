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
public class HotelRoom 
{
        protected enum RoomType
        {
            King,Queen,Double,KingSmoking,QueenSmoking,DoubleSmoking
        };
        protected String customerName;
        protected int numOccupants;
        protected int roomNumber;
        static protected RoomType type;
        protected int numNights;
        protected int cost;
        protected String reservationCode;
        
        HotelRoom(String name,int occ,int room,RoomType type,int nights)
        {
            customerName = name;
            roomNumber = room;
            numOccupants = occ;
            this.type = type;
            numNights = nights;
            reservationCode = "--";
        }
        
        //getters
        String getCustomerName() {return customerName;}
        int getNumOccupants() {return numOccupants;}
        int getRoomNumber() {return roomNumber;}
        RoomType getRoomType() {return type;}
        int getNumNights() {return numNights;}
        int getCost() 
        {
            switch(type){
                case King:
                case KingSmoking:
                    return 125;
                case Queen:
                case QueenSmoking:
                    return 105;
                case Double:
                case DoubleSmoking:
                    return 85;
            }
                   return 85;
        }
        static int Cost(RoomType t)
        {
            switch(t){
                case King:
                case KingSmoking:
                    return 125;
                case Queen:
                case QueenSmoking:
                    return 105;
                case Double:
                case DoubleSmoking:
                    return 85;
            }
                   return 85;
        }
        String getRCode() {return reservationCode;}

        //setters
        void setCustomerName(String name) {customerName = name;}
        void setNumOccupants(int num) {numOccupants = num;}
        void setRoomNumber(int num) {roomNumber = num;}
        void setRoomType(RoomType t) {type = t;}
        void setNumNights(int num) {numNights = num;}
        void setCost(int num) {cost = num;}
        void setRCode(String s) {reservationCode = s;}
}