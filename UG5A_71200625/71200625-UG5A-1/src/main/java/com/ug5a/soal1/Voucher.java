package com.ug5a.soal1;

public class Voucher {
    private String code;
    private long nominal;

    public String getCode() {
        return code;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }
    public long getNominal() {
        return nominal;
    }

    public void buatVoucher() {
        if(nominal <= 0){
            this.code = "VC";
        }
        else{
            this.code = "VC" + nominal;
        }
    }
}