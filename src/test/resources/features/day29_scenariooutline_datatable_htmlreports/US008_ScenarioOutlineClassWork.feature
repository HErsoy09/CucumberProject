#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım
@US008
Feature: US008 DataTables Testi

  Scenario Outline: TC01 DataTables Veri Girisi

    Given kullanici "https://editor.datatables.net" sayfasina gider
    When sayfadaki tabloda new butonuna basar
    And verilen bilgileri girer "<firstname>", "<lastname>", "<position>", "<office>", "<extension>", "<startdate>", "<salary>"
    And create butonuna basar
    And search bolumune "<firstname>" bilgisini girer
    Then "<firstname>" ile basarili bir kayit yapildigini dogrular
    And sayfayi kapatir
    Examples:
      | firstname | lastname | position    | office  | extension | startdate  | salary  |
      | john      | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam       | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy     | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george    | smith    | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry     | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |