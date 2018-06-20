$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsScenario.feature");
formatter.feature({
  "line": 2,
  "name": "Create account of Facebook12",
  "description": "As a user you need to open facebook home page and do the validations",
  "id": "create-account-of-facebook12",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate First Name Field121",
  "description": "",
  "id": "create-account-of-facebook12;validate-first-name-field121",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsScenario.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 4467961360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 97770930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 16229215,
  "status": "passed"
});
formatter.match({
  "location": "TagsScenario.Close_browser()"
});
formatter.result({
  "duration": 622583381,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate create user multiple fields122",
  "description": "",
  "id": "create-account-of-facebook12;validate-create-user-multiple-fields122",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enters user \"Ryan\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters user \"Jack\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User checks user \"Ryan\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User Mobile field should be blank",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsScenario.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 4489123340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 92314175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 18
    }
  ],
  "location": "TagsScenario.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 68531542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 16568786,
  "status": "passed"
});
formatter.match({
  "location": "TagsScenario.user_Mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 20905979,
  "status": "passed"
});
formatter.match({
  "location": "TagsScenario.Close_browser()"
});
formatter.result({
  "duration": 595534806,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Validate First Name Field125",
  "description": "",
  "id": "create-account-of-facebook12;validate-first-name-field125",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsScenario.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 4509999701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 94292359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsScenario.User_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 17015200,
  "status": "passed"
});
formatter.match({
  "location": "TagsScenario.Close_browser()"
});
formatter.result({
  "duration": 642921647,
  "status": "passed"
});
});