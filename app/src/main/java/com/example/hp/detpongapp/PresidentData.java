package com.example.hp.detpongapp;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Tari Legong", "Tari Tentang Kelemah Lembutan", "https://upload.wikimedia.org/wikipedia/commons/a/ab/17_Years_of_Sekar_Jepun_2014-11-01_03.jpg"},
            {"Tari Topeng", "Tari Tentang Karakter Topeng", "https://upload.wikimedia.org/wikipedia/commons/a/a9/Bali-Danse_0710a.jpg"},
            {"Tari Baris", "Tari Tentang Prjurit", "https://upload.wikimedia.org/wikipedia/commons/c/ca/17_Years_of_Sekar_Jepun_2014-11-01_11.jpg"},
            {"Tari Rejang", "Tari Sambutan Dewa-Dewi", "https://i2.wp.com/www.infobudaya.net/wp-content/uploads/2018/04/tarirejang.jpg"},
            {"Tari Pendet", "Tari Sambutan Raja dan Tamu", "https://i2.wp.com/rachnasandika.com/wp-content/uploads/2017/06/Baju-Tari-Pendet.jpg"},
            {"Tari Gambuh", "Sendratari Kuno", "https://upload.wikimedia.org/wikipedia/commons/f/fe/09_05_07_ngayah_GAMBUH_Batuan_%28_2007_—_PICs_%29_—_11_arya.jpg"},
            {"Tari Kreasi", "Tari Modern dan Kontemporer", "https://upload.wikimedia.org/wikipedia/commons/5/58/17_Years_of_Sekar_Jepun_2014-11-01_42.jpg"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);

            list.add(president);
        }

        return list;
    }
}