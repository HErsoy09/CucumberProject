@US005
Feature: US005 Google Testi

  Background:
    Given kullanici "https://google.com" sayfasina gider

  Scenario: TC01 Arama kutusunda arac aratilir
    When google arama kutusunda "ford" aratir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda arac aratilir
    When google arama kutusunda "volvo" aratir
    Then sayfa basliginin "volvo" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda arac aratilir
    When google arama kutusunda "toyota" aratir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir