package edu.harvard.we99.grailsspike

class Well {

    String location
    String label
    String type

    static hasMany = [doses:Dose]
    static belongsTo = [plate:PlateTemplate]

    WellType getWellType() { type ? WellType.byType(type) : null }
    void setWellType(WellType wellType) { type = wellType.type }

    static transients = ['wellType']

    static constraints = {
        type inList: WellType.values()*.type

    }

    static mapping = {
        type sqlType: 'char(8)'
    }


}
