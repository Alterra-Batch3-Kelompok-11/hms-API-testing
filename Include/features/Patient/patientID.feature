@PatientID
Feature: Get Patient By ID Feature
	I want to use this template for my feature file

  @allpatient.C1
  Scenario Outline: User want to get patient by id using valid method request
    Given User Set method to GET C1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C1
    And User click button test Request C1
    Then Show the verify result 200 OK C1

  @allpatient.C2
  Scenario Outline: User want to get patient by id using invalid method request
    Given User Set method to GET C2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C2
    And User click button test Request C2
    Then Show the verify result 405 Method Not Allowed C2
    
  @allpatient.C3
  Scenario Outline: User want to get patient by id using invalid id
    Given User Set method to GET C3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C3
    And User click button test Request C3
    Then Show the verify result 405 Bad Request C3