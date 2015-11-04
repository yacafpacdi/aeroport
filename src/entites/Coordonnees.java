package entites;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Coordonnees implements Serializable {
     private static final long serialVersionUID = 1L;
    
    private String nom;
    private String num;
    private String rue;
    private String ville;
    private String cp;
    private String telephone;

    public Coordonnees() {
    }

    public Coordonnees(String nom, String num, String rue, String ville, String cp, String telephone) {
        this.nom = nom;
        this.num = num;
        this.rue = rue;
        this.ville = ville;
        this.cp = cp;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Coordonnees{" + "nom=" + nom + ", num=" + num + ", rue=" + rue + ", ville=" + ville + ", cp=" + cp + ", telephone=" + telephone + '}';
    }
    
    

}
