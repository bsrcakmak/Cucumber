@google_search
Feature: ilk feature file

  # Background -> BeforeMethod gibi, precondition
  Background: Google_sayfasina_git
    Given kullanici google gider

  @iphone
  Scenario: TC01_google_iphone_arama
    When kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini dogrular
    Then close the application


  @tesla  #tek basina calistirmak istedigimiz senaryoyu Runner classinda tag olarak tanimlayip burda senaryonun basina yaziyoruz
  Scenario: TC02_google_tesla_arama
    When kullanici tesla icin arama yapar
    Then sonuclarin tesla icerdigini dogrular
    Then close the application



# 1. Her feature file, Feature: kelimesi ile baslamak zorundadir
# 2. Her bir file da, yanliz bir Feature: kullanilabilir
# 3. Senaryo(TEST CASE) olusturmak icin Scenario: kelimesi kullanilir
# 4. Birden fazla Scenario: kullanilabilir
# 5. Herbir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
# 6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
# 7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
# 8. And,When -> Genelde ara adimlarda baglara olarak kullanilir
# NOTE: Teknik olarak istenilen kelime istenilen stepte kulanilabilir
#       ama anlam karmasasi olmamasi icin bu adimlar takip edilir
# 9. Belirli senaryolari calistirmak icin cucumber tag ler kullanilir
# tag ler Feature, Scenario, Scenario Outline, Example
# 10. Background: Her bir Scenario kelimesinde ONCE tek bir sefer calisir



