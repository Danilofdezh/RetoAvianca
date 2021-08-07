Feature: Reto Avianca

@regression
Scenario: successful flight booking
Given user enters the page to book a flight with avianca
When the data requested on the page is recorded
Then the flight reservation was made successfully.