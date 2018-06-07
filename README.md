# TV-shows-RESTFul-API
Springboot Restful API that manages tv shows


To run the application, please run on Spring Tool Suite(STS) or equivalent IDE.
PUT and POST requests can be made using an HTTP client like Postman

The application uses Apache DERBY as the in memory database and JPA.


GET /shows returns all existing shows in the database ordered by the show id

POST /shows with JSON format creates a show and inserts it into the DB<br/>
Ex:Post request on url /shows<br/>

    {
        "id": 123,
        "title": "Lord of the rings",
        "description": "Movie of lord of the rings",
        "duration": "3 hours",
        "originalAirDate": "01/01/2000",
        "rating": "5 stars",
        "keywords": "fantasy,action"
    }

PUT /shows/123 updates show with id 123 with new updates in the PUT request.<br/>
Ex: PUT request on url /shows/123

    {
        "id": 123,
        "title": "The Lord of the Rings: The Fellowship of the Ring",
        "description": "Movie about a ring",
        "duration": "3 hours",
        "originalAirDate": "01/01/2000",
        "rating": "5 stars",
        "keywords": "fantasy,action"
    }

	
	
	
