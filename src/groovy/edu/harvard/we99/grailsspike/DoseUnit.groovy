package edu.harvard.we99.grailsspike

/**
 * Created by HUID 70786729 on 2/15/15.
 */
enum DoseUnit {
    MILLIS('MILLIS'),
    MICRO('MICRO'),
    NANO('NANO'),
    PICO('PICO')

    private DoseUnit(String unit) { this.unit = unit}
    final String unit

    static DoseUnit byUnit(String unit){
        values().find { it.unit == unit }
    }


}