# Ensolvers challenge project NoteSolver
### By Oscar Andrés Schwerdt


In this application you will be creating and editing notes. You will be able to add tags to the notes and filter them by them. Also you will have the option to store notes in the archive or retrieving notes from there.

#### Deploying the App
Once you cloned this repository you would need to install **Docker** if you dont have it. You can download the latest version of **Docker Desktop** for a comfy GUI.
Now you can deploy it in your machine by positioning your **BASH** terminal in the root folder and type (for *MacOs* and *Linux*):

		./run_compose.sh`

Or if you are using Windows you can execute the .bat file instead, by typing this in your **CMD**:

		`./run_compose.bat`

This will create the images and containers required by docker compose, and then it will deploy the entire app using **Docker**, including the database.

If you face any problem running this files, you can simply code this in any terminal:

		`./docker-compose up`

Once you got everything deployed, you can access the web by entering to:

		http://localhost:80/

and to access the swagger UI you can go to:

		http://localhost:8080/swagger-ui.html

Also, if you want to see the postgre database you can add a new server on your pgAdmin with the following credentials:

		Host: localhost,
		Port: 5432,
		Database name: notesolver_db,
		User: user,
		Password: 1234

To finalize, if you want to test the API by Postman or any software like that, you will need to send the requests to the following URL:

		http://localhost:8080/yor-request

#### Specifications

This App was contructed using:

	-Vue 3
	-Bootstrap 5
	-Java 11
	-SpringBoot 2.7
		_Spring Web
		_Spring Data JPA
	-Swagger 2.9.2
	-Docker 24.0.5
	-PostgreSQL

If you want to run the backend on development, like using maven plugin spring-boor.run, make sure to comment the postgre lines in **application.properties** and uncomment the H2 ones. This is due that the Database its created and deployed by Docker. By using the H2 database instead you will be capable of running the project perfectly.



### Finally

I hope you can enjoy the page as much I enjoyed making it! 😄😄

Any further doubt or question you can email me to: oscarschwerdt@gmail.com