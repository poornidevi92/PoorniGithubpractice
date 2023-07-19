@login
Feature: Validate vcentry login app
Scenario: validate app with valid data

Given open browser
When enter url
And enter user name
And enter password
When click login button
But dont click remember password
Then verify welcome page
