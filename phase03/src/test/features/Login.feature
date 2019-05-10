@login
Feature: Login
  @p1
  Scenario: login with correct credentail
    Given  I open login page
    When I enter correct userName as "CN40780"
    When I enter correct password as "1qazxsw!"
    When I click login
    Then I go to home page

  @p2
  Scenario Outline: login with invalid credentail
    Given  I open login page
    When I　enter invalid userName as"<userName>"
    When I　enter invalid password as "<password>"
    When I click loginButton
    Then I see "<errorMessage>"

    Examples:
      |userName|password|errorMessage|
      |        |         |请输入ID(员工编号)。|
      | CN40780|       |请输入密码(Password)|