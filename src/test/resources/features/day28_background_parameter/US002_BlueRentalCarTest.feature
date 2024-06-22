@US002
Feature: US002 Blue Rental Car - Login Test

  Scenario: TC01 Verilen Email ve Password ile Login olunur

    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayi kapatir