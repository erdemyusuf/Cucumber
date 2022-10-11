Feature: S007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3 sn bekler
    When url nin "<arananKelime>" icerdigini test edin
    And sayfayi kapatir

    Examples:
      | arananUrl | arananKelime |
      | amazonUrl | amazon       |
      | facebookUrl   | face     |
      | brcUrl    | blue         |

