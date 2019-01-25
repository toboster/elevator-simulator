package ElevatorCabin;

import ElevatorSystem.Direction;
import ElevatorSystem.Shared.FloorEnum;

public class ElevatorCabin {

    ElevatorStatus elevatorStatus;
    DoorController doorController;
    CabinMotionControl cabinMotionControl;

    public ElevatorCabin(CabinID cabinID){
        elevatorStatus = new ElevatorStatus(Direction.STOPPED, FloorEnum.F1, null, cabinID.getCabinID());
        doorController = new DoorController(true, cabinID.getCabinID());
        cabinMotionControl = new CabinMotionControl(cabinID);
    }

    public ElevatorStatus getStatus(){
        return elevatorStatus;
    }

    public void makeStopAt(FloorEnum floor){
        doorController.closeDoors();
        cabinMotionControl.moveToFloor(floor);
        doorController.openDoors();
        //TODO Alignment Controller started.
        doorController.closeDoors();
    }
}
