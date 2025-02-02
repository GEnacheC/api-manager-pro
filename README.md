# API Manager Pro
This repository is a project designed to enhance my skills with Spring Boot, Docker, JUnit, and Mockito. It serves as a practical example of building a RESTful API with modern development tools and practices.
## Prerequisites
Before running the project, ensure you have the following installed:
- Java >= 17
- Maven >= 3.9.8
- Docker >= 27.3.1
## How to Run
### 1. Build the Project
To generate the `.jar` file, run the following command:
```bash
mvn clean package -P build-tests
```
### 2. Start the Application with Docker
Use Docker Compose to start the application and its dependencies:
```bash
docker compose up -d
```
### 3. Verify the Application
If the ports 3317 (MySQL) and 8899 (API) are not in use, the application should start successfully. To test if the API is running, execute the following command:
```bash
curl -X GET http://localhost:8899/api/public/status
```
## Ports Used
- `8899`: API server
- `3317`: MySQL database
## Project Goals
- Practice Spring Boot for building RESTful APIs.
- Use Docker for containerization and dependency management.
- Write unit and integration tests with JUnit and Mockito.
- Improve CI/CD workflows and deployment practices.

## Contributing
Feel free to contribute to this project by opening issues or submitting pull requests. All feedback and improvements are welcome!

## License
This project is open-source and available under the MIT License.