# Tech stack:
Java, Springboot, maven, Spring MVC, Restful

#Build and run 
- unzip the project 
- from the command prompt, go to the project folder and run command mvn clean package
    - D:\disney-titles-metadata>mvn clean package
    
- start springboot application - DisneyTitlesMetadataApplication

#TEST
-Test can be performed using postman or chrome browser
-have deployed the project in google cloud app engine  too. can test  there as well.

-CREATE the ContentsMetadata
-chrome browser
http://localhost:8080/contentsMetadata/createContentsMetadata

Note:
-for testing on google cloud app engine use  https://contents-metadata-service.appspot.com
instead of  http://localhost:8080
-if the date is not shown for get, refresh the browser more than once(some issue on google cloud app engine)
-works fine in chrome browser

google cloud app engine
https://contents-metadata-service.appspot.com/contentsMetadata/createContentsMetadata

--GET all the ContentsMetadata
http://localhost:8080/contentsMetadata/getContentsMetadata

-- RETRIEVE ContentsMetadata filtered by Title Type
http://localhost:8080/contentsMetadata/getContentsMetadata/Feature
http://localhost:8080/contentsMetadata/getContentsMetadata/bonus
http://localhost:8080/contentsMetadata/getContentsMetadata/TV%20Series
http://localhost:8080/contentsMetadata/getContentsMetadata/Season
http://localhost:8080/contentsMetadata/getContentsMetadata/Episode

--UPDATE ContentsMetadata
http://localhost:8080/contentsMetadata/updateContentsMetadata/Feature

--DELETE ContentsMetadata
http://localhost:8080/contentsMetadata/deleteContentsMetadata/TV%20Series

-- DELETE all
http://localhost:8080/contentsMetadata/

--Description
Using springboot and maven, the project is created in spring mvc design structure.
Rest Apis are created for CRUD operation.
createContentsMetadata - create (RequestMethod.POST)
getContentsMetadata - get (RequestMethod.GET)
getContentsMetadata/titleType - get selected contents
updateContentsMetadata/titleType - update selected contents
deleteContentsMetadata/titleType - delete selected contents
deleteContentsMetadata - delete all contents


