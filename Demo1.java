/* Fichier démo1.java
 * Par: Philippe Brisson
   IFT1025
   
 */

import java.util.ArrayList;

public class Demo1 {
	
	public static void main(String[] args){
		
		// exercice 1
		System.out.println("exercice 1.");
		afficher1();
		System.out.println();
		
		// exercice 2
		System.out.println("exercice 2.");
		int[] tab1 = {1, 2, 3}, tab2 = {4, 5, 6};
		System.out.println("tab1 avant: ");
		afficherTabInt(tab1);
		System.out.println("tab2 avant: ");
		afficherTabInt(tab2);
		echangeTab(tab1, tab2);
		System.out.println("tab1 après: ");
		afficherTabInt(tab1);
		System.out.println("tab2 après: ");
		afficherTabInt(tab2);
		String[] tab11 = {"hi", "bonjour", "salut"}, tab12 = {"buenos dias", "konichiwa", "gueten tag"};
		System.out.println("tab11 avant: ");
		afficherTabString(tab11);
		System.out.println("tab12 avant: ");
		afficherTabString(tab12);
		echangeTab(tab11, tab12);
		System.out.println("tab11 après: ");
		afficherTabString(tab11);
		System.out.println("tab12 après: ");
		afficherTabString(tab12);
		System.out.println();
		
		// exercice 3
		System.out.println("exercice 3.");
		System.out.println("tab1 avant:");
		afficherTabInt(tab1);
		multiplie(tab1);
		System.out.println("tab1 après:");
		afficherTabInt(tab1);
		System.out.println();
		
		// exercice 4
		System.out.println("exercice 4.");
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("arbre");
		liste.add("bateau");
		liste.add("dauphin");
		System.out.println("liste avant:");
		System.out.println(liste);
		insert(liste, "couteau");
		System.out.println("liste après:");
		System.out.println(liste);
		System.out.println();
		
		// exercice 5
		System.out.println("exercice 5.");
		String[] tab3 = {"hi", "bonjour", "salut", "buenos dias", "konichiwa", "gueten tag"};
		System.out.println("tab avant:");
		afficherTabString(tab3);
		ArrayList<String> tab4 = trie(tab3);
		System.out.println("tab après:");
		System.out.println(tab4);
		System.out.println();
		
		// exercice 6
		System.out.println("exercice 6.");
		TriangleRec a = new TriangleRec();
		TriangleRec b = new TriangleRec(2,4);
		System.out.println("a: base = " + a.base + ", hauteur = " + a.hauteur);
		System.out.println("b: base = " + b.base + ", hauteur = " + b.hauteur);
		System.out.println();
		
		//Exercice 7
		System.out.println("Exercice 7.");
		double hypA = TriangleMethode.hypotenuse(a);
		double aireA = TriangleMethode.aire(a);
		double hypB = TriangleMethode.hypotenuse(b);
		double aireB = TriangleMethode.aire(b);
		System.out.println("a: hypoténuse = " + hypA + ", aire = " + aireA);
		System.out.println("b: hypoténuse = " + hypB + ", aire = " + aireB);
		System.out.println();
				
		//Exercice 8
		System.out.println("Exercice 8.");
		TriangleRecPrivate aPrivate = new TriangleRecPrivate();
		TriangleRecPrivate bPrivate = new TriangleRecPrivate(2,4);
		System.out.println("aPrivate: base = " + aPrivate.getBase() + ", hauteur = " + aPrivate.getHauteur());
		System.out.println("bPrivate: base = " + bPrivate.getBase() + ", hauteur = " + bPrivate.getHauteur());
		System.out.println();
				
		double hypAPrivate = TriangleMethodePrivate.hypotenuse(aPrivate);
		double aireAPrivate = TriangleMethodePrivate.aire(aPrivate);
		double hypBPrivate = TriangleMethodePrivate.hypotenuse(bPrivate);
		double aireBPrivate = TriangleMethodePrivate.aire(bPrivate);
		System.out.println("aPrivate: hypoténuse = " + hypAPrivate + ", aire = " + aireAPrivate);
		System.out.println("bPrivate: hypoténuse = " + hypBPrivate + ", aire = " + aireBPrivate);
		System.out.println();
		
	}
	
	// exercice 1
	// affiche les nombres de 1 à 20 séparés d'une virgule
	public static void afficher1(){
		
		for(int i = 0; i < 20; i++){
			if(i%2 == 0){
				System.out.print(i + ", ");
			}
		}
		System.out.println("20");
		
	}
	
	// exercice 2
	// prend deux tableaux de int et échange leur contenu
	public static void echangeTab(int[] tab1, int[] tab2){
		
		int[] tab3 = new int[tab1.length];
		
		for(int i = 0; i < tab1.length; i++){
			
			tab3[i] = tab1[i];
			tab1[i] = tab2[i];
			tab2[i] = tab3[i];
		}
		
	}
	
	// prend deux tableaux de String et échange leur contenu
	public static void echangeTab(String[] tab1, String[] tab2){
		
		String[] tab3 = new String[tab1.length];
		
		for(int i = 0; i < tab1.length; i++){
			
			tab3[i] = tab1[i];
			tab1[i] = tab2[i];
			tab2[i] = tab3[i];
		}
		
	}
	
	// exercice 3
	// prend un tableau de int, multiplie le contenu par un nombre au hasard de 0 à 9 et soustrait
	// le produit par l'élément initial
	public static int[] multiplie(int[] tab1){
		
		for(int i = 0; i < tab1.length; i++){
			
			int temp = tab1[i];
			tab1[i] *= (int) 10* Math.random();
			tab1[i] -= temp;
		}
		
		return tab1;
		
	}
	
	// exercice 4
	// prend un ArrayList de String et un String, insère le String en ordre alphabétique dans la liste
	// et retourne la liste
	public static ArrayList<String> insert(ArrayList<String> arrayList, String mot){
		
		boolean ajout = false;
		
		for(int i = 0; i < arrayList.size(); i++){
			
			String s = arrayList.get(i);
			
			if(mot.compareTo(s)<= 0){
				
				arrayList.add(i, mot);
				ajout = true;
				break;
				
			}
			
		}

		if (ajout == false){
			arrayList.add(mot);
		}

		return arrayList;
	}
	
	// exercice 5
	// prend un tableau de String et retourne un ArrayList des mots du tableau triés en ordre alphabétique
	public static ArrayList<String> trie(String[] tab){
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(tab[0]);
		for (int i = 1; i < tab.length; i++){
			insert(list, tab[i]);
		}
		return list;
		
	}
	
	// prend un tableau de int et affiche son contenu
	public static void afficherTabInt(int[] tab){
		
		for(int i = 0; i < tab.length; i++){
			
			System.out.print(tab[i] + ", ");
		
		}
		System.out.println("");
		
	}
	
	// prend un tableau de string et affiche son contenu
	public static void afficherTabString(String[] tab){
		
		ArrayList<String> affichage = new ArrayList<String>();
		
		for(int i = 0; i < tab.length; i++){
			
			affichage.add(tab[i]);
			
		}
		System.out.println(affichage);
		
	}
	
}
