package edu.harvard.we99.grailsspike

/**
 * Controller action save will load a JSON plate template to the database
 *
 */
class PlateTemplateController {

    def templateService

    def index() { }

    def save(LoadPlateTemplateCommand template){

        log.error(template.name)

        if(!template.hasErrors()){
            def newTemplate = templateService.load(template)
        }else {
            respond status: 500
        }

    }
}

/* Commnad object binds the JSON data */
class LoadPlateTemplateCommand {

    String name
    String description
    String direction
    String plateType
    List wells

    static constraints = {

    }

}
