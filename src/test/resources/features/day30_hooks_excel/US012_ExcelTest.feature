@US012
Feature: US012 BlueRentalCar Sayfasinda Login Islemi
  Scenario: TC01 Excel'deki Email ve Password bilgileri Ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And kullanici 2 saniye bekler
    And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olur
    And sayfayi kapatir