
@MyCRUD
Feature: User Account Management

  Scenario: Successfull user registration
    Given Base Url is set for the Sign Up endpoint
    And Request body is prepared with valid user data
    And User sends POST request
    Then Response status code should be 200