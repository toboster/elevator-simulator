package DestinationScheduler;

public class FloorRequestTest {

    int floorId;
    Enum dir;
    int assigned;
    boolean emerg;
    public FloorRequestTest(int dest, Enum e, int assigned, boolean emerg){
        this.floorId = dest;
        this.dir = e;
        this.assigned = assigned;
        this.emerg = emerg;
    }


}
