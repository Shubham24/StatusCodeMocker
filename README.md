# StatusCodeMocker
Based off of Aaron Powell's httpstatus project [https://github.com/aaronpowell/httpstatus]; given a get request with a code, the service will then return that code

## Example
A `GET` request to where the service is running; for example `http://localhost:2406/200` will return a `200 OK` status, whereas a `GET` request to `http://localhost:2406/500` will return a `500 Internal Server Error` and so on...
