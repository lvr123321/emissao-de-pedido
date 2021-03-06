/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.Serializable;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private long     id;
    
    @Column(nullable=false)
    private String  cnpj;
    
    @Column(nullable=false)
    private String  ie;
    
    @Column(nullable=false)
    private String  razao;
    
    @Column(nullable=false)
    private String  fantasia;
    
    @Column(nullable=false)
    private String  email;
    
    

    public Fornecedor() {
    }

    public Fornecedor(String CNPJFornecedor, String IE, String RazaoSocial, String fantasia, String email) {
        this.cnpj = CNPJFornecedor;
        this.ie             = IE;
        this.razao    = RazaoSocial;
        this.fantasia       = fantasia;
        this.email          = email;
    }

    
    /***************************************************************************************************************
     *******************************               GETTERS                 *****************************************
     ***************************************************************************************************************/
    
    
    public String getCnpj() {
        return cnpj;
    }

    public String getIe() {
        return ie;
    }

    public String getRazao() {
        return razao;
    }

    public String getEmail() {
        return email;
    }

    public String getFantasia() {
        return fantasia;
    }

    public long getId() {
        return id;
    }

    
    /***************************************************************************************************************
     *******************************               SETTERS                 *****************************************
     ***************************************************************************************************************/
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    
    
    /***************************************************************************************************************
     ***************************************************************************************************************
     ***************************************************************************************************************/
    
    String home() {
        return "Hue!";
    }
    
}
