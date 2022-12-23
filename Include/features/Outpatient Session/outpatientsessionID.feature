@outpatientsessionID
Feature: Get outpatientsession By ID Feature
	I want to use this template for my feature file

  @alloutpatientsession.M1
  Scenario Outline: User want to get outpatientsession by id using valid method request
    Given User Set method to GET M1
    When User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M1
    And User click button test Request M1
    Then Show the verify result 200 OK M1

  @alloutpatientsession.M2
  Scenario Outline: User want to get outpatientsession by id using invalid method request
    Given User Set method to GET M2
    When User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M2
    And User click button test Request M2
    Then Show the verify result 405 Method Not Allowed M2
    
  @alloutpatientsession.M3
  Scenario Outline: User want to get outpatientsession by id using invalid id
    Given User Set method to GET M3
    When User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M3
    And User click button test Request M3
    Then Show the verify result 405 Bad Request M3