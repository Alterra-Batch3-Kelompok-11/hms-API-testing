@Updateoutpatientsession
Feature: Update outpatientsession Feature
	I want to use this template for my feature file

  @updateoutpatientsession.N1
  Scenario Outline: User want to update outpatientsession using valid method request
    Given User Set method to PUT N1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N1
    And User input HTTP Body N1
    And User click button test Request N1
    Then Show the verify result 200 OK N1
    
  @updateoutpatientsession.N2
  Scenario Outline: User want to update outpatientsession using invalid method request
    Given User Set method to POST N2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N2
    And User input HTTP Body N2
    And User click button test Request N2
    Then Show the verify result 405 Method Not Allowed N2
    
  @updateoutpatientsession.N3
  Scenario Outline: User want to update outpatientsession using invalid id
    Given User Set method to PUT N3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/a N3
    And User input HTTP Body N3
    And User click button test Request N3
    Then Show the verify result 400 Bad Request N3
    
  @updateoutpatientsession.N4
  Scenario Outline: User want to update outpatientsession using invalid input body
    Given User Set method to PUT N4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N4
    And User input HTTP Body N4
    And User click button test Request N4
    Then Show the verify result 400 Bad Request N4
    
  @updateoutpatientsession.N5
  Scenario Outline: User want to update outpatientsession using invalid token
    Given User Set method to PUT N5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N5
    And User input HTTP Body N5
    And User click button test Request N5
    Then Show the verify result 400 Bad Request N5