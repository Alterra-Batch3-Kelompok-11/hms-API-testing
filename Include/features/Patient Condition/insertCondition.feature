@createinsertcondition
Feature: Create insertcondition Feature
	I want to use this template for my feature file
  
  @insertcondition.Q1
  Scenario Outline: User want to add new insertcondition using valid input
    Given User Set method to POST Q1
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q1
    And User input HTTP Body Q1
    And User click button test Request Q1
    Then Show the verify result 200 OK Q1

  @insertcondition.Q2
  Scenario Outline: User want to add new insertcondition by blank outpatient session id
    Given User Set method to POST Q2
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q2
    And User input HTTP Body Q2
    And User click button test Request Q2
    Then Show the verify result 400 Bad Request Q2
    
  @insertcondition.Q3
  Scenario Outline: User want to add new insertcondition by blank description
    Given User Set method to POST Q3
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q3
    And User input HTTP Body Q3
    And User click button test Request Q3
    Then Show the verify result 400 Bad Request Q3
    
  @insertcondition.Q4
  Scenario Outline: User want to add new insertcondition by blank medicine
    Given User Set method to POST Q4
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q4
    And User input HTTP Body Q4
    And User click button test Request Q4
    Then Show the verify result 400 Bad Request Q4
    
  @insertcondition.Q5
  Scenario Outline: User want to add new insertcondition by blank allergy
    Given User Set method to POST Q5
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q5
    And User input HTTP Body Q5
    And User click button test Request Q5
    Then Show the verify result 400 Bad Request Q5
     
  @insertcondition.Q6
  Scenario Outline: User want to add new insertcondition using invalid outpatient session id
    Given User Set method to POST Q6
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q6
    And User input HTTP Body Q6
    And User click button test Request Q6
    Then Show the verify result 400 Bad Request Q6
    
  @insertcondition.Q7
  Scenario Outline: User want to add new insertcondition using invalid description
    Given User Set method to POST Q7
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q7
    And User input HTTP Body Q7
    And User click button test Request Q7
    Then Show the verify result 400 Bad Request Q7
    
  @insertcondition.Q8
  Scenario Outline: User want to add new insertcondition using invalid medicine
    Given User Set method to POST Q8
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q8
    And User input HTTP Body Q8
    And User click button test Request Q8
    Then Show the verify result 400 Bad Request Q8
    
  @insertcondition.Q9
  Scenario Outline: User want to add new insertcondition using invalid allergy
    Given User Set method to POST Q9
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q9
    And User input HTTP Body Q9
    And User click button test Request Q9
    Then Show the verify result 400 Bad Request Q9
       
  @insertcondition.Q10
  Scenario Outline: User want to add new insertcondition using data that already submitted
    Given User Set method to POST Q10
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q10
    And User input HTTP Body Q10
    And User click button test Request Q10
    Then Show the verify result 400 Bad Request Q10
    
  @insertcondition.Q11
  Scenario Outline: User want to add new insertcondition using invalid method request
    Given User Set method to PUT Q11
    When User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q11
    And User input HTTP Body Q11
    And User click button test Request Q11
    Then Show the verify result 405 Method Not Allowed Q11