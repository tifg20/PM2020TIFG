package com.presentasi;

public class node {  //digunakan untuk menginisialisasi setiap node yang ada

    int data; //diinisialisasikan “data” dengan tipe data integer yang digunakan untuk menympan sebuah data,

    //“prev” dan “next” diinisialisasikan dengan tipe data “node” sama dengan null atau kosong.
    node prev = null;// “prev” digunakan untuk menghubungkan data ke data sebelumnya
    node next = null;// “next” sebaliknya yaitu menghubungkan data ke node selanjutnya

    //membuat sebuah konstruktur dengan parameter yang digunakan untuk
    // menghubunngkan kelas satu dengan kelas yang lain.
    node(int data){
        this.data = data;

    }
}
