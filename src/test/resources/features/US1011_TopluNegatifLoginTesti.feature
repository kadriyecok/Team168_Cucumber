
  Feature: US1011 Belirlenen bilgilerle giris yapilamadigi kontrol edilir

    Scenario Outline: TC20 belirlenen gecersiz bilgilerle giris yapilamamali

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine basar
      When email olarak "<verilenEmail>" girer
      And password olarak "<verilenPassword>" girer
      And kodlari 2 saniye bekler
      And signIn butonuna basar
      Then sisteme giris yapilamadigini test eder


      Examples:
        |verilenEmail    		|verilenPassword    |
        |toGecerliMail  		|toGecersizPassword |
        |toGecersizMail  		|toGecersizPassword |
        |toGecersizMail2  		|toGecersizPassword2|
        |toGecersizMail  		|toGecersizPassword2|
        |toGecersizMail  		|toGecerliPassword  |
        |toGecersizMail2  		|toGecersizPassword |
