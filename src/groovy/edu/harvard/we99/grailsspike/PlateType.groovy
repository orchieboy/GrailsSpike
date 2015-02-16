package edu.harvard.we99.grailsspike

/**
 * Created by HUID 70786729 on 2/15/15.
 */
enum PlateType {
    COUNT24('COUNT24'),
    COUNT36('COUNT36')

    private PlateType(String plateType) { this.plateType = plateType}
    final String plateType

    static PlateType byPlateType(String plateType){
        values().find { it.plateType == plateType }
    }


}