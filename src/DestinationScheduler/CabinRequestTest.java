package DestinationScheduler;

import java.util.LinkedList;

public class CabinRequestTest {

    LinkedList<Integer> currentCabinRequest = new LinkedList<>();
    int elevatorId;
    int dest;
    boolean emerg;

    public CabinRequestTest(int elevatorId, int dest, boolean emerg){
        this.elevatorId = elevatorId;
        this.dest = dest;
        this.emerg = emerg;
    }
    public int getElevatorId(){
        return elevatorId;
    }
    public int getDest(){
        return dest;
    }
    public boolean getEmerg(){
        return emerg;
    }

}
