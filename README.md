Kütüphane Yönetim Sistemi
Bir şehirde küçük bir kütüphane bulunmaktadır. Bu kütüphane, yerel halkın okuma alışkanlıklarını geliştirmek için birçok kitap barındırmaktadır. Kütüphanenin yönetimi, kitapları takip etmek ve kullanıcıların kitapları kolayca bulabilmesi için bir yazılım geliştirmeye karar verir. Siz de bu yazılımın bir parçası olacaksınız.
Kütüphane yönetim sistemi oluşturmak için aşağıdaki görevleri yerine getirin:

1.	Kitap Durumu :
   
* KitapDurumu adında bir enum oluşturun. Bu enum, aşağıdaki durumları içermelidir:
    - MEVCUT
    -	ÖDÜNÇ VERİLMİŞ
    - REZERVE
      
2.	Kitap Sınıfı Oluşturma:
   
* Kitap adında bir sınıf oluşturun. Bu sınıf, aşağıdaki özellikleri kapsamalıdır:
    -	title (String): Kitabın adı
    -	author (String): Yazarın adı
    -	status (KitapDurumu): Kitabın durumu
      
* Bu özellikler için encapsulation kullanarak getter ve setter metodları yazın.
  
3.	Kütüphane Sınıfı Oluşturma:
   
*	Kutuphane adında bir sınıf oluşturun. Bu sınıf, kitapları tutmak için bir dizi (Kitap[]) kullanmalıdır.
  
*	Dizi boyutunu kurucu metot ile ayarlayın. Kurucu metot, kütüphane açıldığında kaç kitap barındıracağını almalıdır.
  
*	Ayrıca, aşağıdaki metodları tanımlayın:
  
    - addBook(Kitap kitap): Yeni bir kitap ekler.
    - displayBooks(): Kütüphanedeki tüm kitapları listeleyen bir metot. (Döngü kullanın)
    - findAvailableBooks(): Mevcut olan (status == KitapDurumu.MEVCUT) kitapları listeleyen bir metot.
      
5.	Ana Program:

*	Ana programda Kutuphane nesnesi oluşturun ve birkaç kitap ekleyin.
  
*	Kitapları eklerken, her birinin durumunu (MEVCUT, ÖDÜNÇVERİLMİŞ, REZERVE) belirleyin.
  
*	Ardından, tüm kitapları ve mevcut olan kitapları listeleyin.
