package ElevatorCabin;

import ElevatorSystem.Direction;

public enum CabinID {
    E1(1, Direction.STOPPED),
    E2(2, Direction.STOPPED),
    E3(3, Direction.STOPPED),
    E4(4, Direction.STOPPED);

    private int cabinID;
    private float speed;
    private Direction direction;

    CabinID(int cabinID, Direction direction){
        this.cabinID = cabinID;
        this.direction = direction;
    }

    public int getCabinID(){
        return cabinID;
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public float getSpeed(){
        return speed;
    }

    public Direction getDirection(){
        return direction;
    }


}
