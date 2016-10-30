#Setup for git

We will want to be working with at least 1.7.4 so make sure you're not running an older version than that. To do so you can go into cmd and type git version. 

##Forking

When we initialize our repositories we have to go to https://github.com/chirno/Hugb and fork there(You have already done this). After that is done you will need to go to the corresponding repository that got created on your own github page and clone that into a local directory. After cloning it you will need to set up an upstream for syncing your repository to the original repository.

##Cloning

We will start by going to your github page and finding the correct repository, there you will need to copy the link that is displayed when you click clone this repository. After that is done you will need to launch cmd in the workspace and type in the following command. 

	git clone linkyoucopied

This should create a new directory in the workspace. You will need to navigate to that directory to use git from there.

##Synching

We also need to set up a connection between the two repositories so you can regularily check for updates.

	https://help.github.com/articles/configuring-a-remote-for-a-fork/
	https://help.github.com/articles/syncing-a-fork/


##Adding

Following changes to any files not included in .gitignore we will get a notification that we will need to add the changes to our next commit. To do this you can either add a single file at a time or all of them if you're sure you want all the changes to go through.

	git add single : git add nameoffile
	git add all : git add --all 
	git add all : git add *

This will add the files to be included into next commit. You can also check for this by typing 

	git status

which will give you a brief overview of the data.

##Committing

After making changes and adding the changes to be included in your next commit you can commit your changes to git. This will move the HEAD which will be helpful if we need to recover older information or do some more detailed changes. 

	git commit -m "type a short message"

This will create a commit with a short message. Try to make your commits descriptive of the changes you're committing since this will be helpful if we need to undo certain changes later on. 

##Branching

To avoid working on master you will need to create a branch and handle your work there. You can do this by going launching cmd in the working directory and creating a branch.

	Creating a branch  : git branch nameofbranch
	Changing to a branch : git checkout nameofbranch

You will then need to change to that branch and create a remote for that. You do that by typing the followin into cmd.
	
	Setting branch up on website : git pull -u origin nameofbranch

This should create a branch with the name you typed in during the commands. Now you can commit your code to this branch and push to show your code to the rest of the team. Just remember to not work on master.

##Pushing

If you want to push your git commits to github so you can view them online and share them with other members of the team you have to push them. If you have set up a branch on the website you can simply type in the following command to push. 

	git push

If you have not set up a branch for the current working branch you will need to follow the guide in branching where setting up a new branch on website is explained.


