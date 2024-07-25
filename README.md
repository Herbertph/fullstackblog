# fullstackblog
React + Java/Spring Fullstack project to train new stuff

# Blog API

This is a REST API for a BLOG. It allows you to create, read, update, and delete posts.

## Technologies Used

- Java 22
- Spring Boot 3.3.1
- MongoDB

## Setup and Installation

1. **Clone the repository**

2. **Configure MongoDB**
Make sure MongoDB is installed and running. You can download and install MongoDB from 
https://www.mongodb.com/try/download/community

3. **Configure MongoDB**
Update the src/main/resources/application.properties file with your MongoDB connection details if needed. The default configuration is:

spring.application.name=blog-backend
spring.data.mongodb.uri=mongodb://localhost:27017/blogdb

4. **Run the application**

## API Endpoints

### Create a Post

URL: /posts
Method: POST
Description: Creates a new blog post.

**Example Request Body:**
{
  "title": "First Post",
  "content": "Testing API."
}

**Example Response:**
{
  "id": "66a24fb0e1c92b73ed03537d",
  "title": "First Post",
  "content": "Testing API.",
  "createdAt": "2024-07-25T10:14:24.691"
}

### Get all posts

URL: /posts
Method: GET
Description: Returns a list of all blog posts.

**Example Response:**

[
  {
    "id": "66a24fb0e1c92b73ed03537d",
    "title": "First Post",
    "content": "Testing API.",
    "createdAt": "2024-07-25T10:14:24.691"
  },
  {
    "id": "66a24fe1c79d647948014fb2",
    "title": "Second Post",
    "content": "Another post.",
    "createdAt": "2024-07-25T10:15:13.932"
  }
]

### Delete a post

URL: /posts/ID
Method: DELETE
Description: Delete a blog post.