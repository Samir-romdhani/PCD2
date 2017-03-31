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
@Table(name = "competences", catalog = "rh_testdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Competence.findAll", query = "SELECT c FROM Competence c")
    , @NamedQuery(name = "Competence.findByIdC", query = "SELECT c FROM Competence c WHERE c.competencePK.idC = :idC")
    , @NamedQuery(name = "Competence.findByUserId", query = "SELECT c FROM Competence c WHERE c.competencePK.userId = :userId")
    , @NamedQuery(name = "Competence.findByIdF", query = "SELECT c FROM Competence c WHERE c.competencePK.idF = :idF")
    , @NamedQuery(name = "Competence.findByDescriptions", query = "SELECT c FROM Competence c WHERE c.descriptions = :descriptions")
    , @NamedQuery(name = "Competence.findByNote", query = "SELECT c FROM Competence c WHERE c.note = :note")})
public class Competence implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompetencePK competencePK;
    @Size(max = 100)
    @Column(name = "descriptions")
    private String descriptions;
    @Column(name = "note")
    private Integer note;

    public Competence() {
    }

    public Competence(CompetencePK competencePK) {
        this.competencePK = competencePK;
    }

    public Competence(int idC, int userId, int idF) {
        this.competencePK = new CompetencePK(idC, userId, idF);
    }

    public CompetencePK getCompetencePK() {
        return competencePK;
    }

    public void setCompetencePK(CompetencePK competencePK) {
        this.competencePK = competencePK;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (competencePK != null ? competencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competence)) {
            return false;
        }
        Competence other = (Competence) object;
        if ((this.competencePK == null && other.competencePK != null) || (this.competencePK != null && !this.competencePK.equals(other.competencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.rh.entities.Competence[ competencePK=" + competencePK + " ]";
    }
    
}
