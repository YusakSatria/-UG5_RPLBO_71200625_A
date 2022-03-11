package com.ug5a.soal1;

public class SmartCard {
    private long saldo;
    private String name;

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public String getNama() {
        return name;
    }


    public void topUp(Voucher vch) {
        if (vch.getCode().equals("VC")) {
            System.out.println("Kode Voucher: " + vch.getCode() + " || Top up gagal! Kode voucher tidak valid.");
        } else {
            this.saldo += vch.getNominal();
            System.out.println("Kode Voucher: " + vch.getCode() + " || Top up sukses!");
        }
    }
    }