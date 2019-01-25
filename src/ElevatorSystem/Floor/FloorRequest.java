package ElevatorSystem.Floor;

import ElevatorSystem.Shared.FloorEnum;

public class FloorRequest {

    public final boolean up;
    public final boolean fireKeyTurned;
    public final FloorEnum floor;

    public FloorRequest(int floorNum, boolean up, boolean fireKeyTurned){
        this.up = up;
        this.fireKeyTurned = fireKeyTurned;
        this.floor = FloorEnum.valueOf("F"+floorNum);
    }

    public boolean getDirection(){
        return  up;
    }

    public boolean isFireKeyTurned(){
        return fireKeyTurned;
    }

    public FloorEnum getFloor() {
        return floor;
    }
}
