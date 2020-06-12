# KriptoParaTakip

Android Uygulama -(Java) kullanılarak oluşturulmuş bir kripto para takip uygulamasıdır. 

Projem de kullanacağım kütüphaneler hakkında bilgiler vercek olursam;
 
Retrofit Kütüphanesi, bir web servisinden veri çekmeye yarayan bir kütüphanedir. Retrofit açık kaynak kodlu REST İstemcisidir. Retrofit de ana kısmın url sini bütün API çağrıları için set edebilir, daha sonra static interfaceleri Java’nın annotation larını kullanarak oluşturabiliriz. Sunucudan istek yapabilmek için, interface methodunu çağırmak yeterlidir ve sonucunda bize dönüş objesi dönmektedir. 
 
 implementation "com.squareup.retrofit2:retrofit:2.7.1" 
 implementation 'com.squareup.retrofit2:converter-gson:2.7.1'
 implementation 'com.squareup.retrofit2:adapter-rxjava2:2.7.1' 
 implementation 'com.squareup.retrofit2:converter-moshi:2.7.1' 
 
 
Android metarial kütüphanesi, kullanıcı arayüz tasarımına sahip yazılım projelerinde görsellik ve kullanıcının dikkatini çekecek öğeler çok önemlidir. Bu yüzden projeme bunu da dahil ettim. 
implementation 'com.google.android.material:material:1.2.0-alpha04'
implementation 'androidx.multidex:multidex:2.0.0' 
 
 
Gson kütüphanesi, Java kullanarak yazdığımız uygulamalar da Java nesnesinden JSON’a ve JSON’dan Java nesnesine kolaylıkla dönüşüm yapmamızı sağlayan bir kütüphane olan GSON kütüphanesini kullanmakta yarar vardır. 
 
implementation "com.google.code.gson:gson:2.8.6" 
 
Glide kütüphanesi, Android için hızlı ve etkili bir resim yükleme kütüphanesidir. Daha önce Picasso kullananların kolaylıkla kullanabileceği bir kütüphane olan Glide resim yükleyip görüntülemenin yanında GIF’de yükleyip görüntülemenize olanak sağlar. 
 
implementation 'com.github.bumptech.glide:glide:4.11.0' 
annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0' 
