#Autor Faver Delgado

  @stories
  Feature: I as user of the UTest
    i want to create a new register
  to access as user

  Scenario: Sucessfull user creation
    Given user in the home page
    When user create an account filling all fileds
    Then user sees its username
