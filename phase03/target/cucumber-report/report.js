$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "login with correct credentail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@p1"
    }
  ]
});
formatter.step({
  "name": "I open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iOpenLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct userName as \"CN40780\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.iEnterCorrectUserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct password as \"1qazxsw!\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.iEnterCorrectPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.iClickLoginBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iGoToHomePage()"
});
formatter.result({
  "status": "passed"
});
});