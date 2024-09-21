package section3_2.hashsetexample;

import java.util.HashSet;

public class CoinDriver {
	public static void main(String[] args) {
		HashSet<Coin> wallet = new HashSet<>();
		
		Coin coin1 = new Coin(1);
		Coin coin5 = new Coin(5);
		Coin coin10 = new Coin(10);
		Coin coin25 = new Coin(25);
		Coin coin50 = new Coin(50);
		Coin coin100 = new Coin(100);
		
		wallet.add(coin1);
		wallet.add(coin5);
		wallet.add(coin10);
		wallet.add(coin25);
		wallet.add(coin50);
		wallet.add(coin100);
		// se eu repetir os elementos o HashSet não aceita duplicatas
		wallet.add(coin100);
		wallet.add(coin25);
		
		displayWallet(wallet);
		System.out.println("Quantidades de moedas na carteira: " + wallet.size());
		
		System.out.println("A carteira esá vazia? " + wallet.isEmpty());
		
		wallet.clear();
		System.out.println("A carteira esá vazia? " + wallet.isEmpty());
	}
	private static void displayWallet(HashSet<Coin> wallet) {
		for (Coin arrTemporario : wallet) {System.out.println(arrTemporario.getDenomination());}
	}
}


