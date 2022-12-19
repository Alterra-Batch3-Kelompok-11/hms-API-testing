@AllPatient
Feature: Get All Patient Feature
	I want to use this template for my feature file

  @allpatient.B1
  Scenario Outline: User want to get all patient using valid method request
    Given User Set method to GET B1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients B1
    And User click button test Request B1
    Then Show the verify result 200 OK B1

  @allpatient.B2
  Scenario Outline: User want to get all patient using invalid method request
    Given User Set method to GET B2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients B2
    And User click button test Request B2
    Then Show the verify result 405 Method Not Allowed B2