package entities;

public class houseBase {
    private  int price;
    private int sqmt;
    private String type;
    private int room;
    private int livingRoom;



    public  houseBase (int price, int sqmt,  int room,int livingRoom,String type){
        this.price = price;
        this.sqmt = sqmt;
        this.room = room;
        this.livingRoom = livingRoom;
        this.type = type;
    }

    public int getPrice(){
        return price;
    }

    public  void  setPrice(int price){
        this.price =price;
    }
    public int getSqmt() {
        return sqmt;
    }

    public void setSqmt(int sqmt) {
        this.sqmt = sqmt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public String toString(){
        return "Asset{"
                +"Type = "+this.type
                +", Rooms = "+this.room + "+" + this.livingRoom
                +", Square Meters = "+this.sqmt
                +", Price = "+ this.price + "}";
    }

}
