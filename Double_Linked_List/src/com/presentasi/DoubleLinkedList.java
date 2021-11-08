package com.presentasi;

public class DoubleLinkedList {
//berfungsi untuk membuat sebuah kelas baru pada java yang digunakan untuk membuat fungsi-fungsi baru lainnya di dalam kelas tersebut.

    node head=null;
    node tail=null;
    //Script “node head=null; node tail=null;”
    // digunakan untuk menginisialisasi nilai awal dari “head” dan “tail” adalah kosong.

    void addfront(int b){
        //fungsi add front, data yang ingin dimasukkan akan berada diurutan paling awal dan
        // memiliki parameter dengan nama variabel adalah “ b” dengan tipe data integer.

        node baru = new node(b);
        // untuk membuat suatu node baru yang nantinya akan digunakan untuk menyimpan data yang baru.

        if(head==null){
            head=baru;
            tail=baru;
            //Jika “head” atau data awal sama dengan null atau kosong maka “head” dan “tail” atau data awal dan akhir
            // akan sama dengan “baru” atau data baru.

        }else{
            baru.next=head;
            head.prev=head;
            //Lalu jika data awal tidak kosong atau null maka akan dijalankan proses pada script “baru.next=head; head.prev=head;”
            // yang digunakan untuk menghubungkan data baru ke bagian head atau awal.

            head=baru;
            //untuk membuat “baru” sebagai node awal atau head. Sehingga data yang baru dimasukkan akan berada dibagian awal.

        }
    }

       void addback(int b){
           // fungsi "addback", data yang ingin dimasukkan akan berada diurutan paling akhir dan
           // memiliki parameter dengan nama variabel adalah “b” dengan tipe data integer.

        node baru = new node(b);
        //digunakan untuk membuat suatu node baru yang nantinya akan digunakan
        // untuk menyimpan data yang baru.

        if(head==null){
            head=baru;
            tail=baru;
            //Jika “head” atau data awal sama dengan null atau kosong maka “head” dan “tail” atau
            // data awal dan akhir akan sama dengan “baru” atau data baru.
            // Yang berarti bahwa data baru mempunyai 2 buah sumbu atau node yaitu head dan tail.

        }else{
            baru.prev=tail;
            tail.next=baru;
            //jika data awal tidak kosong, maka akan dijalankan proses pada script “baru.prev=tail; tail.next=baru;” yang digunakan
            // untuk menghubungkan data baru ke bagian tail

            tail=baru;
            //digunakan untuk membuat “baru” sebagai node akhir atau tail.
            //Sehingga data yang baru dimasukkan akan berada dibagian akhir.
        }
    }
    void dellfront(){
        //fungsi “dellfront” menghapus bagian data yang berada di depan,
        //dimana data yang akan dihapus adalah data yang berada diurutan paling awal.

        if(head==null){
            System.out.println("List Kosong");
            //Jika “head” atau data awal sama dengan null atau kosong
            // maka program akan menampilkan “List Kosong”

        }else{
            head=head.next;
            //jika “head” tidak kosong maka program akan menjalankan proses pada script “head=head.next;” digunakan untuk
            // memindahkan “head” ke bagaian setelah data awal.

            head.prev=null;
            //digunakan untuk menghapus data awal dengan mengubahnya menjadi null.
        }
    }
    void dellback(){
        //fungsi “dellback” menghapus bagian data terakhir,
        //dimana data yang akan dihapus adalah data yang berada diurutan paling akhir.

        if(head==null){
            System.out.println("List Kosong");
            //Jika “head” atau data awal sama dengan null atau kosong
            // maka program akan menampilkan “List Kosong”

        }else{
            tail=tail.prev;
            //jika “head” tidak kosong maka program akan menjalankan proses pada script “tail=tail.prev;” digunakan untuk
            // memindahkan “tail” ke bagaian sebelum data terakhir.

            tail.next=null;
            //digunakan untuk menghapus data terakhir dengan mengubahnya menjadi null.

        }
    }

    void tampil(){
        //digunakan untuk menampilkan data-data yang akan ditampilkan.

        node tmp=head;
        //digunakan untuk membuat variabel baru dengan nama “tmp” yang berada di head.

        if(head==null){
            System.out.println("List Kosong");
            //digunakan apabila isi data kosong dan program akan menampilkan “List Kosong”.

        }else{
            while(tmp !=null){
                System.out.print(tmp.data +" ");
                tmp=tmp.next;
             //Jika datanya ada maka akan dilakukan proses penambahan data terus-menerus.

            }
        }System.out.println();
    }

