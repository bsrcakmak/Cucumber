@data_tables
Feature: data_tables
  Scenario: TC01_musteri_giris_testi
    Given kullanici "https://www.bluerentalcars.com/login" gider
    # | | -> datatable olusturmak icin kullanilir, DATATABLE SENARIO OUTLINE ILE DE KULLANILABILIR
    When kulanici emaili ve sifresini girer
      | email                         | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then close the application


