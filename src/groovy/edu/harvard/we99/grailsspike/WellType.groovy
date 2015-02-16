package edu.harvard.we99.grailsspike

/**
 * Created by HUID 70786729 on 2/15/15.
 */
enum WellType {
    MEASURED('MEASURED'),
    POSITIVE('POSITIVE'),
    NEGATIVE('NEGATIVE'),
    EMPTY('EMPTY')

    private WellType(String type) { this.type = type}
    final String type

    static WellType byType(String type){
        values().find { it.type == type }
    }





}