Feature: US004 Parametre kullanimi
  Scenario: TC01 parametre kullanimi
    Given kullanici "https://www.hepsiburada.com/" sayfasinda
    Then kullanici 3 sn bekler
    And sayfayi kapatir
