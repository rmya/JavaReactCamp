## SOLID

### S -> Single-responsibility principle
* Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur, yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir.

### O -> Open-closed principle
* Bir sınıf ya da fonksiyon halihazırda var olan özellikleri korumalı ve değişikliğe izin vermemelidir. Yani davranışını değiştirmiyor olmalı ve yeni özellikler kazanabiliyor olmalıdır.

### L -> Liskov substitution principle
* Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz.

### I -> Interface segregation principle
* Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.

### D -> Dependency Inversion Principle
* Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.

## Lombok
* Kullanılan metodları bir satırlık notasyona indirgemeyi amaç edinmiş kütüphanedir. Maven projesinde pom.xml dosyamızda aşağıdaki şekilde gözükür.
```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.10</version>
</dependency>
```
@Getter ->  Ait olduğu alanın get methodunu oluşturulmuş olur.

@Setter ->  Aynı şekilde anatosyonu olduğu fieldin setter methodunu oluşturur.

@Data -> @Getter + @Setter işlemlerini ve bunun yanında equals(), canEqual(), hashCode(), toString() metodlarını ve boş constructor oluşturur.

@ToString -> toString() metodunu override eder. Hangi alanların olmayacağını söyleyebilirsiniz.

@AllArgsConstructor ->  Sınıfın Constructorını üretir.Bu Constructor sınıftaki tüm fieldleri parametre olarak almıştır.

@NoArgsConstructor ->  Parametresiz Constructor üretir.

@NonNull -> Bu anatosyan ile null kontrolü yapabiliriz. @NonNull notasyonu null gelen değer için NullPointerException fırlatmaktadır.

### Swagger
* JSON kullanılarak ifade edilen RESTful API'leri açıklamak için bir Arayüz Tanımlama Dilidir. Swagger, RESTful web hizmetlerini tasarlamak, oluşturmak, belgelemek ve kullanmak için bir dizi açık kaynaklı yazılım aracıyla birlikte kullanılır.
