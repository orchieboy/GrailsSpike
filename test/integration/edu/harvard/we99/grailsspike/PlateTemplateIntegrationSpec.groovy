package edu.harvard.we99.grailsspike

import grails.test.spock.IntegrationSpec

class PlateTemplateIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "saving a plate to the database"() {

        given: "A brand new plate"
        def plate = new PlateTemplate(name: "testplate", desc: "JustATestPlate", barcode: "12345678",
                direction: PlateDirection.HORIZONTAL, plateType: PlateType.COUNT24)

        when:"the plate is saved"
        plate.save()

        then:"It saves sucessfully and can be retrieved from the database"
        plate.errors.errorCount == 0
        plate.id != null;
        PlateTemplate.get(plate.id).name == "testplate"
    }
}
