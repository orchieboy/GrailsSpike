package edu.harvard.we99.grailsspike

class Experiment {


    String name
    Date date
    static hasMany = [plates:Plate]


    static constraints = {
        name nullable: false, blank: false
        date nullable: false
    }

}
