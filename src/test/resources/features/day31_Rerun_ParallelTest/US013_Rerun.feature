@US013
Feature: US013 Google Testi (Rerun)

  Background:
    Given kullanici "https://google.com" sayfasina gider

  @ford
  Scenario: TC01 Arama kutusunda arac aratilir
    When google arama kutusunda "ford" aratir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @volvo
  Scenario: TC02 Arama kutusunda arac aratilir
    When google arama kutusunda "volvo" aratir
    Then sayfa basliginin "volvooo" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @toyota
  Scenario: TC03 Arama kutusunda arac aratilir
    When google arama kutusunda "toyota" aratir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir