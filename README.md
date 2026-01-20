A projekt egy egyszerűnek tűnő, de tudatosan túltervezett megoldása:
egy másodpercekben megadott időtartam emberileg olvasható formátumra alakítása.

A megoldás célja nem csak a helyes működés, hanem egy webalkalmazás architektúra bemutatása:
Spring Boot backend rétegekkel, valamint egy Angular frontenddel.

---

Funkcionalitás

- Egy nemnegatív egész szám (másodperc) megadása
- Az időtartam felbontása:
  - év
  - nap
  - óra
  - perc
  - másodperc
- Webes felületen azonnali megjelenítés

---

Backend – Spring Boot

Technológiák
- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- MapStruct
- Lombok
- Maven

Architektúra (rétegezés)

A backend a tanult réteges architektúrát követi:

Főbb elemek:

- Controller
  - REST API végpont a duration feldolgozására

- Service
  - üzleti logika
  - duration feldarabolása és formázása

- Repository
  - egyszerű in-memory tárolás (List)

- Formatter layer
  - `DurationDecomposer` – másodpercek felbontása időegységekre
  - `DurationFormatter` – angol nyelvű formázás

- DTO + Mapper
  - MapStruct segítségével
  - entitás és DTO szétválasztása

---

Frontend - Angular

Funkciók

- Szám input mező
- Gomb a feldolgozáshoz
- Az eredmény azonnali megjelenítése
- Backenddel REST API-n keresztüli kommunikáció



