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

```http request
GET http://www.foo.de/v1/cottages
```

| Name           | Description                            | Type    |
|:---------------|:---------------------------------------|:--------|
| id             | unique resource identifier             | integer |
| name           | name of the cottage                    | string  |
| size           | size of the cottage                    | integer |
| bed-count      | number of beds in the cottage          | integer |
| bedroom-count  | number of bedrooms in the cottage      | integer |
| beach-distance | distance from the cottage to the beach | float   |
| price per day  | daily price for staying at the cottage | float   |
| contact-person | the contact person for this cottage    | string  |

creating a new cottage (with POST-Method):

```http request
POST http://www.foo.de/v1/cottage
```

updating a

```http request
PUT http://www.foo.de/v1/cottage
```

a payload is posted here (which means a structure of information about
the new cottage, with all its needed information)

## Questions

- Can/should we use an SSL-Certificate?
- Application/JSON, Content-Type Automatically...?!?1