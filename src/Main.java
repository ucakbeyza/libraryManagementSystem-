// Kitap durumu için enum
enum KitapDurumu {
    MEVCUT,
    ODUNC_VERILMIS,
    REZERVE
}

// Kitap sınıfı (özellikleri kapsüllenmiş)
class Kitap {
    private String title;
    private String author;
    private KitapDurumu status;

    // Yapıcı metot
    public Kitap(String title, String author, KitapDurumu status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    // title (kitap adı) için getter ve setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // author (yazar) için getter ve setter
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // status (durum) için getter ve setter
    public KitapDurumu getStatus() {
        return status;
    }
    public void setStatus(KitapDurumu status) {
        this.status = status;
    }

    // Kitap bilgilerini yazdırmak için toString metodu
    @Override
    public String toString() {
        return "Kitabın Adı: " + title + ", Kitabın Yazarı: " + author + ", Kitabın Durumu: " + status;
    }
}

// Kütüphane sınıfı, kitapları yönetmek için metodları içerir
class Kutuphane {
    private Kitap[] kitaplar;
    private int kitapSayisi;

    // Kütüphaneyi belirli bir kapasite ile başlatmak için yapıcı metot
    public Kutuphane(int kapasite) {
        kitaplar = new Kitap[kapasite];
        kitapSayisi = 0;
    }

    // Yeni bir kitap eklemek için metot
    public void addBook(Kitap kitap) {
        if (kitapSayisi < kitaplar.length) {
            kitaplar[kitapSayisi] = kitap;
            kitapSayisi++;
        } else {
            System.out.println("Kütüphane dolu, yeni kitap eklenemiyor.");
        }
    }

    // Kütüphanedeki tüm kitapları listelemek için metot
    public void displayBooks() {
        System.out.println("Kütüphanedeki Tüm Kitaplar:");
        for (int i = 0; i < kitapSayisi; i++) {
            System.out.println(kitaplar[i]);
        }
    }

    // Mevcut (status == KitapDurumu.MEVCUT) olan kitapları bulup listelemek için metot
    public void findAvailableBooks() {
        System.out.println("Mevcut Olan Kitaplar:");
        for (int i = 0; i < kitapSayisi; i++) {
            if (kitaplar[i].getStatus() == KitapDurumu.MEVCUT) {
                System.out.println(kitaplar[i]);
            }
        }
    }
}

// Kütüphane yönetim sistemini test etmek için ana program
public class Main {
    public static void main(String[] args) {
        // 5 kitap kapasitesine sahip bir kütüphane oluştur
        Kutuphane kutuphane = new Kutuphane(5);

        // Farklı durumlarda kitaplar ekle
        kutuphane.addBook(new Kitap("Duvar", "Atilla İLHAN", KitapDurumu.ODUNC_VERILMIS));
        kutuphane.addBook(new Kitap("Satranç", "Stefan ZWEİG", KitapDurumu.MEVCUT));
        kutuphane.addBook(new Kitap("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi TANPINAR", KitapDurumu.REZERVE));
        kutuphane.addBook(new Kitap("İçimizdeki Şeytan", "Sabahattin ALİ", KitapDurumu.ODUNC_VERILMIS));
        kutuphane.addBook(new Kitap("Beyaz Diş", "Jack LONDON", KitapDurumu.MEVCUT));

        // Tüm kitapları listele
        kutuphane.displayBooks();

        // Sadece mevcut olan kitapları listele
        kutuphane.findAvailableBooks();
    }
}
