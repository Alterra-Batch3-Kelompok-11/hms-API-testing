@dashboardMobile
Feature: Get data from dashboard mobile
	I want to use this template for my feature file

  @dashboardmobile.P1
  Scenario Outline: User want to get doctor by id using valid method request
    Given User Set method to GET P1
    When User Set URL http://eP2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/dashboard/mobile/doctor/1 P1
    And User click button test Request P1
    Then Show the verify result 200 OK P1

  @dashboardmobile.P2
  Scenario Outline: User want to get doctor by id using invalid method request
    Given User Set method to GET P2
    When User Set URL http://eP2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/dashboard/mobile/doctor/1 P2
    And User click button test Request P2
    Then Show the verify result 405 Method Not Allowed P2
    
  @dashboardmobile.P3
  Scenario Outline: User want to get doctor by id using invalid id
    Given User Set method to GET P3
    When User Set URL http://eP2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/dashboard/mobile/doctor/1 P3
    And User click button test Request P3
    Then Show the verify result 405 Bad Request P3