package com.contour.organization;

public class Floors {

    private final Rooms[] rooms;
    private final Halls[] halls;

    public Floors(Rooms[] rooms, Halls[] halls) {
        this.rooms = rooms;
        this.halls = halls;
    }

    public Rooms[] getRooms() {
        return rooms;
    }

    public Halls[] getHalls() {
        return halls;
    }
}