    void del(int b){
        //merupakan sebuah fungsi bernama “del” dengan parameter “int b” yang digunakan
        //untuk menghapus data tertentu pada parameter.

        node tmp=head;
        node after=tmp.next;
        // Pada fungsi ini digunakan variabel bantu dengan nama “tmp” yang diinisialisasikan sama dengan
        // “head” dan “node after” sama dengan “tmp.next”.

        if(tmp.next != null){
            while(tmp.next.data != b){
                tmp=tmp.next;
                after=after.next;
                //Jika “tmp.next” tidak sama dengan “null” maka akan dicari data bernilai “b”
                //secara berurutan sampai bertemu.
            }
            tmp.next=after.next;
            after=null;

            //Jika sudah bertemu maka akan dihapus.
        }
    }
    void urut(){
        //merupakan sebuah fungsi “urut” yang digunakan untuk
        // mengurutkan data-data dengan metode insertion sort

        node tmp;
        int t;
        //  Lalu digunakan variabel bantu bernama “tmp” dan “t”.

        for(int i=0; i < 7; i++){
            tmp=head;
            while(tmp.next!=null){
                if(tmp.data>tmp.next.data){
                    t=tmp.data;
                    tmp.data=tmp.next.data;
                    tmp.next.data=t;}
                tmp=tmp.next;}}
    }
    void addafter(int b,int a){
        //merupakan sebuah fungsi bernama “addafter” dengan dua parameter yaitu “int b” yang digunakan untuk
        // menambahkan data tertentu setelah data yang dimasukkan oleh pengguna.

        node tmp=head;
        node baru = new node(b);
        //pertama dibuatkan sebuah objek baru dengan nama “baru”.

        while(tmp.data != a){
            tmp=tmp.next;
            //digunakan untuk mencari data “a” yang nantinya data akan ditambah
        }
        node bantu = tmp.next;
        tmp.next = baru;
        baru.next = bantu;
        baru.prev = tmp;
        bantu.prev = baru;
    }
    void dellall(){
        //merupakan sebuah fungsi bernama “dellall” dengan tanpa parameter
        //yang digunakan untuk menghapus semua data.

        head = null;
        tail = null;
        System.out.println("* kosong *");
        //digunakan untuk menghapus semua data dan data tersebut
        //akan menjadi “null” dan akan tampil keluaran “kosong”.
    }
    public static void main (String [] args){
        //merupakan sebuah fungsi main yang digunakan untuk memanggil fungsi-fungsi lainnya
        //yang sudah dibuat dan mengurutkannya sesuai permaslahan.
        //Fungsi main juga merupakan fungsi yang akan diproses terlebih dahulu sebelum fungsi lain.

        DoubleLinkedList x= new DoubleLinkedList();
        //digunakan untuk membuat objek baru yang nantinya akan digunakan untuk memanggil fungsi lain.

        System.out.println("Peserta uji nyali = ");
        x.addback(1);
        x.addback(2);
        x.addback(3);
        x.addback(4);
        x.addback(5);
        x.addback(6);
        x.addback(7);
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah 3 orang terdepan masuk duluan = ");
        x.dellfront();
        x.dellfront();
        x.dellfront();
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali, setelah no 5 kabur = ");
        x.del(5);
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah masuk orang asing = ");
        x.addback(10);
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah no 3 masuk kembali kebarisan di belakang no 6 = ");
        x.addafter(3,6);
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah no 1 masuk kebarisan paling awal = ");
        x.addfront(1);
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah no 2 masuk kebarisan di belakang no 3 = ");
        x.addafter(2,3);
        x.tampil();
        x.dellback();
        x.addback(5);
        System.out.println(" ");

        System.out.println("sisa peserta uji nyali setelah no 5 masuk kembali ke barisan belakang = ");
        x.tampil();
        System.out.println(" ");

        x.dellall();
        System.out.println(" ");

        x.addback(5);x.addback(2);x.addback(1);
        x.addback(7);x.addback(6);x.addback(4);x.addback(3);

        System.out.println("sisa Orang-orang uji nyali");
        x.tampil();
        System.out.println(" ");

        System.out.println("sisa akhir peserta uji nyali = ");
        x.urut();
        x.tampil();
    }
}

//Kesimpulan =

//Hal yang paling menonjol dalam pengimplementasian double linked list sehingga berbeda dengan single linked list adalah
//bertambahnya satu pointer baru, yaitu pointer before.
//Pointer ini membuat pengaksesan node linked list lebih mudah
// karena bisa dilakukan dari depan dan belakang.

//Konsep pengoperasian double linked list sangat dibutuhkan ketelitian dalam membuatnya
//seperti bagaimana cara mengarahkan, menyambung dan memutus antara node yang satu dengan node yang lain
// dari belakang maupun dari depan.
