@createoutpatientsessions
Feature: Create outpatientsessions Feature
	I want to use this template for my feature file
  
  @outpatientsessions.L1
  Scenario Outline: User want to add new outpatientsessions using valid input
    Given User Set method to POST L1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L1
    And User input HTTP Body L1
    And User click button test Request L1
    Then Show the verify result 200 OK L1

  @outpatientsessions.L2
  Scenario Outline: User want to add new outpatientsessions by blank patient id
    Given User Set method to POST L2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L2
    And User input HTTP Body L2
    And User click button test Request L2
    Then Show the verify result 400 Bad Request L2
    
  @outpatientsessions.L3
  Scenario Outline: User want to add new outpatientsessions by blank doctor id
    Given User Set method to POST L3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L3
    And User input HTTP Body L3
    And User click button test Request L3
    Then Show the verify result 400 Bad Request L3
    
  @outpatientsessions.L4
  Scenario Outline: User want to add new outpatientsessions by blank complaint
    Given User Set method to POST L4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L4
    And User input HTTP Body L4
    And User click button test Request L4
    Then Show the verify result 400 Bad Request L4
    
  @outpatientsessions.L5
  Scenario Outline: User want to add new outpatientsessions by blank schedule date
    Given User Set method to POST L5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L5
    And User input HTTP Body L5
    And User click button test Request L5
    Then Show the verify result 400 Bad Request L5
    
  @outpatientsessions.L6
  Scenario Outline: User want to add new outpatientsessions by blank schedule time
    Given User Set method to POST L6
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L6
    And User input HTTP Body L6
    And User click button test Request L6
    Then Show the verify result 400 Bad Request L6
    
  @outpatientsessions.L7
  Scenario Outline: User want to add new outpatientsessions using invalid patient id
    Given User Set method to POST L7
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L7
    And User input HTTP Body L7
    And User click button test Request L7
    Then Show the verify result 400 Bad Request L7
    
  @outpatientsessions.L8
  Scenario Outline: User want to add new outpatientsessions using invalid doctor id
    Given User Set method to POST L8
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L8
    And User input HTTP Body L8
    And User click button test Request L8
    Then Show the verify result 400 Bad Request L8
    
  @outpatientsessions.L9
  Scenario Outline: User want to add new outpatientsessions using invalid complaint
    Given User Set method to POST L9
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L9
    And User input HTTP Body L9
    And User click button test Request L9
    Then Show the verify result 400 Bad Request L9
    
  @outpatientsessions.L10
  Scenario Outline: User want to add new outpatientsessions using invalid schedule date
    Given User Set method to POST L10
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L10
    And User input HTTP Body L10
    And User click button test Request L10
    Then Show the verify result 400 Bad Request L10
    
  @outpatientsessions.L11
  Scenario Outline: User want to add new outpatientsessions using invalid schedule time
    Given User Set method to POST L11
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L11
    And User input HTTP Body L11
    And User click button test Request L11
    Then Show the verify result 400 Bad Request L11
    
  @outpatientsessions.L12
  Scenario Outline: User want to add new outpatientsessions using data that already submitted
    Given User Set method to POST L12
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L12
    And User input HTTP Body L12
    And User click button test Request L12
    Then Show the verify result 400 Bad Request L12
    
  @outpatientsessions.L13
  Scenario Outline: User want to add new outpatientsessions using invalid method request
    Given User Set method to PUT L13
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions L13
    And User input HTTP Body L13
    And User click button test Request L13
    Then Show the verify result 405 Method Not Allowed L13