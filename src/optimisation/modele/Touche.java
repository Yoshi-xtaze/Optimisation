package optimisation.modele;

public class Touche {

	public static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
	private int lettre;
	
	public static int A = 0;
	public static int B = 1;
	public static int C = 2;
	public static int D = 3;
	public static int E = 4;
	public static int F = 5;
	public static int G = 6;
	public static int H = 7;
	public static int I = 8;
	public static int J = 9;
	public static int K = 10;
	public static int L = 11;
	public static int M = 12;
	public static int N = 13;
	public static int O = 14;
	public static int P = 15;
	public static int Q = 16;
	public static int R = 17;
	public static int S = 18;
	public static int T = 19;
	public static int U = 20;
	public static int V = 21;
	public static int W = 22;
	public static int X = 23;
	public static int Y = 24;
	public static int Z = 25;
	public static int VIDE = 26;
	
	public Touche(int l){
		lettre = l;
	}
	
	public char getLettreToChar(){
		return alphabet[lettre];
	}
	
	public int getLettreToInt(){
		return lettre;
	}

	public int valeurBigramme(Touche fils) {
		int rep = 0;
		if(this.lettre != VIDE && fils.lettre != VIDE){
			rep = Clavier.bigramme[this.lettre][fils.lettre];
		}
		return rep;
	}
	
	public String toString(){
		return "{"+alphabet[lettre]+"}";
	}
	
	public boolean equals(Object o){
		try{
			Touche t = (Touche) o;
			if(this.lettre != t.lettre)
				return false;
		}
		catch(Exception e){
			return false;
		}
		return true;
	}

	public void setLettre(int l) {
		lettre = l;
	}
}
