@patientConditionID
Feature: Get Patient By ID Feature
	I want to use this template for my feature file

  @patientConditionID.R1
  Scenario Outline: User want to get patient by id using valid method request
    Given User Set method to GET R1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions/patient/1 R1
    And User click button test Request R1
    Then Show the verify result 200 OK R1

  @patientConditionID.R2
  Scenario Outline: User want to get patient by id using invalid method request
    Given User Set method to GET R2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions/patient/1 R2
    And User click button test Request R2
    Then Show the verify result 405 Method Not Allowed R2
    
  @patientConditionID.R3
  Scenario Outline: User want to get patient by id using invalid id
    Given User Set method to GET R3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions/patient/1 R3
    And User click button test Request R3
    Then Show the verify result 405 Bad Request R3