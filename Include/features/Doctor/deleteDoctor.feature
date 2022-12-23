@DeleteDoctor
Feature: delete Doctor Feature
	I want to use this template for my feature file

  @deletedoctor.J1
  Scenario Outline: User want to delete doctor using valid method request
    Given User Set method to DELETE J1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J1
    And User click button test Request J1
    Then Show the verify result 200 OK J1
    
  @deletedoctor.J2
  Scenario Outline: User want to delete doctor using invalid method request
    Given User Set method to POST J2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J2
    And User click button test Request J2
    Then Show the verify result 405 Method Not Allowed J2
    
  @deletedoctor.J3
  Scenario Outline: User want to delete doctor using invalid id
    Given User Set method to DELETE J3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J3
    And User click button test Request J3
    Then Show the verify result 400 Bad Request J3
    
  @deletedoctor.J4
  Scenario Outline: User want to delete doctor using invalid token
    Given User Set method to DELETE J4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J4
    And User click button test Request J4
    Then Show the verify result 400 Bad Request J4