Feature: Login to dominos

Scenario: use valid credentials

Given Launh the url and maximize
When click order online button
Then Locate the delivery address
Then select vegpizza and add require quantity
And Select beverages and add require quantity
Then Remove quantity
Then Click Checkout