# TASK:
  # 3 tane Scenario oluşturunuz
  # Amazon sayfasında ihone, samsung ve nokia aratınız

@US003
Feature: US003 Amazon Testi

  Background:
    Given kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 Arama kutusunda iphone aratilir
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  @samsung @smoke @hakan
  Scenario: TC02 Arama kutusunda samsung aratilir
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 Arama kutusunda nokia aratilir
    When arama kutusunda nokia aratir
    And sayfayi kapatir