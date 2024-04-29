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
- Send a POST request to `/generate/document` with JSON data in the request body (see example below).
- The server responds with a generated PDF file.

## Screenshots and PDFs

### Postman Testing

![Postman Request]![Screenshot 2024-04-29 162237](https://github.com/PallaviRIyer/dynamic-pdf-generator/assets/79352525/bc899a9e-2695-4104-810b-83a4fac15e98)

![PDF Generation in defined path](image_url_2)![Screenshot 2024-04-29 171640](https://github.com/PallaviRIyer/dynamic-pdf-generator/assets/79352525/380d0e95-b86a-43a4-9dba-e3d518ff2d85)


### Sample PDF Content
![Screenshot 2024-04-28 103155](https://github.com/PallaviRIyer/dynamic-pdf-generator/assets/79352525/c35a2bb6-5ad1-4929-aa91-7bbc1a22fdf6)

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


