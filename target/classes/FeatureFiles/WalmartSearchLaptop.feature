@regression @smoke @SKYW-15 @E2E
Feature: Walmart Search Functionality

	Scenario: Search for Laptops
	Given Open Walmart Homepage
		When  Search for Laptops
		Then Item list should have only Laptops related products 
  