package edu.harvard.we99.grailsspike

class Dose {


    int number
    String unit

    static hasMany = [compounds:Compound]
    static belongsTo = [well:Well]

    static transients = ['doseUnit']

    DoseUnit getDoseUnit() { unit ? DoseUnit.byUnit(unit) : null }
    void setDoseUnit(DoseUnit doseUnit) { unit = doseUnit.unit }

    static constraints = {
        unit inList: DoseUnit.values()*.unit

    }

    static mapping = {
        unit sqlType: 'char(6)'
    }
}
