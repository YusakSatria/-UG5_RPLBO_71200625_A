package com.ug5a2;

/**
 * Hello world!
 *
 */
public class App
{
    public static void infoBuku( String[] args )
    {
        Buku bukuA = new Buku("Cinta itu Alasan Sekaligus Tujuan","Kang Maman",62400,5);
        Buku bukuB = new Buku("Autumn in Paris","Ilana Tan",63200,7);
        Buku bukuC = new Buku("Critical Eleven","Ika Natassa",74400,2);
        System.out.println("\n========== Daftar Buku Gramedia==========\n");
        infoBuku(bukuA);
        infoBuku(bukuB);
        infoBuku(bukuC);
    }
    public static void infoBuku(Buku book)
    {
        System.out.println("-----"+book.getTitle()+"-----");
        System.out.println("Kode: "+book.getCode());
        System.out.println("Penulis: "+book.getWritter());
        System.out.println("Harga: Rp."+book.getPrice());
        System.out.println("Stok: "+book.getStock());
    }
}
