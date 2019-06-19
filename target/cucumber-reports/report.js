$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Simple_Smoke_Test_LeadGen.feature");
formatter.feature({
  "line": 2,
  "name": "I want to perform a simple smoke test for leadgen in prod",
  "description": "",
  "id": "i-want-to-perform-a-simple-smoke-test-for-leadgen-in-prod",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Simple_SmokeTest_LeadGen"
    }
  ]
});
formatter.before({
  "duration": 2258375915,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user i want to test leadGen so that i can get thank you page after entering Email",
  "description": "",
  "id": "i-want-to-perform-a-simple-smoke-test-for-leadgen-in-prod;as-a-user-i-want-to-test-leadgen-so-that-i-can-get-thank-you-page-after-entering-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    Given user count all record from database for a specific email"
    }
  ],
  "line": 7,
  "name": "User navigate to LeadGen in Prod",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter Email",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User verify that thankyou page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Simple_SmokeTest_LeadGen_Steps.user_navigate_to_LeadGen_in_Prod()"
});
formatter.result({
  "duration": 1409130793,
  "status": "passed"
});
formatter.match({
  "location": "Simple_SmokeTest_LeadGen_Steps.user_enter_Email()"
});
formatter.result({
  "duration": 3331659880,
  "status": "passed"
});
formatter.match({
  "location": "Simple_SmokeTest_LeadGen_Steps.user_Click_on_Submit_button()"
});
formatter.result({
  "duration": 2139320987,
  "status": "passed"
});
formatter.match({
  "location": "Simple_SmokeTest_LeadGen_Steps.user_verify_that_thankyou_page_is_displayed()"
});
formatter.result({
  "duration": 2036960705,
  "status": "passed"
});
formatter.match({
  "location": "Simple_SmokeTest_LeadGen_Steps.user_close_the_browser()"
});
formatter.result({
  "duration": 208845126,
  "status": "passed"
});
formatter.after({
  "duration": 77162933,
  "status": "passed"
});
});