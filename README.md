# Pre-Requisities
   - Make sure Docker Desktop is running
   - Make sure to set the following environment variables if you are going to deploy to AKS (Azure Kubernetes cluster)
   
# Commands to build and run this container
   - docker build -t spring-boot-api .           => (build the image with tag name spring-boot-api)
   - docker images                               => (List all images in the repository)
   - docker run -p 8000:8080 -d spring-boot-api  => (pull, create and run the container in detached mode. externalPort:containerInternalPort = 8000:8080) 
   - Access the application by visiting the URL : http://localhost:8000/api/hello
   - docker ps                                   => list all running containers
   - docker stop <container ID>                  => Stop the container by capturing the container ID from above command
   - docker ps -a                                => list all containers, including stopped ones.
   - docker rm <list of container ids>           => delete the container from list of stopped containers
   - docker rmi spring-boot-api                  => delete the image from repository
