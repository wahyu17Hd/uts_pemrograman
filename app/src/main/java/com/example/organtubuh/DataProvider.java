package com.example.organtubuh;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.organtubuh.model.Organ;
import com.example.organtubuh.model.Pencernaan;
import com.example.organtubuh.model.Peredarandarah;
import com.example.organtubuh.model.Pernapasan;



public class DataProvider {
    private static List<Organ> organs = new ArrayList<>();

    private static List<Pernapasan> initDataPernapasan(Context ctx) {
        List<Pernapasan
                pernapasans = new ArrayList<>();
        pernapasans.add(new Pernapasan("SINUS", "Rongga pada tengkorak hidung",
                "Fungsi Sinus adalah untuk menghangatkan/melembabkan udara yang dihirup, membantu pengaturan tekanan intranasal, berperan dalam pertahanan tubuh, meringankan tengkorak dan memberikan resonansi suara", R.drawable.p_sinus));
        pernapasans.add(new Pernapasan("FARING", "di depan tulang leher",
                " Faring berperan dalam proses masuknya udara ke dalam pita suara untuk menghasilkan suara. Faring juga menjadikan manusia mungkin untuk bernapas melalui mulut", R.drawable.p_faring));
        pernapasans.add(new Pernapasan("PARU PARU", "Rongga dada bagian atas",
                "Paru-paru merupakan organ respirasi (pernapasan) yang berhubungan dengan sistem pernapasan dan sirkulasi (peredaran darah) dalam tubuh vertebrata yang bernapas dengan udara. Fungsinya adalah menukar oksigen dari udara dengan karbon dioksida dari darah. Prosesnya disebut \"pernapasan eksternal\" atau bernapas", R.drawable.p_paru_paru));
        pernapasans.add(new Pernapasan("TRAKEA", "laring Dan terbipukasi",
                "Fungsi trakea yang pertama adalah sebagai penyedia akses pernapasan bagi tubuh. Trakea menyuplai udara ke paru-paru agar udara dapat masuk dan keluar dari paru-paru. Selain itu, trakea juga mampu menghangatkan serta melembapkan udara yang masuk ke paru-paru", R.drawable.p_trakea));
        pernapasans.add(new Pernapasan("BRONKUS", "Setelah tenggorokan (trachea) sebelum paru paru",
                "Bronkus adalah saluran udara yang memastikan udara masuk dengan baik dari trakea ke alveolus. Selain sebagai jalur masuk dan keluarnya udara, bronkus juga berfungsi untuk mencegah infeksi", R.drawable.p_bronkus));
        return pernapasans;
    }

    private static List<Pencernaan> initDataPencernaan(Context ctx) {
        List<Pencernaan> pencernaans = new ArrayList<>();
        pencernaans.add(new Pencernaan("MULUT", "Bagian kepala",
                "Mulut Menghancurkan makanan sehingga ukurannya cukup lebih kecil untuk dapat ditelan ke dalam perut. Proses pencernaan dimulai sejak makanan masuk ke dalam mulut. Di dalam mulut terdapat alat-alat yang membantu dalam proses pencernaan", R.drawable.pn_mulut));
        pencernaans.add(new Pencernaan("KERONGKONGAN", "Tenggorokan dan lambung",
                "Kerongkongan adalah saluran yang menjadi penghubung antara rongga mulut dan lambung. Kerongkongan memiliki dua bagian, yakni bagian faring dan esophagus. Kerongkongan memindahkan makanan dari mulut ke lambung", R.drawable.pn_lambung));
        pencernaans.add(new Pencernaan("PANKREAS", "Belakang rongga perut",
                "ankreas merupakan salah satu organ di dalam sistem pencernaan manusia. Secara umum, fungsi pankreas dalam tubuh adalah memproduksi hormon dan enzim untuk menghancurkan makanan di dalam perut", R.drawable.pn_pankreas));
        pencernaans.add(new Pencernaan("LAMBUNG", "Di tengah agak ke kiri dalam tubuh Manusia",
                "Fungsi lambung dalam sistem pencernaan yang kedua adalah untuk mencerna makanan. Setelah makanan dicerna di mulut, makanan akan masuk ke esofagus dan kemudian menuju ke lambung. Di dalam lambung inilah makanan akan melalui proses pencernaan tahap kedua", R.drawable.pn_lambung));
        pencernaans.add(new Pencernaan("ANUS", "Tengah bokong,Bagian posterior dari poritoneum",
                "Anus adalah bagian akhir dari sistem pencernaan pada manusia dan hewan. Fungsi utama anus adalah untuk mengendalikan proses pembuangan kotoran (feses/tinja)", R.drawable.pn_anus));
        return pencernaans;
    }
    private static List<Peredarandarah> initDataPeredarandarah(Context ctx) {
        List<Peredarandarah> peredarandarahs = new ArrayList<>();
        peredarandarahs.add(new Peredarandarah("JANTUNG", "Dalam rongga dada seblah kiri",
                "fungsi jantung yang utama adalah memompa darah ke seluruh tubuh dan menampungnya kembali setelah dibersihkan organ paru-paru. Hal ini berarti bahwa fungsi jantung manusia adalah sebagai alat atau organ pemompa darah pada manusia", R.drawable.pd_jantung));
        peredarandarahs.add(new Peredarandarah("ARTERI", "Bagian dalam tubuhn atau tersembunyi",
                "arteri adalah mengalirkan darah keluar jantung atau dari jantung ke seluruh tubuh", R.drawable.pd_arteri));
        peredarandarahs.add(new Peredarandarah("DARAH", "Di dalam pembuluh darah dan juga dalam bilik jantung",
                "Darah adalah sebuah cairan di mana cairan itu adalah seperti air dan cairan itu berfungsi untuk mengangkut oksigen melalui sel-sel darah ke seluruh tubuh dan merupakan kebutuhan makhluk hidup.", R.drawable.pd_darah));
        peredarandarahs.add(new Peredarandarah("PEMBULUH DARAH", "Di bagian dalam tubuh atau tersembunyi",
                "Fungsi pembuluh darah arteri adalah mengalirkan darah keluar jantung atau dari jantung ke seluruh tubuh. Darah yang diangkut dalam pembuluh darah arteri adalah darah yang mengandung oksigen tinggi, kecuali pada pembuluh darah arteri di paru-paru", R.drawable.pd_pembuluh_darah));
        peredarandarahs.add(new Peredarandarah("VENA", "permukaan tubuh dan bewarna kebiru_biruan",
                "vena berfungsi mengalirkan darah masuk ke dalam jantung. Darah yang diangkut dalam pembuluh darah vena adalah darah yang mengandung oksigen rendah atau tinggi karbon dioksida, kecuali pada pembuluh vena yang asalnya dari paru-paru", R.drawable.pd_vena));
        return peredarandarahs;

    }

    private static void initAllOrgans(Context ctx) {
        organs.addAll(initDataPernapasan(ctx));
        organs.addAll(initDataPencernaan(ctx));
        organs.addAll(initDataPeredarandarah(ctx));

    }

    public static List<Organ> getAllOrgan(Context ctx) {
        if (organs.size() == 0) {
            initAllOrgans(ctx);
        }
        return  organs;
    }

    public static List<Organ> getOrgansByTipe(Context ctx, String jenis) {
        List<Organ> organsByType = new ArrayList<>();
        if (organs.size() == 0) {
            initAllOrgans(ctx);
        }
        for (Organ o : organs) {
            if (o.getJenis().equals(jenis)) {
                organsByType.add(o);
            }
        }
        return organsByType;
    }

}






