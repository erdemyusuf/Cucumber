Feature: US013 parametre kullanimi

  @grup6
  Scenario:TC02 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 sn bekler
    When url nin "amazon" icerdigini test edin
    And sayfayi kapatir