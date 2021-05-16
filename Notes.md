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

### Upcasting 

* Bir referansı ya da nesneyi üst tipinden bir referansa atamaya upcasting(yükseltme) denir. 
Hiyerarşide aşağıda yer alan yani daha özel tiplerden olan nesneler, yerine geçebilme(substitutability) özelliğinden dolayı, yukarıda yer alan yani daha genel olan tipllerin referanslarına atanailir.
Her özel tipin nesnesi aynı hiyerarşideki daha genel tipten referansa atanabilir.

Ör: paySalary() metodunun, prametre olarak Employee alması demek, kendisine her tür Employee nesnesinin geçebilmesi demektir.
```
  public class PayrollOffice{
    public void paySalary(Employee e){
      double salary = e.calculateSalary();
      System.out.println("Paying a salary of " + salary + " to " + e.getName());
    }
  }
```
### Polymorphism

##### Program to an interface not an implementation

* Bir referansın, zamanın farklı anlarında, kendi yada alt tipinden olan nesneleri gösterebilmesine denir. Bir yaklaşımdır, upcasting ise onu gerçekleştiren mekanizmadır.
* *Aynı arayüze sahip nesneler arasında, nesnenin gerçek tipini bilmeden değişiklik yapılabilir.
* İki referansın birbiriyle haberleşip, birbirlerinin gerçek tiplerini bilmemeleri demektir.
* Upcasting sıklıkla metot paraetrelerinde görülür. Bu durum bir metoda daha genel tipten bir parametre almasına rağmen, o tipin tüm alt tiplerinden paramtre geçirilerek çağrılmasıyla oluşur.
* Polymorphisimde alt sınofların kendilerine has özelliklerini kullanamayız.
* Bir metodun polymorphic olması, arayüzünün sabit olmasına rağmen, overriding sayesinde, pek çok gerçekleştirmeye sahip olması ankamına gelir. Dolayısıyla farklı gerçekleştirmeler, aynı arayüzün arkasında saklanabilir, birbirleri yerine geçecek şekilde kullanılabilir.
* Bir metodun arayüzü, o metodun kendisi üzerinde çağroldığı referansın tipi tarafından belirlenir. O metodun hangi gerçekleştirmesinin çalışacağı ise referansın gösterdiği nesne tarafından belirlenir.

```
Employee e = new Employee();        //Employe as a interface
e.work();            // Employee's work()
Employee e = new Manager();
e.work();            // Manager's work()
Employee e = new Director();
e.work();             // Director's work()
```

* Hangi metodun çağrılacağı, referansın gösterdiği nesneye bağlı olduğundan ve bu ancak çalışma zamnında belli olacağından, derleme zamanında bilinemez.(üstteki gibi belli olmayan durumlarda)

* Metodun hangi gerçekleştirilmesinin çaprılacağı referansın göstediği nesne tarafından belirlenir.
```
Employee e = new Employee();        
e.work(); 
e = new Manager();
e.work();
e.manage();    // --> Compile time error
e = new Director();
e.work();
e.makeAStrategicPlan();  // --> Compile time error
```


### Binding

* Proğramlama dillerinde bağlama(binding), değişken, metod, vb. özelliklerin dilin elemanlarıyla ilişkilendirilmesidir.

     #### Static Binding
Statik bağlamada özelliklerin, dilin elemanlarıyla ilişkilendirilmesi çalışma zamanından önce yapılır ve proğramın çalışması sırasında değişmez.
Static bağlanan metodlar, bellekteki kodlarına derleyici tarafından derleme zamanında bağlanır --> early binding
Java'da static, private, final metodları static olarak bağlanırlar.  Static metodalar override edilemez.!
Static metodalar dinamaik metodlara göre daha hızlı çalışır.
override edilemeyen metodları final işaretleyerek çalışma zamanı performansı arttırılır.
     #### Dinamic Binding
Dinamik bağlamada ise özelliklerin, dilin elemanlarıyla ilişkilendirilmesi çalışma zamanında yapılır ve proğramın çalışma sırasında değişebilir.
isim, parametre, sayı ve tip konrolleri

* Çalışma zamanında üzerinde method çağrısı yapılan refaransın gösterdiği nesnenin gerçek tipi ortaya çıkana kadar bilinemez, ne zaman nesne belli olur, o zaman o nesnenin üzerindeki metodun çağrılacağı belli olur. Bu yüzden bu tür bağlmaya late binding(geç bağlama) denir.

```
Employee e = hr.getAnEmployee();
e.work();                           //çalışma zamanında nesne belirlenir --> late binding
System.out.println();
```

* Operation(ya da message) daha çok bir kalıtım hiyerarşisinde birden fazla gerçekleştirmesi olan ve hiyerarşinin en tepesinde tanımlanan metodun arayüzünü, metod ise o heyerarideki gerçekleştirmeleri temsil eder. Bu anlamda operation ilde daha kavramsal olarak davranış(behavior) kastedilir. Operation tasarım ve derleme zamanı, method ise derleme ve çalışma zamanı yapısıdır.

### Downcasting

