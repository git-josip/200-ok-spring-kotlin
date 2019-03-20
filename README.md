# Gradle, Kotlin, Spring Multi Project, Spring COnfig Server

- spring cloud
- spring multi project gradle build
- spring config server


### Build docker config-server image
`docker build -f docker/config-server/Dockerfile  . -t config-server-image`

### Build docker api image
`docker build -f docker/api/Dockerfile  . -t api-image`