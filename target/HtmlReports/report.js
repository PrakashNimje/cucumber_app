$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/SignIN.feature");
formatter.feature({
  "name": "Test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Prakash@lapits.com",
        "Prakash@12345678"
      ]
    },
    {
      "cells": [
        "Prakashnimje800@gmail.com",
        "Prakash@8055"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.SignIN.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.SignIN.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Prakash@lapits.com and Prakash@12345678",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.SignIN.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.SignIN.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.SignIN.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.SignIN.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.SignIN.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Prakashnimje800@gmail.com and Prakash@8055",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.SignIN.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.SignIN.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.SignIN.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});