import java.util.Date;

public class InputData {
    private int flight;
    private String source;
    private String destination;
    private String gate;
    private Date boardingTime;
    private String ticketID;
    private char bookingClass;
    private String name;
    private String passboardID;

    public InputData(int f, String src, String dest, String gate, Date board, String id, char booking, String customerName, String passboard){
        this.flight=f;
        this.source=src;
        this.destination=dest;
        this.gate=gate;
        this.boardingTime=board;
        this.ticketID=id;
        this.bookingClass=booking;
        this.name=customerName;
        this.passboardID=passboard;
    }

    public String print(){
        return "Flight:" + this.flight + " Source:" + this.source + " Destination:" + this.destination + " Gate:" + this.gate + " Boarding at:" + this.boardingTime + " Class:" + this.bookingClass + " Customer:" + this.name;
    }
}


