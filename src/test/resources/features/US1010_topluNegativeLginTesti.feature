
  Feature: US1010 kullanici liste olarak verilen bilgilerle giris yapamaz

    Scenario Outline: TC19 liste olarak verilen gecersiz bilgilerle giris yapilamamali

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine basar
      When email olarak listede verilen "<verilenEmail>" girer
      And password olarak listede verilen "<verilenPassword>" girer
      And kodlari 2 saniye bekler
      And signIn butonuna basar
      Then sisteme giris yapilamadigini test eder


      Examples:
      |verilenEmail    		|verilenPassword    |
      |esra@fmail.com  		|1234555            |
      |gamze@gmail.com 	    |mesela123          |
      |zehra@zmail.com 	    |asdf4321           |
      |ayca@amail.com  	    |6543241tre65       |
      |gulnur@gmail.com	    |123ert678          |