* Üst tipten olan bir referansı ya da nesneyi alıp alt tipinden bir referansa atamaya alçaltma(downcasting) denir. Downcasting ile referansları, gösterdikleri nesnelerin gerçek tiplerine atayabiliriz.

```
Fruits fr = new FruitFactory.create();
fr.add(new Apple());
fr.add(new Banana());
fr.add(new Melon());

Object o = fr.get();     //elma ise soy ye , kavun ise kesip doğra ye kesen ve yiyenin farklılığına göre
Apple a = (Apple) o;     //Downcasting
a.peelof();
a.eat();
```
### instanceoff

* Cast operatörü kullanarak çevrim yaparken, .evrimin uygun bir tipe yapılmamasından doğacak ClassCastException sıra dışı durumunu önleminin yöntemi instanceof operatörüdür.
* instanceof operatörü sağa ve sola birer tane olmak üzere iki tane operand alır ve boolean döndürür.

```
// Test edilecek referans

Employee e = new Employee();
if(e instanceof Manager){
    Manager m = (Manager) e;
}
```

```
// Hedef tip

Employee e = new Manager();
if(e instanceof Manager){
    Manager m = (Manager) e;
}
```
* instanceof kullanımında, aralarında miras yani alt-üst ilişkisi olmayan bir referans ve tip kullanıldığında derleme zamanı hatası alınır. Çünkü derleyici instanceof operatörünün sol tarafındaki referans ile sağ tarafındaki tip arasında bir alt-üst ilişkisi olup olmadığını bilir. Böyle bir ilişki yoksa derleyici hata verir.

* instanceof operatörü, solundaki tipin alt tipinden olan tüm referanslar için true döndürür. Dolayısıyla birden fazla instanceof, ör: if-else yapısıyla kıyaslaması varsa en özel tipten en genel tipe doğru gitmek gerekir aksi taktirde kendisinden üretildiği sınıfı bulamayabilir.

### RunTime Type Identification(RTTI)
instanceod operatörü ile referansların gösterdiği nesnelerin gerçek tiplerini belirlemeye RunTime Type Identification(RTTI) denir. ----> RUN !

### Abstract Class
Nesnesi oluşturulmayan sınıflara denir. abstract anahtar kelimesi kullanarak yazılır. Soyut sınıfların nesnesi oluşturulamadığı için sadece kavramsal olarak ve hiyerarşinin en tepesinde, alt sınıfları için bir kalıp oluşturmak üzere vardırlar. 

* Soyut bir sınıfın metodu, o sınıfın tüm alt aınıflaarı tarafından override ediliyorsa bu durumda o metot sadece arayüz sağlıyor, gerçekleştirme sağlamıyor demektir. Çünkü sınıf soyut olduğundan o sınıfın hiç bir nesnesş oluşturulmuyor doyasıyla da metodun bu sınıftaki gerçekleştirmesi hiçbir şekilde çağrılmıyor demektir. Tüm alt sınıflar tarafından override edilen böyle metodlar aslen bir kalıp yada şablon olarak rol alırlar yani sadece arayüz sağlarlar.

### Abstract method
* Arayüzü olan ama gerçekleştirmesi olmayan metoda soyut metod denir. abstract ile nitelenir. Tanımında {} kulllanılmadan sadece arayüz olarak ifade edilir ve ; ile sonlanır.
Soyut metotlar ancak soyut sınıflarda bulunur. 

### Data Access Objects(DAO)

* Uygulmanızda iş soyutlamalarını temsil eden sınıfların nesnelerinin (entity) veri tabanında kalıcı olmaları gerekir. Bu amaçla Data Access Objects(DAO) kalıbından Dfaydalanılır. Her entity için bir DAO sınıfı oluşturulur. Her entity için oluşturulan Dao sınıfı, o entityin veri tabanıyla olan ilişkisini yani hayat döngüsünü(life cycle) yönetir.  Dolayısıyla Dao sınıflarında save(), retrieve() vb. crud metodları olur. Abstract Dao olarak bir sınıf oluşturulur. Bu sınıfı EmployeDao, ProductDao gibi sınıflar AbstractDao sınıfını override ederler.

### Interface
Tüm metodları soyut olan sınıftır.
Aşağıdaki tanımlar birbirine eşittir.
```
pubic interface Worker{                               ==          public interface Worker{
  public abstract void work();                                      void work();
}                                                                 }
```
Interface kendisinden miras alınacak yapılardır. Bir sınıf arayüzün alt tipi olarak miras devralırken implements anahtar kelimesini kulllanır.

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


****************************************************************************************************************************************************************************

# Hata Mesajları

### java.lang.ClassCastException
Eğer cast edilen nesne ya da referans gösterdiği nesne, hedef tipten ya da onun alt tipinden değilse, bu durumda çalışma zamanında java.langClassException oluşur.
* ClassCastException java.lang paketindeki sıra dışı durum sınıflarındandır.
* Bir nesne, nesnesi olmadığı, kendi tipinin alt tiplerinden birine çerilmeye çalışıldığında fırlatılır.
* Engelleme yöntemi -->  instanceof operatörü kullanmaktır.
