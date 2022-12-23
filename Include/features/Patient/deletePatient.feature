@DeletePatient
Feature: delete Patient Feature
	I want to use this template for my feature file

  @deletepatient.E1
  Scenario Outline: User want to delete patient using valid method request
    Given User Set method to DELETE E1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E1
    And User click button test Request E1
    Then Show the verify result 200 OK E1
    
  @deletepatient.E2
  Scenario Outline: User want to delete patient using invalid method request
    Given User Set method to POST E2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E2
    And User click button test Request E2
    Then Show the verify result 405 Method Not Allowed E2
    
  @deletepatient.E3
  Scenario Outline: User want to delete patient using invalid id
    Given User Set method to DELETE E3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E3
    And User click button test Request E3
    Then Show the verify result 400 Bad Request E3
    
  @deletepatient.E4
  Scenario Outline: User want to delete patient using invalid token
    Given User Set method to DELETE E4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E4
    And User click button test Request E4
    Then Show the verify result 400 Bad Request E4