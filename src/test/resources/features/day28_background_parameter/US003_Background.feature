# TASK:
  # 3 tane Scenario oluşturunuz
  # Amazon sayfasında ihone, samsung ve nokia aratınız

@US003
Feature: US003 Amazon Testi

  Scenario: TC01 Arama kutusunda iphone aratilir
    Given kullanici amazon sayfasina gider
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda samsung aratilir
    Given kullanici amazon sayfasina gider
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda nokia aratilir
    Given kullanici amazon sayfasina gider
    When arama kutusunda nokia aratir
    And sayfayi kapatir