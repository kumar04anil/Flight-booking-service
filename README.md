**##FLIGHT BOOKING DATA SERVICE##**
It's an mini spring+java17+maven project that to help and demostrate an flight booking flow.
**1.controller's: 1.1 AddNewFlight, 1.2 bookFlight, 1.3 search flight, search by criteria, search by id, etc.**
**2. Custom exception handler with controler advice.
3. Enum classess for country code and etc
4. Postgres db
5. Open API with swagger configured to generate the DTO classes.
6.airline.yml for DTO classes generation**

**Major version of project's:**
- Java 17
- Spring Boot 3.2.3
- maven 4

Still under progress.

**7.API end points:**
**get flight by flightNumber:**
curl --location 'http://localhost:8181/comflightds/airline' \
--header 'Content-Type: application/json' \
--data '{
    "destination": "HYD",
    "source": "DEL",
    "flightNumber": "FLIGHT222",
    "duration": "2 hrs",
    "flightDate": "2007-12-03T10: 15: 30+01: 00",
    "flightTime": "11:15:30",
    "fare": {
        "currency": "INR",
        "fare": null
    },
    "flightInfo": {
        "flightType": "commercial",
        "numberOfSeats": 150,
        "flightStatus": "RUNNING"
    }
}'
