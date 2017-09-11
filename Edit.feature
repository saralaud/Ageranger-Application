Feature: To test the edit functionality.

Scenario:
Given I navigate to AgeRanger home page
When I click on edit symbol
And I modify the age
And click on submit button
Then I see the home page with the edited data.

Scenario:
Given I navigate to AgeRanger home page
When I click on edit symbol
And I modify the age
And click on close button
Then I see the home page without the edited data's.
