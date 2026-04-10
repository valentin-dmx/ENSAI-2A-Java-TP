package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class CrazyElevator extends Elevator{

    private static Random randomComportement = new Random();
    private static Random randomUnload = new Random();


    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }

    public int behavior() {
        return randomComportement.nextInt(2);
    }

    public boolean halfTime() {
        return randomUnload.nextBoolean();
    }

    /**
     * Déplace le crazy elevator suivant le hasard: une chance sur trois pour qu'il fonctionne normalement,
     * qu'il ne bouge pas ou qu'il saute une destination.
     * 
     */

    @Override
    public void move() {
        if (destinationQueue.isEmpty()) 
            return;

        int comportement = behavior();

        // reste immobile
        if (comportement == 0) 
            {
                return; 
            }        
        
        else { 
            // comportement normal
            if (comportement == 2) {
            currentFloor = destinationQueue.removeFirst();
        } 
        else {
            // saute la destination et passe à la suivante
            if (destinationQueue.size() > 1) {
                destinationQueue.removeFirst();
            }
            currentFloor = destinationQueue.removeFirst();
        }
    }
    }

    /**
     * UNe fonction pour ne pas laisser les passagers descendre.
     * 
     */
    @Override
    public int unloadPassengers(Floor floor) {
        int comportement = behavior();
        if (randomUnload.nextBoolean()) {
            return 0;
        }

        return super.unloadPassengers(floor);
    }
}

