package ElevatorCabin;
import Simulator.Elevators;

import java.util.Timer;
import java.util.TimerTask;

public class DoorController {

    private boolean locked;
    private boolean timeOut = false;
    private Elevators elevator;

    public DoorController(boolean locked, int cabinId){
        this.locked = locked;
        this.elevator = Elevators.valueOf("E" + cabinId);
    }

    public  boolean isLocked() {
        return locked;
    }

    public void setLock(boolean locked){
        this.locked = locked;
    }

    public void waitTime(long delay) {
        TimerTask task = new TimerTask() {
            public void run() {
                timeOut = true;
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, delay);
    }

    public boolean timedOut() {
        return timeOut;
    }

    public void openDoors() {
        elevator.leftDoorOpen();
        elevator.rightDoorOpen();
    }

    public void closeDoors() {
        elevator.leftDoorClosed();
        elevator.rightDoorClosed();
    }

    public DoorStatus getStatus() {
        return elevator.getDoorStatus();
    }

}
