@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarin "iphone" icerdigini dogrular
    Then close the application

  Scenario: TC01_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarin "toros" icerdigini dogrular
    Then close the application
