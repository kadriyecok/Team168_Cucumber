Feature: US1012 Kullanici excel olarak verilen urunlerle arama testi yapar

  Scenario Outline:TC21 Kullanici excel'deki urunleri istenen miktarda bulabilmeli

    Given kullanici "toUrl" anasayfaya gider
    When excel dosyasi ile ilgili ayarlari yapip Sheet1'e gelir
    Then urun excelindeki "<istenenSatir>" daki urunun min. miktarini ve urun ismini kaydeder
    And urun ismini testotomasyonu sayfasinda arar ve sonuc sayisini kaydeder
    And bulunan urun sayisinin excel'deki min. miktara esit veya fazla oldugunu test eder
    Then bulunan sonuc sayisini excelde "<istenenSatir>" daki 4. sutuna yazdirir


    Examples:
      |istenenSatir|
      |2          |
      |3          |
      |4          |
      |5          |
      |6          |
      |7          |
      |8          |
      |9          |
      |10         |