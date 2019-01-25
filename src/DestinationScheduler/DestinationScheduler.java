package DestinationScheduler;

import ElevatorCabin.ElevatorStatus;

import java.util.HashMap;
import java.util.LinkedList;

public class DestinationScheduler {

    LinkedList<CabinRequestTest> currentCabinReq;
    LinkedList<FloorRequestTest> currentFloorReq;

    HashMap<Integer, CabinRequestTest> requestMap = new HashMap<>();

    ElevatorStatus currentStat;


    int getNextDestination(LinkedList<FloorRequestTest> floorReq, LinkedList<CabinRequestTest> cabReq, ElevatorStatus status){
        this.currentCabinReq = cabReq;
        this.currentFloorReq = floorReq;
        this.currentStat = status;
        return 0;

    }

    void addFloorRequest(FloorRequestTest request){
        currentFloorReq.addFirst(request);
    }

    void addCabinRequest(CabinRequestTest request){
        currentCabinReq.addFirst(request);
    }

    void sortCabinRequest(LinkedList<CabinRequestTest> cabReq){
        for(CabinRequestTest req : cabReq){
            requestMap.put(req.elevatorId, req);
        }
    }

    int optimize(){

        for(CabinRequestTest cabReq : currentCabinReq){
            for(FloorRequestTest floorReq: currentFloorReq) {
                if(cabReq.dest == floorReq.floorId){

                }
            }
        }//
        return 0;
    }



}
