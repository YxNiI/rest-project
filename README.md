# Documentation

## HTTP-Methods

**GET-Method** - for getting information about a cottage (cottage-size,
bed-count, bedroom-count, distance to the beach, price per day and
contact-personal)

**POST-Method** - for creating a new cottage with all its information

**PUT-Method** - for updating the information about a cottage

**DELETE-Method** - for deleting of a cottage

## Endpoint-Definitions

### GET

getting all Information about all cottages:

```http request
GET http://www.foo.de/v1/cottages
```

### POST

creating a new cottage (with POST-Method):

```http request
POST http://www.foo.de/v1/cottage
Content-Type: application/json
```

### PUT

updating a cottage's information

```http request
PUT http://www.foo.de/v1/cottage
Content-Type: application/json
```

## Cottage-Definition

```json
{
  "id": 1,
  "name": "Rotweiden-Villa",
  "size": 150,
  "bedCount": 8,
  "bedroomCount": 4,
  "beachDistance": 0.5,
  "pricePerDay": 1600.00,
  "currency": "EUR",
  "contactPerson": "Hans Peter Klaus von Grahlmann"
}
```

| Name           | Description                                               | Type    |
|:---------------|:----------------------------------------------------------|:--------|
| id             | unique resource identifier                                | integer |
| name           | name of the cottage                                       | string  |
| size           | size of the cottage                                       | integer |
| bed-count      | number of beds in the cottage                             | integer |
| bedroom-count  | number of bedrooms in the cottage                         | integer |
| beach-distance | distance from the cottage to the beach in km              | float   |
| price per day  | daily price for staying at the cottage                    | float   |
| currency       | currency used, defined as: "country's currency-shorthand" | string  |
| contact-person | the contact person for this cottage                       | string  |

## Questions

- Can/should we use an SSL-Certificate?
- Application/JSON, Content-Type Automatically...?!?1