/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.beans;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Articulo {
    public ArticuloCategorias categories;
    public String articleName;
    public String description;

    public Articulo(ArticuloCategorias categories, String articleName, String description) {
        this.categories = categories;
        this.articleName = articleName;
        this.description = description;
    }

    public ArticuloCategorias getCategories() {
        return categories;
    }

    public void setCategories(ArticuloCategorias categories) {
        this.categories = categories;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.articleName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        return Objects.equals(this.articleName, other.articleName);
    }

    @Override
    public String toString() {
        return "Articulo{" + "categories=" + categories + ", articleName=" + articleName + ", description=" + description + '}';
    }
    
}
