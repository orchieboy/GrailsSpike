package edu.harvard.we99.grailsspike

class Plate extends PlateTemplate {

    String name
    String desc
    String barcode

    static hasMany = [wells:Well]

    static constraints = {
    }
}
