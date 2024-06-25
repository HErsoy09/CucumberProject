@US004
Feature: US004 Amazon Testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  @iphone
  Scenario: TC01 Arama kutusunda iphone aratilir
    When arama kutusunda "iphone" aratir
    And sayfayi kapatir

  @samsung
  Scenario: TC02 Arama kutusunda samsung aratilir
    When arama kutusunda "samsung" aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 Arama kutusunda nokia aratilir
    When arama kutusunda "nokia" aratir
    And sayfayi kapatir