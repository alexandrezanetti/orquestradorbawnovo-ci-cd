An example REST-0 application for Open Liberty
https://launcher.fabric8.io/docs/

mvn clean
mvn compile
mvn package
# java -jar C:\@Zanetti\@Workspaces\SpringToolSuite4\orquestradorbawNovo\target\rest-http-openliberty.jar

git add. 
git commit -m -a
git push

ibmcloud login --sso    

ibmcloud target -o alexandre.zanetti@br.ibm.com -s orquestradorbawnovo_dev

ibmcloud cf push -t 300

