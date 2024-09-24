# Documentation

## HTTP-Methods

**GET-Method** - for getting information about a cottage (cottage-size,
bed-count, bedroom-count, distance to the beach, price per day and
contact-personal)

**POST-Method** - for creating a new cottage with all its information

**PUT-Method** - for updating the information about a cottage

**DELETE-Method** - for deleting of a cottage

## Endpoint-Definitions

getting all Information about all cottages:
```
GET http://www.foo.de/v1/cottages
```

creating a new cottage (with POST-Method):
```
POST http://www.foo.de/v1/cottage
```

a payload is posted here (which means a structure of information about
the new cottage, with all its needed information)

## Questions

- Can/should we use an SSL-Certificate?
- Application/JSON, Content-Type Automatically...?!?1