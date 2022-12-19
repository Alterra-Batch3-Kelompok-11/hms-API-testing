@UpdatePatient
Feature: Update Patient Feature
	I want to use this template for my feature file

  @updatepatient.D1
  Scenario Outline: User want to update patient using valid method request
    Given User Set method to PUT D1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D1
    And User input HTTP Body D1
    And User click button test Request D1
    Then Show the verify result 200 OK D1
    
  @updatepatient.D2
  Scenario Outline: User want to update patient using invalid method request
    Given User Set method to POST D2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D2
    And User input HTTP Body D2
    And User click button test Request D2
    Then Show the verify result 405 Method Not Allowed D2
    
  @updatepatient.D3
  Scenario Outline: User want to update patient using invalid id
    Given User Set method to PUT D3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/a D3
    And User input HTTP Body D3
    And User click button test Request D3
    Then Show the verify result 400 Bad Request D3
    
  @updatepatient.D4
  Scenario Outline: User want to update patient using invalid input body
    Given User Set method to PUT D4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D4
    And User input HTTP Body D4
    And User click button test Request D4
    Then Show the verify result 400 Bad Request D4
    
  @updatepatient.D5
  Scenario Outline: User want to update patient using invalid token
    Given User Set method to PUT D5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D5
    And User input HTTP Body D5
    And User click button test Request D5
    Then Show the verify result 400 Bad Request D5