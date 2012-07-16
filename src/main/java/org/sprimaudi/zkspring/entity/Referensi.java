/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sprimaudi.zkspring.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author User
 */
@Entity
public class Referensi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long grup;
    @Column(length = 6)
    private String kode;
    @Column(length = 32)
    private String nama;
    @Column(length = 512)
    private String keterangan;
    @Column(length = 64)
    private String nilai;
    private Long num;
    //=====================
    //list of reference type
    //=====================


    public Long getGrup() {
        return grup;
    }

    public void setGrup(Long grup) {
        this.grup = grup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
