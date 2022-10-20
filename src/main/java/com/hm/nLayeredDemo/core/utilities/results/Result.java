package com.hm.nLayeredDemo.core.utilities.results;

/*
 Uygulamamızda client'lar bir data istediğinde veya gönderdiğinde; datayla birlikte işlem sonucunu ve bir mesajı görmek isteyebilir.
 Bu 3 alanlardan, datanın dönmesi zorunlu değil fakat işlem sonucu ve mesajı zorunlu olarak döndürmemiz gerekir.
 Bu sınıfta 2 alanı oluşturacağız. 3 nünde olduğu alanı aynı dosya dizininde başka bir sınıfta tanımlayacağız.
 İş sınıfı(ProductManager vs.) icerisinde parametre olarak sadece işlemin başarılı olup olmamasını yani true değerini gönderme işlemi yapmak istersek ilk metot tetiklenir.
 İşlem sonucunun yanında birde mesajda göndermek istersek ilk constructor metodumuzu overload ederek ikinci metot tetiklenir.
 İlk constructorda success'i set ettiğimiz için 2. constructorda tekrar set etmemize gerek yok. this(success) diyerek yine success' in referansına erişmiş oluyoruz.
*/
public class Result {

    private boolean success;
    private String message;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, String message) {
        this(success);
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

}