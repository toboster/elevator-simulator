package ElevatorCabin;

import DisplayPanel.DisplayPanel;
import ElevatorSystem.Shared.FloorEnum;
import javafx.animation.AnimationTimer;

import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestCabin extends AnimationTimer {
    static LinkedList<ElevatorCabin> cabins = new LinkedList<ElevatorCabin>();

    private ScheduledExecutorService spawner;
    private ScheduledFuture<?> spawnInterval;

    DisplayPanel dp;

    public TestCabin()
    {
        dp = new DisplayPanel();

        spawner = Executors.newScheduledThreadPool(1);
        spawnInterval = spawner.scheduleAtFixedRate(() -> spawnRequest(), 100, 3000, TimeUnit.MILLISECONDS);

        cabins.add(new ElevatorCabin(CabinID.E1));
        cabins.add(new ElevatorCabin(CabinID.E2));
        cabins.add(new ElevatorCabin(CabinID.E3));
        cabins.add(new ElevatorCabin(CabinID.E4));

        for (ElevatorCabin cabin : cabins) {
            cabin.makeStopAt(FloorEnum.F10);
        }
    }

    public void spawnRequest()
    {
        //get a random source floor, random destination floor here and create request
    }

    @Override
    public void handle(long l) {
        dp.updateElevators();
    }
}
