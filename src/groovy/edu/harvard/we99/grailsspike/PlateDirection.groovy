package edu.harvard.we99.grailsspike

/**
 * Created by HUID 70786729 on 2/15/15.
 */
enum PlateDirection {
    VERTICAL('VERTICAL'),
    HORIZONTAL('HORIZONTAL')

    private PlateDirection(String direction) { this.direction = direction}
    final String direction

    static PlateDirection byDirection(String direction){
        values().find { it.direction == direction }
    }

}