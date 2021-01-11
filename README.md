1) For the application url   http://localhost:8080 to return "Hello!" use restful api which is implemented in java via sping boot.
////Code is in testmodel.java and 
HealthController.java ///
  

3) I would add Environments- dev / uat/ perf instance in order to verify the right endpoint to the specific instance if in case
there are more than 1 instances deployed to docker environments. example if dev - http://d-URL- or http://p(perf)(url).
Team Contacts informtion.
Cloud.json file - For pull request approvers.


4) mkdir rundeployment
cd rundeployment
docker build --build-arg TOKEN=your-githubtoken . -f Manu.img(Dockerfile) -t Manu962/hello:test // in order to build docker image
docker run --rm -d -p 8080:8080 Manu962/hello:test // to ru this in your local in Docker

5) I would use 3 main branching strategies
    1) Feature brancheing strategy - Since this is very helpful to add version and easily revert the releases if any build fails and could frequently add code.
    And we developers could work seperately and contribute to project
    2) Release Branching Strategy - This helps to create a branch for particular release that includes all necessary stories. 
    3) staging strategy - can be used to test before deploying to prodcution . works as final test before triggering prod,
    
CI/CD - I would choose specific CID/CD tool depending on ths type of application and deployment process meaning ( onprem / cloud) 
        If am deploying to aws (ec2) I would choose aws codecommit / codedeploy and use cloudformation templates and deploy to ECS/ EC2.
        If it is a microservice which is on on-prem I would choose Jenkins for building artifacts.
        Can also use bitbucket for code commit and bamboo o deploy and verify urls in antiphony.
Stages in CI/CD pipeline -
     
     "Build" 
  
         - Check out the code using vascode / bash etc; 
         -Run static analysis and test it ( sonar)
         - Build artifacts
         -Build images
         -push the image to repos
         
     "Test" -
         - Initialize the release under test
         -Confirm the green pass
         - Run some functional / security / vulnerability tests
         
     (remove the release under test)
    " Release" -
          - pull the image of the rekease under test.
          -Tag the image as a specific release
          - Tag it as a latest image
          -push it to the specific release
          -and then push the image to latest release
          -package it.
          
      "Deploy"
      -Udate prod release version and run prod tests.
      -send nitification about prod deploy and test out URL.

