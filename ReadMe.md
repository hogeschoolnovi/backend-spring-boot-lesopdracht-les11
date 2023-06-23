# Opdracht: 
## "Studenten"

- Maak nieuw SpringBoot project  met dependencies(Web +  JPA + PostgreSql)
  - Zet database properties in application.properties
  - Creëer database in PostgreSql
- Schrijf code voor het opvragen en toevoegen van studenten in een database:
  - Student entityclass 
    - Velden: studentNr(ID-veld), fullName, phoneNumber
- Student repositoryinterface
- Student controller class
  - GET method om studenten op te vragen
  - POST method om student toe te voegen
- Voeg minimaal 3 studenten via Postman toe en check database
- Test in Postman
- Extra uitdaging:
  - Voeg een GET method toe om te zoeken op substringsin naam (pad = ‘/students/fullname?query=<substring>’)(zie hiervoor Edhub9.4 voor repositoryqueries)