package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class proje1 {
	public static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		List <String> cinsiyet = new ArrayList<>();
		List <Integer> yas = new ArrayList<>();
		List <Integer> maas= new ArrayList<>();
		List <String> egitimDurumu = new ArrayList<>();
		
		int menu;
		while(true) {
			MenuGoruntule();
			menu=scan.nextInt();
			switch(menu) {
			case 1:
				KayıtGiris(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 2:
				Listeleme(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 3:
				isimArama(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 4:
				KayıtSilme(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 5:
				YasMaasOrt(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 6:
				EnYüksekMaasBilgisi(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 7:
				EnDüsükMaasBilgisi(isimler,cinsiyet,yas,maas,egitimDurumu);
				break;
			case 8:
				System.out.println("çıkış yapılıyor...");
				System.exit(0);
				break;
			default:
				System.out.println("geçersiz işlem.");
				
				
			}
			
		
		}
		

		


	}

	private static void EnDüsükMaasBilgisi(List<String> isimler, List<String> cinsiyet, List<Integer> yas,
			List<Integer> maas, List<String> egitimDurumu) {
		int enk = proje1.EnDüsükMaas(maas);
		for(int i=0;i<maas.size();i++) {
			if(maas.get(i)==enk) {
				System.out.println("isim:"+isimler.get(i)+"cinsiyet:"+cinsiyet.get(i)+"yaş:"+yas.get(i)+"maaş:"+maas.get(i)+"eğitim durumu:"+egitimDurumu.get(i));
			}
			
	}
	}

	private static int EnDüsükMaas(List<Integer> maas) {
		int endüsük=maas.get(0);
		for(int i=0;i<maas.size();i++) {
			if(maas.get(i)<endüsük) {
				endüsük=maas.get(i);
				
			}
		}
		return endüsük;
		
		
		
		
		
	}

	private static void EnYüksekMaasBilgisi(List<String> isimler, List<String> cinsiyet, List<Integer> yas,
			List<Integer> maas, List<String> egitimDurumu) {
		int enb = proje1.EnYüksekMaaş(maas);
		for(int i=0;i<maas.size();i++) {
			if(maas.get(i)==enb) {
				System.out.println("isim:"+isimler.get(i)+"cinsiyet:"+cinsiyet.get(i)+"yaş:"+yas.get(i)+"maaş:"+maas.get(i)+"eğitim durumu:"+egitimDurumu.get(i));
			}
		}
		
		
		
	}

	private static int EnYüksekMaaş(List<Integer> maas) {
		int enyüksek=maas.get(0);
		for(int i=0;i<maas.size();i++) {
			if(maas.get(i)>enyüksek) {
				enyüksek=maas.get(i);
				
			}
		}
		return enyüksek;
		
		
	}

	private static void YasMaasOrt(List<String> isimler, List<String> cinsiyet, List<Integer> yas, List<Integer> maas,
			List<String> egitimDurumu) {
		int yasOrtalama = 0,maasOrtalama=0;
		for(int i=0;i<yas.size();i++) {
			yasOrtalama+=yas.get(i);
			maasOrtalama+=maas.get(i);	
		}
		
		System.out.println("yaş ortalaması:"+yasOrtalama/yas.size());
		System.out.println("maaş ortalaması:"+maasOrtalama/maas.size());
		
		
		
		
		
	}

	private static void KayıtSilme(List<String> isimler, List<String> cinsiyet, List<Integer> yas, List<Integer> maas,
			List<String> egitimDurumu) {
		System.out.println("silinecek ismi giriniz:");
		String isim = scan.next();
		for(int i=0;i<isimler.size();i++) {
			if(isim.equalsIgnoreCase(isimler.get(i))) {
				isimler.remove(i);
				cinsiyet.remove(i);
				yas.remove(i);
				maas.remove(i);
				egitimDurumu.remove(i);
				
			}
			
		}
		
		
	}

	private static void isimArama(List<String> isimler, List<String> cinsiyet, List<Integer> yas, List<Integer> maas,
			List<String> egitimDurumu) {
		System.out.println("aranacak ismi giriniz:");
		String aranan=scan.next();
		for(int i=0;i<isimler.size();i++) {
			if(aranan.equalsIgnoreCase(isimler.get(i))) {
				System.out.println("isim:"+isimler.get(i)+"cinsiyet:"+cinsiyet.get(i)+"yaş:"+yas.get(i)+"maaş:"+maas.get(i)+"eğitim durumu:"+egitimDurumu.get(i));
			}
			
		}
		
	}

	private static void Listeleme(List<String> isimler, List<String> cinsiyet, List<Integer> yas, List<Integer> maas,
			List<String> egitimDurumu) {
		for(int i=0;i<isimler.size();i++) {
			System.out.println("isim:"+isimler.get(i)+"cinsiyet:"+cinsiyet.get(i)+"yaş:"+yas.get(i)+"maaş:"+maas.get(i)+"eğitim durumu:"+egitimDurumu.get(i));
		}
		
		
	}

	private static void KayıtGiris(List<String> isimler, List<String> cinsiyet, List<Integer> yas, List<Integer> maas,
			List<String> egitimDurumu) {
		System.out.println("isim giriniz:");
	    isimler.add(scan.next());
	    System.out.println("cinsiyet giriniz:");
	    cinsiyet.add(scan.next());
	    System.out.println("yaş giriniz:");
	    yas.add(scan.nextInt());
	    System.out.println("maaş giriniz:");
	    maas.add(scan.nextInt());
	    System.out.println("eğitim durumu giriniz:");
	    egitimDurumu.add(scan.next());
	    
	   
		
		
	}

	private static void MenuGoruntule() {
		System.out.println("1.kayıt giriş\n2.listeleme\n3.isim ile arama\n4.kayıt silme"
				+ "\n5.yaş ve maaş ortalaması\n6.en yüksek maaş bilgileri\n7.en düşük maaş ve bilgileri\n8.çıkış");
		
		
	}

}
