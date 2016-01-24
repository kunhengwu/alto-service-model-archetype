this is maven archetype for alto-service-northbound-route

You can create a northbound-route template following under command
```Bash
mvn archetype:generate \
-DarchetypeGroupId=org.opendaylight.alto.archetypes \
-DarchetypeArtifactId=alto-service-model-archetype \
-DarchetypeVersion=0.2.0-SNAPSHOT \
-DarchetypeRepository=local 
[-Dversion=0.2.0-SNAPSHOT][-DclassPrefix=<your className>]
```
The "-DarchetypeVersion" is the archetype version.</br>
The "-DarchetypeRepository=local" can reduce the time which be taken in creating project.</br>
The "-Dversion" is the snapshot version of your project and it is optional and its default value is 0.2.0-SNAPSHOT.</br>
The "-DclassPrefix" can help you custom your class name.</br>

Now you can define the artifactId with "-"(such as hello-world)</br>
When you define the artifactId to "hello-world",the classNamePrefix will become HelloWorld and the namespace in the yang file will become hellworld (such as namespace "urn:opendaylight:alto:core:northbound:route:helloworld"; )
