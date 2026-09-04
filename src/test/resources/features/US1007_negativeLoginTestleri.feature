
  Feature: US1007 Kullanici yanlis bilgilerle giris yapamaz

    Scenario: TC14 kullanici gecerli email ve gecersiz password ile giris yapamamali

      Given kullanici testotomasyonu anasayfaya gider
      Then account linkine basar
      And email olarak "toGecerliMail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      When sisteme giris yapilamadigini test eder


    @paralel2
    Scenario: TC15 kullanici gecersiz email ve gecerli password ile giris yapamamali

      Given kullanici testotomasyonu anasayfaya gider
      Then account linkine basar
      And email olarak "toGecersizMail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      When sisteme giris yapilamadigini test eder



    Scenario: TC16 kullanici gecersiz email ve gecersiz password ile giris yapamamali

      Given kullanici testotomasyonu anasayfaya gider
      Then account linkine basar
      And email olarak "toGecersizMail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      When sisteme giris yapilamadigini test eder
