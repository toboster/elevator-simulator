package ElevatorSystem.Floor;



public class FloorDisplay
{
    private int displayStatus;

    public FloorDisplay(){
        this.displayStatus = 0;
    }

    public void setDisplay(int floor){
        this.displayStatus = floor;
    }

    public int getDisplay(){
        return this.displayStatus;
    }
}



