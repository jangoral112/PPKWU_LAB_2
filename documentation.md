## API

**Application port**: 8080  <br />
**Protocol**: http

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
    "uppercase_letters": Long,
    "lowercase_letters": Long,
    "digits": Long,
    "special_characters": Long,
    "combination_hits": Long,
}
```