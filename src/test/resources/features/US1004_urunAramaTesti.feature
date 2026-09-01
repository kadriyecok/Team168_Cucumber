
  Feature: US1004 kullanici aradigi kelime icin uygun sonuc bulur


    Scenario: TC10 Kullanici aradigi kelime sonucunda bulunan urun isimlerinin
                   arattirdigi kelimeyi icerdigini test edebilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      Then ilk urunu tiklar
      And acilan sayfadaki urun isminin case sensitive olmadan phone icerdigini test eder
      And sayfayi kapatir