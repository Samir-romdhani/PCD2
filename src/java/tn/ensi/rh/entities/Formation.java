/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.rh.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "formations", catalog = "rh_testdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f")
    , @NamedQuery(name = "Formation.findByIdF", query = "SELECT f FROM Formation f WHERE f.formationPK.idF = :idF")
    , @NamedQuery(name = "Formation.findByLibelle", query = "SELECT f FROM Formation f WHERE f.libelle = :libelle")
    , @NamedQuery(name = "Formation.findByEtat", query = "SELECT f FROM Formation f WHERE f.etat = :etat")
    , @NamedQuery(name = "Formation.findByUserId", query = "SELECT f FROM Formation f WHERE f.formationPK.userId = :userId")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormationPK formationPK;
    @Size(max = 50)
    @Column(name = "Libelle")
    private String libelle;
    @Size(max = 20)
    @Column(name = "Etat")
    private String etat;

    public Formation() {
    }

    public Formation(FormationPK formationPK) {
        this.formationPK = formationPK;
    }

    public Formation(int idF, int userId) {
        this.formationPK = new FormationPK(idF, userId);
    }

    public FormationPK getFormationPK() {
        return formationPK;
    }

    public void setFormationPK(FormationPK formationPK) {
        this.formationPK = formationPK;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formationPK != null ? formationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.formationPK == null && other.formationPK != null) || (this.formationPK != null && !this.formationPK.equals(other.formationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.rh.entities.Formation[ formationPK=" + formationPK + " ]";
    }
    
}
