
@MyCRUD
Feature: User Account Management

  Scenario: Successfull user registration

  # Sign Up endpoint’i için base url ayarlanır
    Given Base Url is set for the Sign Up endpoint

  # Geçerli kullanıcı bilgileri ile request body hazırlanır
    And Request body is prepared with valid user data

  # Kullanıcı POST isteğini gönderir
    And User sends POST request

  # Response status kodunun 200 olduğu doğrulanır
    Then Response status code should be 200
