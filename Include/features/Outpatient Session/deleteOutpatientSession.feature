@DeleteDoctor
Feature: delete Doctor Feature
	I want to use this template for my feature file

  @deleteoutpatientsession.O1
  Scenario Outline: User want to delete outpatientsession using valid method request
    Given User Set method to DELETE O1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O1
    And User click button test Request O1
    Then Show the verify result 200 OK O1
    
  @deleteoutpatientsession.O2
  Scenario Outline: User want to delete outpatientsession using invalid method request
    Given User Set method to POST O2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O2
    And User click button test Request O2
    Then Show the verify result 405 Method Not Allowed O2
    
  @deleteoutpatientsession.O3
  Scenario Outline: User want to delete outpatientsession using invalid id
    Given User Set method to DELETE O3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O3
    And User click button test Request O3
    Then Show the verify result 400 Bad Request O3
    
  @deleteoutpatientsession.O4
  Scenario Outline: User want to delete outpatientsession using invalid token
    Given User Set method to DELETE O4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O4
    And User click button test Request O4
    Then Show the verify result 400 Bad Request O4