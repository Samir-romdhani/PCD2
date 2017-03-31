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
public class FormationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IdF")
    private int idF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;

    public FormationPK() {
    }

    public FormationPK(int idF, int userId) {
        this.idF = idF;
        this.userId = userId;
    }

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idF;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormationPK)) {
            return false;
        }
        FormationPK other = (FormationPK) object;
        if (this.idF != other.idF) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.rh.entities.FormationPK[ idF=" + idF + ", userId=" + userId + " ]";
    }
    
}
