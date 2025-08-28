
🗺️ API Automation Framework (Rest Assured + TestNG + Maven)

This project automates Sample Place APIs using Rest Assured, Java, TestNG, and Maven.
It demonstrates how to validate REST API endpoints with CRUD operations (Create, Read, Update, Delete) using Java Maps/HashMaps to build dynamic JSON payloads.


---

🎯 Objectives

The objective of this project is to practice and implement API automation fundamentals by performing end-to-end testing of a Place API.
The framework validates request/response structures, status codes, and data correctness.


---

🚀 Features

API testing with Rest Assured

CRUD operations on Place API:

POST – Add a new place

GET – Retrieve place details

PUT – Update existing place

DELETE – Remove place


Request payloads created using Java Map / HashMap (dynamic JSON payloads)

Response validation using Rest Assured matchers (statusCode, body, jsonPath)

Reusable methods for request and response handling

Test execution using Maven + TestNG



---

🛠 Tech Stack

Language: Java

Frameworks: TestNG, Maven

API Testing Library: Rest Assured

Build Tool: Maven

Data Structures: Java Map 



---

📊 Validations

Status Code → Validates success/failure of API calls

Response Body → Validates keys/values in JSON response

JSON Path Extraction → Extracts IDs (like place_id) for chaining requests

CRUD Workflow → Ensures created place can be retrieved, updated, and deleted successfully



---
