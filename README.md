📚 Java Generics Uygulaması — Proje Dokümantasyonu

Bu proje, Java’da Generics kavramını üç farklı açıdan göstermeyi amaçlayan eğitimsel bir örnek setidir:

Generic Method, 2) Generic Interface, 3) Generic Class.
Odak; tip güvenliği, yeniden kullanılabilirlik ve tekrarsız tasarım ilkelerini, küçük ve birbirinden bağımsız senaryolarla somutlaştırmaktır.

🎯 Kapsam ve Hedef

Kapsam: Diziler üzerinde tipten bağımsız yazdırma, veritabanı işlemlerini arayüz üzerinden tipe göre soyutlama, generic sınıf ile operasyonları farklı varlık tiplerine yayma.

Hedef: Generics’in pratikte nasıl tanımlandığını ve davranışsal etkilerini (derleme zamanı tip kontrolü, API netliği, esneklik) anlaşılır örneklerle kavratmak.

🧱 Mimari Genel Bakış (Modüller)
1) GenericMethod Modülü

Amaç: Aynı işi (ör. ekrana yazdırma) farklı türde diziler (Integer[], String[], Double[]) üzerinde tek bir metod ile yapmak.
Çalışma Mantığı:

Uygulama, farklı türlerde diziler oluşturur.

Generic method (<T> ...) çağrısı ile her dizi, öğe tipine bakılmaksızın sırayla yazdırılır.

Konsolda önce bölüm başlıkları, ardından dizinin içerikleri görünür.

Veri Akışı (metinsel):

[ Diziler oluşturulur ]
          └─> [ Generic yazdırma çağrısı (T[]) ]
                     └─> [ Her öğe sırayla ekrana yazılır ]


Beklenen Gözlemler (konsol mesajları örüntüsü):

“INT dizi” başlığı ve alt çizgisi

1, 2, 3, ... değerlerinin satır satır yazılması

“String dizi” başlığı ve alt çizgisi

İsimlerin satır satır yazılması

“Double dizi” başlığı ve alt çizgisi

Ondalıklı sayıların satır satır yazılması

2) GenericInterface Modülü

Amaç: Veritabanı operasyonlarını (ekle/sil/güncelle) tipten bağımsız bir arayüz üzerinden tanımlayıp, müşteri varlığı için somutlamak.
Bileşenler:

IVeritabanı<T>: ekle(T), sil(T), guncelle(T) imzalarını barındıran generic arayüz.

VeriTabaniImpl: Arayüzün Müsteri tipiyle uygulanmış (implement) hali; her işlemde bilgilendirici bir mesaj üretir.

Müsteri (model): id, isim, soyisim alanlarına sahip basit varlık (entity) sınıfı.

Main (senaryo): VeriTabaniImpl üzerinden sırayla ekle, sil, guncelle çağrıları yaparak akışı demonstratif olarak gösterir.

İş Akışı (metinsel):

[ IVeritabanı<T> sözleşmesi ]
      └─> [ VeriTabaniImpl (T = Müsteri) ]
               └─> [ ekle | sil | guncelle çağrıları ]
                         └─> [ Konsol bilgilendirme mesajları ]


Beklenen Gözlemler (konsol mesajları örüntüsü):

“Müşteri eklendi”

“Müşteri silindi”

“Müşteri güncellendi”

3) Generic Class Modülü

Amaç: Tek bir sınıfın (ör. VeriTabani<T>) farklı varlık tipleri ile çalışabilirliğini göstermek.
Bileşenler:

VeriTabani<T>: Generic sınıf; örnek senaryoda sil(T) operasyonu tip güvenli şekilde sunulur, ayrıca eğitimsel amaçla domain’e özgü bir kaydet işlemi gösterilir.

Ogrenci ve Musteri (modeller): Her biri id, ad, soyad alanlarını taşır ve veri operasyonlarının farklı tiplerle kurgulanabileceğini temsil eder.

Main (senaryo): VeriTabani<Ogrenci> örneği oluşturur ve veri işlemleri bağlamında generic sınıf örneklemesini demonstratif biçimde vurgular.

Kavramsal Odak:

Generic sınıf örneklemesi ile derleme zamanı tip belirleme (VeriTabani<Ogrenci>, VeriTabani<Musteri> gibi).

API netliği: Aynı sınıf tanımı, farklı tipler için yeniden kullanılabilir.

Veri Akışı (metinsel):

[ VeriTabani<T> örneklenir (ör. T = Ogrenci) ]
          └─> [ Tip güvenli operasyonlar ]
                    └─> [ Konsol bilgilendirme mesajları ]


Beklenen Gözlemler (konsol mesajları örüntüsü):

“Veri tabanından silindi”

“Veri tabanına kaydedildi” benzeri bilgilendirmeler

🧠 Tasarım İlkeleri (Projede Somutlaşan Noktalar)

Tekrarsızlık (DRY): Aynı işi yapan ama farklı tiplerle çalışan kodlar, tek bir generic tanım altında toplanır (ör. generic method ile dizi yazdırma).

Tip Güvenliği: Tür parametresi (<T>) ile derleme zamanında kontrol sağlanır; API yanlış kullanımlara karşı daha korunaklı hale gelir.

Soyutlama ve Genişletilebilirlik: Generic arayüz, işlevleri sözleşme olarak tanımlar; her domain tipi için ayrı implementasyon geliştirilebilir.

Yeniden Kullanılabilirlik: Generic sınıf/arayüz/metotlar, farklı modeller üzerinde tekrar tekrar kullanılabilir.
