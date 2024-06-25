#USER STORY: US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli
#TEST DATA
#url: https://www.bluerentalcars.com/
#Managers:
# | ayhancan@bluerentalcars.com    | ayhan   |
# | beyhancan@bluerentalcars.com   | beyhan  |
# | sam.walker@bluerentalcars.com  | sami    |
# | john_doe@gmail.com             | johndoe |
# | johnson@bluerentalcars.com     | johnson |

@US007
Feature: US007 Blue Rental Car Login Test
  Scenario Outline: TC01 kullanici tum manager login bilgileriyle giris yapabilmeli
    Given kullanici "https://www.bluerentalcars.com/" sayfasina gider
    When login butonuna tiklar
    And "<email>" ve "<password>" bilgileri ile login olur
    And blueRentalCar login oldugunu dogrular
    And sayfayi kapatir
    Examples:
      | email                          | password |
      | ayhancan@bluerentalcars.com    | ayhan    |
      | beyhancan@bluerentalcars.com   | beyhan   |
      | sam.walker@bluerentalcars.com  | sami     |
      | john_doe@gmail.com             | johndoe  |
      | johnson@bluerentalcars.com     | johnson  |