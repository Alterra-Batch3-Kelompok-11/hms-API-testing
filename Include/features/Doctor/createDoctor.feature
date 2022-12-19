@createDoctor
Feature: Create Doctor Feature
	I want to use this template for my feature file

  @doctor.I1
  Scenario Outline: User want to add new doctor using valid input
    Given User Set method to POST A1
    When User Set URL https://alta-shop.herokuapp.com/api/auth/info I1
    And User click button test Request I1
    Then Show the verify result 200 OK I1

  @Info.I2
  Scenario Outline: GET user info with valid HTTP Method and invalid API URL
    Given User Set method to GET I2
    When User Set URL https://alta-shop.herokuapp.com/api/auth/inf I2
    And User click button test Request I2
    Then Show the verify result 400 not found I2