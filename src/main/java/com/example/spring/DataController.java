/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author acer
 */
@Controller
public class DataController {
    @RequestMapping("/DataKTP")
    //@ResponseBody
    public String getData(Model model)
    {
        ArrayList<List<String>> data = new ArrayList();
        data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(Arrays.asList("1","123456321712","Abdul Rahman","Desa Podosari"));
        data.add(Arrays.asList("2","123214534567","Aldy Ahmad Dani","Desa Gejlig"));
        data.add(Arrays.asList("3","123454257327","Agung Prasetyo","Desa Tambakroto"));
        data.add(Arrays.asList("4","123456721343","Arum Pangestu","Desa Linggoyono"));
        data.add(Arrays.asList("5","123456756432","Asil Libero","Desa Duet"));
        data.add(Arrays.asList("6","123456734578","Azza Zidan","Desa Bojong Minggir"));
        data.add(Arrays.asList("7","123456767843","Azizah Aisah","Desa Kajen"));
        data.add(Arrays.asList("8","123456725621","Bayu Fiyanto","Desa kajen"));
        data.add(Arrays.asList("9","123456790990","Bila Nur","Kota Kesesi"));
        data.add(Arrays.asList("10","12345670067","Bintang Kojora","Desa Karanganyar"));
        data.add(Arrays.asList("11","12345679908","Bilal Futuristic","Desa Podosari"));
        data.add(Arrays.asList("12","12345670004","Cahya Wardani","Desa Kebonagung"));
        data.add(Arrays.asList("13","12345670005","Cahyono","Desa Kebonagung"));
        data.add(Arrays.asList("14","12345670006","Carline Angelin","Desa Bojong"));
        data.add(Arrays.asList("15","12345670007","Dimas Kusumo","Desa Bojong"));
        data.add(Arrays.asList("16","12345670008","Ehsan Juita","Desa Kajen"));
        data.add(Arrays.asList("17","12345670009","Fito Hui","Kota Kajen"));
        data.add(Arrays.asList("18","12345670010","Galang Ardiansyah","Wonopringgo"));
        data.add(Arrays.asList("19","12345670011","Hilda Ryuha","Pekalongan"));
        data.add(Arrays.asList("20","12345670012","Isna Hifdzi Walidain","Desa Podosari"));
        
        model.addAttribute("DataKTP", data);
        return "tampilKTP";
    }
}
