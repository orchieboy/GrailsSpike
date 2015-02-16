package edu.harvard.we99.grailsspike

class PlateTemplate {

    String name
    String desc
    PlateDirection direction
    PlateType plateType

    static hasMany = [wells:Well]

    static constraints = {

   }

}
