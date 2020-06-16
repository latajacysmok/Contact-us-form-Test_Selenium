$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/test.feature");
formatter.feature({
  "name": "Filling out the form and sending using \"Contact us\".",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@scenario"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verification of the application form \"Contact us\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to \"http://automationpractice.com/\" using \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click \"Contact us\" button",
  "keyword": "When "
});
formatter.step({
  "name": "Fill filling out the application form",
  "keyword": "And "
});
formatter.step({
  "name": "I can send message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser"
      ]
    },
    {
      "cells": [
        "CHROME"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of the application form \"Contact us\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"http://automationpractice.com/\" using \"CHROME\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStep.java:26"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Contact us\" button",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsStep.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill filling out the application form",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsFillStep.java:9"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can send message",
  "keyword": "Then "
});
formatter.match({
  "location": "SendMessageStep.java:7"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});