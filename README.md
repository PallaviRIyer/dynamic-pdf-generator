# Dynamic PDF Generation with Spring Boot

This project is a Spring Boot application with REST API endpoints for generating PDF documents dynamically based on provided data. It utilizes Java Template Engines Thymeleaf to generate PDFs and stores them on local storage for later retrieval.

## Features

- REST API to accept data and generate PDF documents.
- Storage of generated PDFs on local storage for future retrieval.

## Requirements

- Java Development Kit (JDK) version 8 or higher
- Maven
- Postman or Swagger for testing


## Usage

- The application exposes REST API endpoints for PDF generation.
- Use tools like Postman to test the endpoints.
- Send a POST request to `/generate-pdf` with JSON data in the request body (see example below).
- The server responds with a generated PDF file.

## Screenshots and PDFs

### Postman Testing

![Postman Request](image_url_1)
![PDF Generation in defined path](image_url_2)

### Sample PDF Content

### Sample Request Body

```json
{
  "seller": "XYZ Pvt. Ltd.",
  "sellerGstin": "29AABBCCDD121ZD",
  "sellerAddress": "New Delhi, India",
  "buyer": "Vedant Computers",
  "buyerGstin": "29AABBCCDD131ZD",
  "buyerAddress": "New Delhi, India",
  "items": [
    {
      "name": "Product 1",
      "quantity": "12 Nos",
      "rate": 123.00,
      "amount": 1476.00
    }
  ]
}


