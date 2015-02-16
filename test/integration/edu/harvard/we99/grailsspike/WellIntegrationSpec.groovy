package edu.harvard.we99.grailsspike

import grails.test.spock.IntegrationSpec

class WellIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "Saving a well to the database"() {

        given: "A new plate and well"
        def plate = new PlateTemplate(name: "testplate2", plateType: PlateType.COUNT24, desc: "a test plate", direction: PlateDirection.HORIZONTAL)
        plate.save(failOnError: true)
        def well = new Well(label: "A1", location: "top", type: WellType.EMPTY, plate: plate)

        when: "the well is saved to the database"
        well.save()

        then: "it saved successfully and can be retrieved from the database"
        well.errors.errorCount == 0
        well.id != null
        Well.get(well.id).label == "A1"
    }
}
