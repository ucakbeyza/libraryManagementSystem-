Kütüphane Yönetim Sistemi
Bir şehirde küçük bir kütüphane bulunmaktadır. Bu kütüphane, yerel halkın okuma alışkanlıklarını geliştirmek için birçok kitap barındırmaktadır. Kütüphanenin yönetimi, kitapları takip etmek ve kullanıcıların kitapları kolayca bulabilmesi için bir yazılım geliştirmeye karar verir. Siz de bu yazılımın bir parçası olacaksınız.
Kütüphane yönetim sistemi oluşturmak için aşağıdaki görevleri yerine getirin:
1.	Kitap Durumu :
o	KitapDurumu adında bir enum oluşturun. Bu enum, aşağıdaki durumları içermelidir:
	MEVCUT
	ÖDÜNÇ VERİLMİŞ
	REZERVE
2.	Kitap Sınıfı Oluşturma:
o	Kitap adında bir sınıf oluşturun. Bu sınıf, aşağıdaki özellikleri kapsamalıdır:
	title (String): Kitabın adı
	author (String): Yazarın adı
	status (KitapDurumu): Kitabın durumu
o	Bu özellikler için encapsulation kullanarak getter ve setter metodları yazın.
3.	Kütüphane Sınıfı Oluşturma:
o	Kutuphane adında bir sınıf oluşturun. Bu sınıf, kitapları tutmak için bir dizi (Kitap[]) kullanmalıdır.
o	Dizi boyutunu kurucu metot ile ayarlayın. Kurucu metot, kütüphane açıldığında kaç kitap barındıracağını almalıdır.
o	Ayrıca, aşağıdaki metodları tanımlayın:
	addBook(Kitap kitap): Yeni bir kitap ekler.
	displayBooks(): Kütüphanedeki tüm kitapları listeleyen bir metot. (Döngü kullanın)
	findAvailableBooks(): Mevcut olan (status == KitapDurumu.MEVCUT) kitapları listeleyen bir metot.
4.	Ana Program:
o	Ana programda Kutuphane nesnesi oluşturun ve birkaç kitap ekleyin.
o	Kitapları eklerken, her birinin durumunu (MEVCUT, ÖDÜNÇVERİLMİŞ, REZERVE) belirleyin.
o	Ardından, tüm kitapları ve mevcut olan kitapları listeleyin.
