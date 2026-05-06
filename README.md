# Racing Game in Java

A racing game simulation implemented in Java using object-oriented programming and inheritance.

## Description

This project simulates a race between different types of vehicles on a track made of different road segments.  
Each vehicle has different fuel consumption depending on the type of road, and the winner is the racer with the lowest total time.

## Features

- Vehicle types:
  - Motorbike
  - Car
  - Jeep

- Road types:
  - Paved Road
  - Dirt Road
  - Rocky Road

- Random race track generation
- Fuel consumption calculation
- Refueling after each road segment
- Human-controlled racer
- Computer-controlled racers
- Winner calculation based on total race time

## Classes

- `Vehicle.java`  
  Abstract class for all vehicles.

- `Motorbike.java`  
  Represents a motorbike vehicle.

- `Car.java`  
  Represents a car vehicle.

- `Jeep.java`  
  Represents a jeep vehicle.

- `Road.java`  
  Represents a paved road segment.

- `DirtRoad.java`  
  Represents a dirt road segment.

- `RockyRoad.java`  
  Represents a rocky road segment.

- `RaceTrack.java`  
  Creates and manages the race track.

- `Racer.java`  
  Represents a computer-controlled racer.

- `HumanRacer.java`  
  Represents a human-controlled racer.

- `RaceParticipants.java`  
  Manages all race participants.

- `RacingGame.java`  
  Contains the `main` method and starts the game.

## How to Run

Compile all Java files:

```bash
javac *.java
