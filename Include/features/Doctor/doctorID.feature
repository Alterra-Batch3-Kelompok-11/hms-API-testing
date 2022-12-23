@doctorID
Feature: Get doctor By ID Feature
	I want to use this template for my feature file

  @alldoctor.H1
  Scenario Outline: User want to get doctor by id using valid method request
    Given User Set method to GET H1
    When User Set URL http://eH2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors H1
    And User click button test Request H1
    Then Show the verify result 200 OK H1

  @alldoctor.H2
  Scenario Outline: User want to get doctor by id using invalid method request
    Given User Set method to GET H2
    When User Set URL http://eH2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors H2
    And User click button test Request H2
    Then Show the verify result 405 Method Not Allowed H2
    
  @alldoctor.H3
  Scenario Outline: User want to get doctor by id using invalid id
    Given User Set method to GET H3
    When User Set URL http://eH2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors H3
    And User click button test Request H3
    Then Show the verify result 405 Bad Request H3