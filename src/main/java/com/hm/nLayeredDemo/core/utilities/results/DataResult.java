package com.hm.nLayeredDemo.core.utilities.results;

/*
    Buradaki sınıfımızda datayı, işlem sonucu ve mesajı döndüren metodumuzu tanımlayacağız.
    Datayı da beraber döndürecek olan metodumuza farklı veri tipinde sınıflarda(ürünler, kategoriler, çalışanlar ve listeleri vs.) kullanacağı için
        data türünü generic olarak tanımlamamız gerekiyor.
    DataResult<T> şeklinde döndüreceğimiz veri tipini tanımladık. T olmasının sebebi tüm entityleri ortak karşılayan bir isimlendirme olması gerektiği için.
    DataResult sınıfında Result sınıfının aynı metotlarını(success ve message) yazmamak için Result sınıfını base olarak aldık.
    Result sınıfının içerisinde ki success ve message constructor'ları parametre beklemediği için super(success, message) keywordu
        ile base sınıfta çalışacak olan constructor metotlarımıza parametre geçirmemizi sağlar.
*/

public class DataResult<T> extends Result {
    private T data;

    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public DataResult(T data, boolean success) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
