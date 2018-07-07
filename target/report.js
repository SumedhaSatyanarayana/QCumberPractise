$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("J:/workspace/Qcumber/src/cucumber/features/myfeature.feature");
formatter.feature({
  "name": "Proof of concept that my framework works",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Free CRM login test scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});