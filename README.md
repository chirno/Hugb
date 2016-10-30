#Setup for git

Alright let's get this going. What you want to start off by doing is use the following command 
	git version
in cmd. This should give you version 2.7.4 or higher. If that is correct you can proceed to go online to github.com and find the repository at chirno/Hugb and fork that. Forking it will create a repository on your own github account which you will have to connect to mine so you can fetch updates. 
After forking the repository you should press clone this repository and go to the eclipse workspace. There you can launch cmd and type git clone <link from clipboard>. This should create a local directory connected to your github repository. Then you need to add the original repository as upstream so you can fetch and merge updates. (https://help.github.com/articles/configuring-a-remote-for-a-fork/)
After this is done you should create a branch to work on (never work on master). This can be done using the git branch <branchname> command in the git directory, and then git checkout <branchname> to move to that branch. Having done this you should type git branch to verify that you are working on the correct branch. If you are working on the correct branch then you are free to start coding and changing whatever you want. 

Remember to fetch updates every now and then by going back master and following the guide here(https://help.github.com/articles/syncing-a-fork/). 

Also remember to create a branch on your github page by going to the branch you're working on in cmd. Let's say we created a branch called development by using git branch development, and we want to add it to our online repository.
	git checkout development
	git push -u origin development
This will create a branch called development on our github page and we can push to that page any changes we've done without messing with master.

# SpringBootMVC
Project skeleton for Software Project class in the University of Iceland.

## How do I get this ?
Your IDE ([IntelliJ](https://www.jetbrains.com/idea/), [Eclipse](https://eclipse.org/), [Spring Tool Suit](https://spring.io/tools)) should be able to clone a project from Github.
It should be easy to find information regarding how to do that for your chosen IDE.
It's also possible to download the project as a .zip [here](https://github.com/danielpall/SpringBootMVC/archive/master.zip).

## How do I run this ?
This project is setup using [Maven](https://maven.apache.org/what-is-maven.html) as a dependency manager, so if your IDE does not manage that, or you don't have it installed you can look [here](https://maven.apache.org/install.html) for further information.
When all the dependencies are downloaded, you can run the project by running the ``main()`` method in the class ``Application`` and then enter [localhost:8080](http://localhost:8080) into the address bar of your favorite web browser.

## What is going on ?
Look at the code and find the comments I wrote. I tried explaining what was happening in such a way that it should hopefully be easy to understand.

### What did you use to make this ?
I used IntelliJ Ultimate with Maven to setup this project. Students and Teachers get the Ultimate edition for free, apply [here](https://www.jetbrains.com/student/).

### Database
This project assumes there is a database called HBV at the URL: postgresql://localhost:5432/HBV .   
See username and password in [application.properties](https://github.com/danielpall/SpringBootMVC/blob/master/src/main/resources/application.properties)

### Where can I find help ?
In case of any questions, please refer to the "Spring Boot Intro" slides in the HBV501G Verkefni folder on Ugla, or contact your tutor.

### Credits
This skeleton project was originally created by Daníel Páll Jóhannsson while tutoring the HBV501G course in Fall 2015. Daníel has since moved on to work at TM Software. Therefore, please direct any questions to *your own* tutors - thanks :-)
