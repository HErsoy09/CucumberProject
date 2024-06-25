@US006
Feature: US006 Google Testi Scenario Outline

  Scenario Outline: TC01 Arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "<cars>" aratir
    Then sayfa basliginin "<cars>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | cars |
      | ford |
      | volvo |
      | toyota |