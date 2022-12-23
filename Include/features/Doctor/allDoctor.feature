@Alldoctor
Feature: Get All doctor Feature
	I want to use this template for my feature file

  @alldoctor.G1
  Scenario Outline: User want to get all doctor using valid method request
    Given User Set method to GET G1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors G1
    And User click button test Request G1
    Then Show the verify result 200 OK G1

  @alldoctor.G2
  Scenario Outline: User want to get all doctor using invalid method request
    Given User Set method to GET G2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors G2
    And User click button test Request G2
    Then Show the verify result 405 Method Not Allowed G2