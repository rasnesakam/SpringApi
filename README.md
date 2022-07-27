# Spring Api Demo
This an api project that built by Spring framework.  
It handles basic 'CURL' operations for ***User*** and ***Student*** datas by Http requests such as POST, PUT, DELETE, GET.  
- Student datas stored in PostgreSQL
- User datas stored in Mongo DB

## Techstack

### Student Interactions
* Postgresql
* Spring data JPA
* Spring

### User Interactions
* Mongodb
* Spring

## Requests

### GET

#### Students
`Get: /api/students`

```
curl -i -H 'Accept: application/json' http://localhost:8080/api/students
```
#### Response
```
 HTTP/1.1 200 
 Content-Type: application/json
 Transfer-Encoding: chunked
 Date: Sun, 30 Jan 2022 16:53:56 GMT
 
 [
	{
		"id": "52ffae30-11dc-4106-bba1-ab262689953d",
		"firstName": "Ensar",
		"lastName": "Makas",
		"mail": "ensar.makas@gmail.com",
		"branch": "Computer Engineering"
	},
	{
		"id": "d1ec8f38-c943-449c-87c3-2c994144c9db",
		"firstName": "Mock",
		"lastName": "Student",
		"mail": "fakedata@fakemail.com",
		"branch": "Computer Engineering"
	}
]
```

#### Users
`Get: /api/users`

```
curl -i -H 'Accept: application/json' http://localhost:8080/api/users
```

#### Response

```
 HTTP/1.1 200 
 Content-Type: application/json
 Transfer-Encoding: chunked
 Date: Sun, 30 Jan 2022 16:53:56 GMT
 
 [
	{
		"id": "61f5428a2f3ca622691fe668",
		"firstName": "Ensar",
		"lastName": "Makas",
		"userName": "emakas",
		"email": "ensar.makas@gmail.com",
		"password": "password"
	}
]
```

### POST

#### Student
`Post: /api/students`
```
curl -i -H 'Accept: application/json' -X POST \ 
  -d '{"firstName":"foo","lastName":"bar","mail":"foomail@foomail.com","branch":"Foo Engineering"}' \
  http://localhost:8080/api/students 
```
#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```

#### User
`Post: /api/users`
```
curl -i -H 'Accept: application/json' -X POST \ 
  -d '{"firstName":"Ensar","lastName":"Makas","userName":"emakas","email":"ensar.makas@gmail.com","password":"password"}' \
  http://localhost:8080/api/users 
```
#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```

### PUT

#### Student
`Put: /api/students/[UUID String]`
```
curl -i -H 'Accept: application/json' -X PUT \ 
  -d '{"firstName":"foo","lastName":"bar","mail":"foomail@foomail.com","branch":"Foo Engineering"}' \
  http://localhost:8080/api/students/1ceb5074-74e6-4701-9baf-81e98e2712a2
  ```
#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```

#### User
`Put: /api/users/[idString]`
```
curl -i -H 'Accept: application/json' -X PUT \ 
  -d '{"firstName":"Ensar","lastName":"Makas","userName":"emakas","email":"ensar.makas@gmail.com","password":"password"}' \
  http://localhost:8080/api/users/61f542aa2f3ca622691fe669
```
#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```

### DELETE

#### Student
`Delete: /api/students`

```
curl -i -H 'Accept: application/json' -X DELETE http://localhost:8080/api/students
```

#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```
#### User
`Delete: /api/users`

```
curl -i -H 'Accept: application/json' -X DELETE http://localhost:8080/api/users
```

#### Response
```
 HTTP/1.1 200 
 Content-Length: 0
 Date: Sat, 29 Jan 2022 13:35:38 GMT
```





