/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByMatricule", query = "SELECT u FROM Users u WHERE u.matricule = :matricule")
    , @NamedQuery(name = "Users.findByNom", query = "SELECT u FROM Users u WHERE u.nom = :nom")
    , @NamedQuery(name = "Users.findByPrenom", query = "SELECT u FROM Users u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "Users.findByPoste", query = "SELECT u FROM Users u WHERE u.poste = :poste")
    , @NamedQuery(name = "Users.findByDateemb", query = "SELECT u FROM Users u WHERE u.dateemb = :dateemb")
    , @NamedQuery(name = "Users.findByStatut", query = "SELECT u FROM Users u WHERE u.statut = :statut")
    , @NamedQuery(name = "Users.findBySalaire", query = "SELECT u FROM Users u WHERE u.salaire = :salaire")
    , @NamedQuery(name = "Users.findByTelephone", query = "SELECT u FROM Users u WHERE u.telephone = :telephone")
    , @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")
    , @NamedQuery(name = "Users.findByDatenais", query = "SELECT u FROM Users u WHERE u.datenais = :datenais")
    , @NamedQuery(name = "Users.findByLieunais", query = "SELECT u FROM Users u WHERE u.lieunais = :lieunais")
    , @NamedQuery(name = "Users.findByGsanguin", query = "SELECT u FROM Users u WHERE u.gsanguin = :gsanguin")
    , @NamedQuery(name = "Users.findBySexe", query = "SELECT u FROM Users u WHERE u.sexe = :sexe")
    , @NamedQuery(name = "Users.findByNiveauetude", query = "SELECT u FROM Users u WHERE u.niveauetude = :niveauetude")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "matricule")
    private String matricule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "poste")
    private String poste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateemb")
    @Temporal(TemporalType.DATE)
    private Date dateemb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "statut")
    private String statut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salaire")
    private int salaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datenais")
    @Temporal(TemporalType.DATE)
    private Date datenais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lieunais")
    private String lieunais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "gsanguin")
    private String gsanguin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "sexe")
    private String sexe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "niveauetude")
    private String niveauetude;

    public Users() {
    }

    public Users(String matricule) {
        this.matricule = matricule;
    }

    public Users(String matricule, String nom, String prenom, String poste, Date dateemb, String statut, int salaire, String telephone, String email, Date datenais, String lieunais, String gsanguin, String sexe, String niveauetude) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.dateemb = dateemb;
        this.statut = statut;
        this.salaire = salaire;
        this.telephone = telephone;
        this.email = email;
        this.datenais = datenais;
        this.lieunais = lieunais;
        this.gsanguin = gsanguin;
        this.sexe = sexe;
        this.niveauetude = niveauetude;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getDateemb() {
        return dateemb;
    }

    public void setDateemb(Date dateemb) {
        this.dateemb = dateemb;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatenais() {
        return datenais;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }

    public String getLieunais() {
        return lieunais;
    }

    public void setLieunais(String lieunais) {
        this.lieunais = lieunais;
    }

    public String getGsanguin() {
        return gsanguin;
    }

    public void setGsanguin(String gsanguin) {
        this.gsanguin = gsanguin;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNiveauetude() {
        return niveauetude;
    }

    public void setNiveauetude(String niveauetude) {
        this.niveauetude = niveauetude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricule != null ? matricule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.entities.Users[ matricule=" + matricule + " ]";
    }
    
}
