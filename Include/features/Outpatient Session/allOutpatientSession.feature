@Alloutpatientsession
Feature: Get All outpatientsession Feature
	I want to use this template for my feature file

  @alloutpatientsession.K1
  Scenario Outline: User want to get all outpatientsession using valid method request
    Given User Set method to GET K1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions K1
    And User click button test Request K1
    Then Show the verify result 200 OK K1

  @alloutpatientsession.K2
  Scenario Outline: User want to get all outpatientsession using invalid method request
    Given User Set method to GET K2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions K2
    And User click button test Request K2
    Then Show the verify result 405 Method Not Allowed K2