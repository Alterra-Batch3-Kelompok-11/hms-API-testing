@createdoctor
Feature: Create doctor Feature
	I want to use this template for my feature file
  
  @doctor.F1
  Scenario Outline: User want to add new doctor using valid input
    Given User Set method to POST F1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F1
    And User input HTTP Body F1
    And User click button test Request F1
    Then Show the verify result 200 OK F1

  @doctor.F2
  Scenario Outline: User want to add new doctor by blank name
    Given User Set method to POST F2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F2
    And User input HTTP Body F2
    And User click button test Request F2
    Then Show the verify result 400 Bad Request F2
    
  @doctor.F3
  Scenario Outline: User want to add new doctor by blank license number
    Given User Set method to POST F3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F3
    And User input HTTP Body F3
    And User click button test Request F3
    Then Show the verify result 400 Bad Request F3
    
  @doctor.F4
  Scenario Outline: User want to add new doctor by blank password
    Given User Set method to POST F4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F4
    And User input HTTP Body F4
    And User click button test Request F4
    Then Show the verify result 400 Bad Request F4
    
  @doctor.F5
  Scenario Outline: User want to add new doctor by blank speciality id
    Given User Set method to POST F5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F5
    And User input HTTP Body F5
    And User click button test Request F5
    Then Show the verify result 400 Bad Request F5
    
  @doctor.F6
  Scenario Outline: User want to add new doctor by blank birth date
    Given User Set method to POST FG
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors FG
    And User input HTTP Body FG
    And User click button test Request FG
    Then Show the verify result 400 Bad Request FG
    
  @doctor.F7
  Scenario Outline: User want to add new doctor by blank phone
    Given User Set method to POST F7
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F7
    And User input HTTP Body F7
    And User click button test Request F7
    Then Show the verify result 400 Bad Request F7
    
  @doctor.F8
  Scenario Outline: User want to add new doctor by blank marital status
    Given User Set method to POST F8
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F8
    And User input HTTP Body F8
    And User click button test Request F8
    Then Show the verify result 400 Bad Request F8
    
  @doctor.F9
  Scenario Outline: User want to add new doctor by blank email
    Given User Set method to POST F9
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F9
    And User input HTTP Body F9
    And User click button test Request F9
    Then Show the verify result 400 Bad Request F9
    
  @doctor.F10
  Scenario Outline: User want to add new doctor using invalid name
    Given User Set method to POST F10
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F10
    And User input HTTP Body F10
    And User click button test Request F10
    Then Show the verify result 400 Bad Request F10
    
  @doctor.F11
  Scenario Outline: User want to add new doctor using invalid license number
    Given User Set method to POST F11
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F11
    And User input HTTP Body F11
    And User click button test Request F11
    Then Show the verify result 400 Bad Request F11
    
  @doctor.F12
  Scenario Outline: User want to add new doctor using invalid password
    Given User Set method to POST F12
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F12
    And User input HTTP Body F12
    And User click button test Request F12
    Then Show the verify result 400 Bad Request F12
    
  @doctor.F13
  Scenario Outline: User want to add new doctor using invalid speciality id
    Given User Set method to POST F13
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F13
    And User input HTTP Body F13
    And User click button test Request F13
    Then Show the verify result 400 Bad Request F13
    
  @doctor.F14
  Scenario Outline: User want to add new doctor using invalid birth date
    Given User Set method to POST F14
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F14
    And User input HTTP Body F14
    And User click button test Request F14
    Then Show the verify result 400 Bad Request F14
    
  @doctor.F15
  Scenario Outline: User want to add new doctor using invalid phone
    Given User Set method to POST F15
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F15
    And User input HTTP Body F15
    And User click button test Request F15
    Then Show the verify result 400 Bad Request F15
    
  @doctor.F16
  Scenario Outline: User want to add new doctor using invalid marital status
    Given User Set method to POST F16
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F16
    And User input HTTP Body F16
    And User click button test Request F16
    Then Show the verify result 400 Bad Request F16
    
  @doctor.F17
  Scenario Outline: User want to add new doctor using invalid email
    Given User Set method to POST F17
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F17
    And User input HTTP Body F17
    And User click button test Request F17
    Then Show the verify result 400 Bad Request F17
    
  @doctor.F18
  Scenario Outline: User want to add new doctor using data that already submitted
    Given User Set method to POST F18
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F18
    And User input HTTP Body F18
    And User click button test Request F18
    Then Show the verify result 400 Bad Request F18
    
  @doctor.F19
  Scenario Outline: User want to add new doctor using invalid method request
    Given User Set method to PUT F19
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F19
    And User input HTTP Body F19
    And User click button test Request F19
    Then Show the verify result 405 Method Not Allowed F19