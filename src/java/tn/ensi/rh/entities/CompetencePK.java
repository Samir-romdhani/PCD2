/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.rh.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author user
 */
@Embeddable
public class CompetencePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IdC")
    private int idC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdF")
    private int idF;

    public CompetencePK() {
    }

    public CompetencePK(int idC, int userId, int idF) {
        this.idC = idC;
        this.userId = userId;
        this.idF = idF;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idC;
        hash += (int) userId;
        hash += (int) idF;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompetencePK)) {
            return false;
        }
        CompetencePK other = (CompetencePK) object;
        if (this.idC != other.idC) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (this.idF != other.idF) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.rh.entities.CompetencePK[ idC=" + idC + ", userId=" + userId + ", idF=" + idF + " ]";
    }
    
}
