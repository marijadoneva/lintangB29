@B29G25-220
Feature: Default

	
	@B29G25-219
	Scenario: User can see the total number of files and folders under the files list table
		Scenario:As a User, I can see the total number of files and folders under the files list table
		          When user navigates on "Files" module page
		          Then User can see the total number of the files and folders under the files list table	

	
	@B29G25-218
	Scenario: User can delete any selection item from its three dots menu
		Scenario: As a User, I can delete any selected item from its three dots menu
		        When user navigates on "Files" module page
		        Then user clicks on three dots of selected item
		        And  clicks on delete folder or file
		        Then User can deleting any selected item from its three dots menu	

	
	@B29G25-206
	Scenario: User can upload a file
		Feature: User can upload a file
		
		  User Story:
		  As a user, I should be able to upload a file, move or delete any selected file under the Files module
		
		  Background: For all scenarios user is on the login page of the seamlessly application
		    Given user is on the dashboard page
		  Scenario: As a user, I should be able to upload a file
		    When User enters on "Files" module page
		    And User click on the Upload file button
		    And User can select file "C:/Users/chimi/OneDrive/Desktop/file.txt"
		    Then User can see "file" uploading file on the list	

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # User can upload a file
	# # {color:#de350b}*User can create a new folder*{color}
	# # User can delete any selected item from its three dots menu
	# # User can see the total number of files and folders under the files list table
	@B29G25-208
	Scenario Outline: User can create a new folder
		Scenario: As a user, I should be crate a new folder
		      When user navigates on "Files" module page
		      Then user clicks on add button
		      And user creates new folder
		      And user name the folder
		      Then User creating New Folder, it can be see in the list