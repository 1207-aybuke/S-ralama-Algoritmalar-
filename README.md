# Sıralama Algoritmaları
 Bubble Sort: Bubble sort, en basit sıralama algoritmalarından biridir. Karşılaştırma temelli olan bu algoritmada, listedeki her bir eleman yanındaki eleman ile karşılaştırılır. Eğer ilk elemanın değeri, ikinci elemanın değerinden büyükse, iki eleman yer değiştirir. Daha sonra ikinci ve üçüncü elemanların değerleri karşılaştırılır. İkinci elemanın değeri üçüncü elemanın değerinden büyükse bu iki eleman yer değiştirir ve bu işlem, tüm liste sıralanana kadar bu şekilde devam eder.

Insertion Sort: bir kart oyununda elimizdeki kartları sıraladığımıza benzer şekilde çalışır.
İlk kartın zaten sıralandığını varsayıyoruz, sıralanmamış bir kart seçiyoruz. Sıralanmamış kart eldeki karttan daha büyükse, aksi takdirde sağa, sola yerleştirilir. Aynı şekilde diğer sıralanmamış kartlar alınır ve doğru yerlerine konur.Eklemeli sıralama ile benzer bir yaklaşım kullanılır.Ekleme sıralaması, sıralanmamış bir öğeyi her yinelemede uygun yerine yerleştiren bir sıralama algoritmasıdır.

Selection Sort:Çalışma mantığı en kolay anlaşılabilecek sıralama algoritmalarından biridir. Performansı düşük bir algoritmadır. Konuyu bir örnek üzerinde inceleyelim;
12, 40, 8, 33, 52, 3, 10, 83
Algoritma şu şekilde çalışır. Listenin ilk elemanına alır (12). Kendinden sonraki tüm sayılar ile kıyaslanır. Listedeki en küçük sayıyı bulduğumuzda indisdeki değer (12) ile yer değiştiririz.
indis 0 yani ilk eleman 12, en küçük değer kabul edilir.
40 ile kıyaslanır. 40, 12 den büyük olduğundan herhangi bir işlem yapılmaz. Daha sonra 8 ile kıyaslama yapılır. 8, 12 den küçük olduğu için yeni en küçük değer 8 dir. Bu şekilde sona kadar gidilir. En küçük değer 3 olarak belirlenir. 3 ile 12 yer değiştirilir ve indis bir sonraki değere kaydırılır. indisin yeni değeri 1 olur. Yeni liste aşağıdaki gibidir.
3, 40, 8, 33, 52, 12, 10, 83
Bu aşamada 40 değeri kendinden sonraki değerlerle kıyaslanır. Bu defa en küçük sayı 8 olduğu için 8 ile 40 değeri yer değiştirir ve indis bir tane ileri kaydırılır.
Listenin son hali aşağıdaki gibidir;
3, 8, 40, 33, 52, 12, 10, 83
Bu şekilde tüm elemanların üzerinden geçilir.

Radix Sort: Radix Sort(Taban Sıralama),tamsayı bulunduran dizileri küçükten büyüğe ya da büyükten küçüğe sıralı bir şekilde sıralayabilecek bir metottur.Radix Sort(Taban Sıralama),sayıları basamakları üzerinde işlem yaparak sıralayan algoritmalarından biridir.Radix Sort algoritması,aslında 2’lik tabana göre geliştirilmiş hızlı bir şekilde sıralayan algoritmadır.Radix Sort,taban sıralama veya hane sıralaması olarak isimlendirilir.

