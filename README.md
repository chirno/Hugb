#Setup for git

We will want to be working with at least 1.7.4 so make sure you're not running an older version than that. To do so you can go into cmd and type git version. 


Alright let's get this going. What you want to start off by doing is use the following command 
	git version
in cmd. This should give you version 2.7.4 or higher. If that is correct you can proceed to go online to github.com and find the repository at chirno/Hugb and fork that. Forking it will create a repository on your own github account which you will have to connect to mine so you can fetch updates. 
After forking the repository you should press clone this repository and go to the eclipse workspace. There you can launch cmd and type git clone "<link from clipboard>". This should create a local directory connected to your github repository. Then you need to add the original repository as upstream so you can fetch and merge updates. (https://help.github.com/articles/configuring-a-remote-for-a-fork/)
After this is done you should create a branch to work on (never work on master). This can be done using the git branch <branchname> command in the git directory, and then git checkout "<branchname>" to move to that branch. Having done this you should type git branch to verify that you are working on the correct branch. If you are working on the correct branch then you are free to start coding and changing whatever you want. 


Also remember to create a branch on your github page by going to the branch you're working on in cmd. Let's say we created a branch called development by using git branch development, and we want to add it to our online repository.
	git checkout development
	git push -u origin development
This will create a branch called development on our github page and we can push to that page any changes we've done without messing with master.

##Adding



##Committing



##Branching

To avoid working on master you will need to create a branch and handle your work there. You can do this by going launching cmd in the working directory and creating a branch.

	Creating a branch  : git branch branch
	Changing to a branch : git checkout branch

You will then need to change to that branch and create a remote for that. You do that by typing git pull -u origin branch. This should create a branch with the name you typed in during the commands. Now you can commit your code to this branch and push to show your code to the rest of the team. Just remember to not work on master.

##Pushing



##Synching

Remember to check for updates every now and then by going back master and following the guide here.

	https://help.github.com/articles/syncing-a-fork/

