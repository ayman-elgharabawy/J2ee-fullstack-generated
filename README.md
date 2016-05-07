**A n d r o M D A  -  3.4 -Complete J2ee Stack (Hibernate , Spring , Rest)**
==============

   <br>
<img  src="https://github.com/ayman-elgharabawy/Andromda-Hibernate-ejb-spring-rest-fullstack-/blob/master/diagram1.jpg?raw=true" />
<br>


    Magic Draw 9.5 is used for this project You'll notice
    that the andromda.xml is already configured to load these exported files. It expects
    that a model called 'reportviewer' has been created within your Magic Draw model.

    Important: before launching AndroMDA, be sure to have exported your model.

    /PAG OUBL J2EE project
         |
         |    The root of the project contains a few files that control the overall
         |    build process and common properties (in the pom.xml).
         |
         |-- pom.xml
         |        contains information about this project, you may add more information
         |        as long as you do not violate the Maven POM schema, see
         |        http://maven.apache.org/ref/current/maven-model/maven.html
         |
         |      Generated sources are in target/src/main/java in each subdirectory
         |      Implementation sources are under /src in each subdirectory
         |
         +-- /mda
         |     |
         |     |    The MDA module is the heart of this project, this is where
         |     |    AndroMDA is configured to generate the files needed to
         |     |    assemble the application
         |     |
         |     +-- pom.xml
         |     |        contains the AndroMDA dependencies and configuration (cartridges, translation-libraries, etc)
         |     +-- /src
         |     |        additional sources such as merge-mappings can be
         |     |        placed here, check out the /main/uml directory, it contains
         |     |        the UML model from which AndroMDA will generate code
         |     +-- /src/main/config/andromda.xml
         |              configures AndroMDA and its components, most
         |              importantly the cartridges which are listed in
         |              their own namespace; global settings are done in the
         |              'default' namespace
         |
         +-- /common
         |     |
         |     |    The COMMON module collects those resources and classes
         |     |    that are shared between the other modules.
         |     |
         |     +-- pom.xml
         |     |        lists common dependencies
         |     +-- /target
         |              shared resources and java classes are generated here,
         |              such as value objects and exceptions
         |
         +-- /core
         |     |
         |     |    The CORE module collects those resources and classes
         |     |    that use the Spring framework, optionally making
         |     |    use of Hibernate and/or EJB under the hood.
         |     |
         |     +-- pom.xml
         |     |        lists Spring and services dependencies
         |     +-- /src/main/java
         |     |        Spring classes that need manual implementation are
         |     |        generated here, they will not be overwritten upon
         |     |        regeneration; this includes the service, DAO and
         |     |        entity implementations
         |     +-- /target
         |              the Spring resources and classes here will be
         |              overwriten each time AndroMDA generates new code
         |              using the Spring cartridge; this includes both
         |              the Hibernate entities and the correponding
         |              *.hbm.xml mapping files as well as the service
         |              and DAO base classes. You'll also find the DDL
         |              for creating and dropping your schema within this
         |              directory.
         |
         +-- /web
         |     |
         |     |    The WEB module collects all resources and classes
         |     |    that make up the presentation layer, as well as
         |     |    bundling all other modules to create a deployable war.
         |     |
         |     +-- pom.xml
         |     |        lists WebApp dependencies
         |     +-- /src/main/java
         |     |        controller implementations and editable resource bundles
         |     |        will be generated here,
         |     |        you might consider putting your own JSPs here to
         |     |        be copied over the generated ones when bundling the
         |     |        .war file
         |     +-- /target
         |              a deployable war is bundled here
         |



    In order to succesfully build your project you will need to know
    how to invoke the build process for the existing modules, here's a
    list of examples:

    

        %> mvn clean

            simply builds all modules


        %> mvn -Peclipse

            builds all modules and updates the .project and .classpath files (Eclipse project information).
            Must be used after dependency changes.

        %> mvn install -Dmaven.test.skip=true

            builds all modules and skips all automatic tests (i.e. surefire expected/actual)


   <br>
<img  src="https://github.com/ayman-elgharabawy/Andromda-Hibernate-ejb-spring-rest-fullstack-/blob/master/Diagram1.jpeg?raw=true" />
<br>


        %> mvn -f core/pom.xml org.andromda.maven.plugins:andromdapp-maven-plugin:schema -Dtasks=drop,create

            generates the drop and create DDL code and subsequently tells the database
            to drop and then create the schema for the entities

       
*How to Deploy* 

Copy the war file vf-oubl-webservice.war under  D:\PAG\PAG-OUBL\webservice\target and insert it under apache/webapp 


*Test the application*

*Generate dummy data*
INSERT INTO `item` VALUES (1,'T-Section','1234','description 1','1'),(2,'I-Section','123','description 2','1');

*Using rest client*
Test the  url  http://localhost:8080/vf-oubl-webservice/services/InventoryService/getallitems usi ng GET
the result will be 

{"anyType":{"ItemVO":[{"id":1,"name":"test"},{"id":2,"name":"sdf"}]}}
 

*Notes:*
--------------

-In Modeling the webservice make the name of webservice class is the same of base url
    <br>
<img  src="https://github.com/ayman-elgharabawy/Andromda-Hibernate-ejb-spring-rest-fullstack-/blob/master/webservice.jpg?raw=true" />
<br>
Make sure the name of the webservice class is the same name of the anromda_REST_path and case sensitive
