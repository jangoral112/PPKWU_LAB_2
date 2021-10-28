## API

**Application port**: 8080

### String statistics
**Path**: /statistics <br />
**Method**: POST <br />

**Headers**: <br />
Content-Type: application/json

**Request body**:
```
{
    "text": "Text for statistcs",
    "combination": "additional combination of characters to be search for as String"
}
```

**Sample Response body for status *OK* *200*:**
```
{
    "uppercase_letters": Integer,
    "lowercase_letters": Integer,
    "digits": Integer,
    "special_characters": Integer,
    "combination_hits": Integer,
}
```