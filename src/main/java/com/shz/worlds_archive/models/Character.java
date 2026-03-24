/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.shz.worlds_archive.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author aeryxx
 */

@Entity
@Table(name="characters")
public class Character {
    @Id
    private String char_id;

    @Column(name="char_name")
    private String char_name;

    @Column(name="page_group_id")
    private String page_group_id;

    public String getChar_id() {
        return char_id;
    }

    public void setChar_id(String char_id) {
        this.char_id = char_id;
    }

    public String getChar_name() {
        return char_name;
    }

    public void setChar_name(String char_name) {
        this.char_name = char_name;
    }

    public String getPage_group_id() {
        return page_group_id;
    }

    public void setPage_group_id(String page_group_id) {
        this.page_group_id = page_group_id;
    }
}
