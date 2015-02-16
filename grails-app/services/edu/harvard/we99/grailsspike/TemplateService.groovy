package edu.harvard.we99.grailsspike

import grails.transaction.Transactional


/**
 * Loads a PlateTemplate into the database
 */
@Transactional
class TemplateService {

    def load(LoadPlateTemplateCommand template) {

        def plateTemplate = new PlateTemplate(name: template.name, desc: template.description, direction: template.direction,
        plateType: template.plateType)
        template.wells.eachWithIndex{ value, index ->
            plateTemplate.addToWells( new Well(location: "${index}", label: "${value}", type: "MEASURED"))
        }

        plateTemplate.save(failOnError: true)

    }
}
