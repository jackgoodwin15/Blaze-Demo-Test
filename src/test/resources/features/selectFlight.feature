Feature: Select a flight
 Scenario Outline: selecting flights
   Given I am on the home page
   When I choose <departureCity> as my departure city and <destinationCity> as my destination city
   Then I will see a list of flights from <departureCity> to <destinationCity>

   Examples:
     | departureCity | destinationCity |
     | Paris | London |
     | London | Buenos Aires|