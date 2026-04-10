package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        // --------------------------------------------------------------------
        // Create Floors, Elevators and Hotel
        // --------------------------------------------------------------------

        final int elevatorCapacity = Config.getInt("hotel.elevator.capacity");
        final int nbSteps = Config.getInt("steps.count");
        final int msBetweenSteps = Config.getInt("steps.delay");
        final int nbFloorsBase = Config.getInt("hotel.floor.base-number");
        final int nbElevatorsBase = Config.getInt("hotel.elevator.base-number");

        /**
         * A modifier pour faire une boucle for dans main
        */
        List<Floor> floors = Floor.createListFloors(nbFloorsBase);

        List<Elevator> elevators = Elevator.createListElevators(nbElevatorsBase, elevatorCapacity);

        Hotel hotel = new Hotel(floors, elevators);

        // --------------------------------------------------------------------
        // Run simulation
        // --------------------------------------------------------------------

        for (int step = 1; step <= nbSteps; step++) {
            logger.info("\nStep: {}\n--------", step);

            hotel.update();
            hotel.spawnPerson();
            hotel.display(step);
            Thread.sleep(msBetweenSteps);
        }
    }

}