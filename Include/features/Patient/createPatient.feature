@createPatient
Feature: Create Patient Feature
	I want to use this template for my feature file

  @patient.A1
  Scenario Outline: User want to add new patient using valid input
    Given User Set method to POST A1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A1
    And User input HTTP Body A1
    And User click button test Request A1
    Then Show the verify result 200 OK A1

  @patient.A2
  Scenario Outline: User want to add new patient by blank NIK
    Given User Set method to POST A2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A2
    And User input HTTP Body A2
    And User click button test Request A2
    Then Show the verify result 400 Bad Request A2
    
  @patient.A3
  Scenario Outline: User want to add new patient by blank name
    Given User Set method to POST A3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A3
    And User input HTTP Body A3
    And User click button test Request A3
    Then Show the verify result 400 Bad Request A3
    
  @patient.A4
  Scenario Outline: User want to add new patient by blank gender
    Given User Set method to POST A4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A4
    And User input HTTP Body A4
    And User click button test Request A4
    Then Show the verify result 400 Bad Request A4
    
  @patient.A5
  Scenario Outline: User want to add new patient by blank address
    Given User Set method to POST A5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A5
    And User input HTTP Body A5
    And User click button test Request A5
    Then Show the verify result 400 Bad Request A5
    
  @patient.A6
  Scenario Outline: User want to add new patient by blank phone
    Given User Set method to POST A6
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A6
    And User input HTTP Body A6
    And User click button test Request A6
    Then Show the verify result 400 Bad Request A6
    
  @patient.A7
  Scenario Outline: User want to add new patient by blank marital status
    Given User Set method to POST A7
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A7
    And User input HTTP Body A7
    And User click button test Request A7
    Then Show the verify result 400 Bad Request A7
    
  @patient.A8
  Scenario Outline: User want to add new patient by blank birth date
    Given User Set method to POST A8
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A8
    And User input HTTP Body A8
    And User click button test Request A8
    Then Show the verify result 400 Bad Request A8
    
  @patient.A9
  Scenario Outline: User want to add new patient by blank religion id
    Given User Set method to POST A9
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A9
    And User input HTTP Body A9
    And User click button test Request A9
    Then Show the verify result 400 Bad Request A9
    
  @patient.A10
  Scenario Outline: User want to add new patient using invalid NIk
    Given User Set method to POST A10
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A10
    And User input HTTP Body A10
    And User click button test Request A10
    Then Show the verify result 400 Bad Request A10
    
  @patient.A11
  Scenario Outline: User want to add new patient using invalid name
    Given User Set method to POST A11
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A11
    And User input HTTP Body A11
    And User click button test Request A11
    Then Show the verify result 400 Bad Request A11
    
  @patient.A12
  Scenario Outline: User want to add new patient using invalid gender
    Given User Set method to POST A12
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A12
    And User input HTTP Body A12
    And User click button test Request A12
    Then Show the verify result 400 Bad Request A12
    
  @patient.A13
  Scenario Outline: User want to add new patient using invalid address
    Given User Set method to POST A13
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A13
    And User input HTTP Body A13
    And User click button test Request A13
    Then Show the verify result 400 Bad Request A13
    
  @patient.A14
  Scenario Outline: User want to add new patient using invalid phone
    Given User Set method to POST A14
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A14
    And User input HTTP Body A14
    And User click button test Request A14
    Then Show the verify result 400 Bad Request A14
    
  @patient.A15
  Scenario Outline: User want to add new patient using invalid marital status
    Given User Set method to POST A15
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A15
    And User input HTTP Body A15
    And User click button test Request A15
    Then Show the verify result 400 Bad Request A15
    
  @patient.A16
  Scenario Outline: User want to add new patient using invalid birth date
    Given User Set method to POST A16
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A16
    And User input HTTP Body A16
    And User click button test Request A16
    Then Show the verify result 400 Bad Request A16
    
  @patient.A17
  Scenario Outline: User want to add new patient using invalid religion id
    Given User Set method to POST A18
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A18
    And User input HTTP Body A18
    And User click button test Request A18
    Then Show the verify result 400 Bad Request A18
    
  @patient.A18
  Scenario Outline: User want to add new patient by blank token bearer
    Given User Set method to POST A18
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A18
    And User input HTTP Body A18
    And User click button test Request A18
    Then Show the verify result 400 Bad Request A18
    
  @patient.A19
  Scenario Outline: User want to add new patient using data that already submitted
    Given User Set method to POST A19
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A19
    And User input HTTP Body A19
    And User click button test Request A19
    Then Show the verify result 400 Bad Request A19
    
  @patient.A20
  Scenario Outline: User want to add new patient using invalid method request
    Given User Set method to PUT A20
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A20
    And User input HTTP Body A20
    And User click button test Request A20
    Then Show the verify result 405 Method Not Allowed A20