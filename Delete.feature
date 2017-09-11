Feature: To test the delete functionality.

Scenario:
Given I navigate to AgeRanger home page
When I select any person from the list.
And I click on delete symbol
And click on ok button
Then I shoud not see the deleted data in home page.

Scenario:
Given I navigate to AgeRanger home page
When I select any person from the list.
And I click on delete symbol
And click on cancel button
Then I shoud see the previous data in home page.
