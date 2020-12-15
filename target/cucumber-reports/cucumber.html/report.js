$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/gitgetapi.feature");
formatter.feature({
  "name": "Testing get call for a git api",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Fetch the response of git api",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Testkmp"
    }
  ]
});
formatter.step({
  "name": "user launches the api using restassuredgit",
  "keyword": "Given "
});
formatter.match({
  "location": "GitGetApi.user_launches_the_api_using_restassuredgit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "conditionAgit",
  "keyword": "When "
});
formatter.match({
  "location": "GitGetApi.conditionagit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "resultAgit",
  "keyword": "Then "
});
formatter.match({
  "location": "GitGetApi.resultagit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "resultBgit",
  "keyword": "And "
});
formatter.match({
  "location": "GitGetApi.resultbgit()"
});
formatter.result({
  "status": "passed"
});
});