# 🌟 Java Generics — Profesyonel Örnekler

Bu proje, **Java Generics** kavramını öğrenmek ve uygulamak amacıyla geliştirilmiş kapsamlı bir örnek setidir.  
Üç ana bileşen üzerinden generics’in gücünü, esnekliğini ve tip güvenliğini somutlaştırır:  
**Generic Method**, **Generic Interface**, **Generic Class**.

---

## 🎯 Proje Amacı

- Farklı veri tipleriyle aynı işlemleri gerçekleştirebilen **esnek yapılar** oluşturmak.  
- Derleme zamanı **tip güvenliği** ile hataları erken yakalayabilmek.  
- Tekrar eden kodları minimize ederek **yeniden kullanılabilir ve okunabilir** sistemler tasarlamak.  
- Generics’in Java’daki **pratik ve akademik kullanımını** kavramak.

---

## 🧩 Modüller ve İşlevleri

### 1️⃣ Generic Method
- Amaç: Farklı türlerde dizileri tek bir metotla işlemek.  
- Çalışma mantığı:  
  - Her dizi, öğe tipine bakılmaksızın generic metot ile sırayla yazdırılır.  
  - Konsol çıktıları, tipler ayrılarak başlıklarla sunulur.  
- Kavramsal Akış:
[ Dizi oluştur ] → [ Generic metot çağrısı ] → [ Her öğeyi sırayla ekrana yaz ]

markdown
Kopyala
Düzenle

---

### 2️⃣ Generic Interface
- Amaç: Tipten bağımsız **veritabanı operasyonları** tanımlamak ve uygulamak.  
- Bileşenler:  
  - `IVeritabanı<T>` → `ekle`, `sil`, `guncelle` operasyonlarını soyutlar.  
  - `VeriTabaniImpl` → Generic arayüzün **Müşteri tipi** ile somut implementasyonu.  
  - `Müsteri` → Veri modeli.  
- Çalışma Mantığı:
[ Generic Interface (IVeritabanı<T>) ] → [ Implementasyon (VeriTabaniImpl) ] → [ Operasyon çağrısı ] → [ Konsol çıktısı ]

yaml
Kopyala
Düzenle

---

### 3️⃣ Generic Class
- Amaç: Tek bir sınıfın, farklı varlık tipleriyle güvenli ve yeniden kullanılabilir biçimde çalışmasını göstermek.  
- Bileşenler:  
  - `VeriTabani<T>` → Generic class, veri işlemlerini tip bağımsız sunar.  
  - `Ogrenci` ve `Musteri` → Farklı model sınıfları.  
- Çalışma Mantığı:
