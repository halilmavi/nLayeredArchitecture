package com.hm.nLayeredDemo.core.utilities.results;

// SuccessDataResult sınıfımızda  işlemin başarılı olma durumunu varsayılan olarak true ayarladık.
// Başarılı işlemlerde direkt bu sınıfımızın constructor metodumuzu kullanma işlemi yapacağız.
// Bİrden fazla constructor tanımlayarak metodumuzun farklı parametrelere alarak istenilen parametrenin gönderilmesi çeşitlendirilebiliriz.

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }

    public SuccessDataResult(T data) {
        super(data, true);
    }

    public SuccessDataResult(String message) {
        super(null, true, message);
    }

    public SuccessDataResult() {
        super(null, true);
    }

}