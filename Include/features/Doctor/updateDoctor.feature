@Updatedoctor
Feature: Update doctor Feature
	I want to use this template for my feature file

  @updatedoctor.I1
  Scenario Outline: User want to update doctor using valid method request
    Given User Set method to PUT I1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 I1
    And User input HTTP Body I1
    And User click button test Request I1
    Then Show the verify result 200 OK I1
    
  @updatedoctor.I2
  Scenario Outline: User want to update doctor using invalid method request
    Given User Set method to POST I2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 I2
    And User input HTTP Body I2
    And User click button test Request I2
    Then Show the verify result 405 Method Not Allowed I2
    
  @updatedoctor.I3
  Scenario Outline: User want to update doctor using invalid id
    Given User Set method to PUT I3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/a I3
    And User input HTTP Body I3
    And User click button test Request I3
    Then Show the verify result 400 Bad Request I3
    
  @updatedoctor.I4
  Scenario Outline: User want to update doctor using invalid input body
    Given User Set method to PUT I4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 I4
    And User input HTTP Body I4
    And User click button test Request I4
    Then Show the verify result 400 Bad Request I4
    
  @updatedoctor.I5
  Scenario Outline: User want to update doctor using invalid token
    Given User Set method to PUT I5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 I5
    And User input HTTP Body I5
    And User click button test Request I5
    Then Show the verify result 400 Bad Request I5