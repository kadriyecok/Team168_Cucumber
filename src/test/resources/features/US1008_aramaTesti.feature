
  Feature: US1008 kullanici arama yaptigi urunun bulundugunu test eder


    Scenario: TC17 kullanici aradigi kelimeyi barindiran urun bulunabildigini test eder

      Given kullanici "toUrl" anasayfaya gider
      When arama kutusuna config dosyasindaki toAranacakKelime yazip aratir
      Then ilk urunu tiklar
      And acilan sayfadaki urun isminde case sensitive olmadan config dosyasindaki toAranacakKelime oldugunu test eder
