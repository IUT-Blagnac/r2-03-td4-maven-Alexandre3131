
public class Pile {
    int[] elements;
    int indiceSommet;

    Pile(int pfNbre){
        this.indiceSommet=-1;
        this.elements = new int[pfNbre];
    }

    Pile(){
        this.indiceSommet=-1;
        this.elements = new int[10];
    }

    public boolean estVide() {
        if(this.indiceSommet<0) {
            return true;
        }
        return false;
    }

    public void empiler(int i) throws Exception {
        if(this.estPlein()) {
            throw new Exception("Le tableau est plein");
        }
        this.indiceSommet=this.indiceSommet+1;
        elements[this.indiceSommet]=i;
    } 

    public void depiler() throws Exception {
        if(this.estVide()) {
            throw new Exception("Le tableau est vide");
        }
        this.indiceSommet=this.indiceSommet-1;
    }

    public boolean estPlein() {
        if(this.indiceSommet>=this.elements.length-1) {
            return true;
        }
        return false;
    }

    public int Sommet() throws Exception {
        if(this.estVide()) {
            throw new Exception("Le tableau est vide");
        }
        return this.elements[this.indiceSommet];
    }

}
