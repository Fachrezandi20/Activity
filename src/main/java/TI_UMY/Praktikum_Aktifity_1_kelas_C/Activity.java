/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI_UMY.Praktikum_Aktifity_1_kelas_C;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Andi
 */

@Controller
public class Activity {
    @RequestMapping("/dataKtp")
    public String getTable (Model tiki) {
        
        ArrayList<List<String>> data = new ArrayList ();
        
        
        
         data.add(Arrays.asList("10","Joko", "21320059","Desa Dukka"));
         
         data.add(Arrays.asList("11","Dodo", "21320060","Desa Takpernahternilai"));
         
         data.add(Arrays.asList("12","Kita", "21320061","Desa Kusut"));
        
         data.add(Arrays.asList("13","Kamu", "21320062","Desa Zonanyaman"));
         
         data.add(Arrays.asList("14","Malas", "21320063","Desa Menghitunghari"));
         
         data.add(Arrays.asList("15","Guru", "21320064","Desa Hitamputih"));
         
         data.add(Arrays.asList("16","Surya", "21320065","Desa Takpernahberpaling"));
         
         data.add(Arrays.asList("17","Dinda", "21320066","Desa Bernafatanpamu"));
         
         data.add(Arrays.asList("18","Andi", "21320067","Desa Seluruhnafaini"));
         
         
         data.add(Arrays.asList("19","Niza", "21320068","Desa PernahMencintai"));
         
         data.add(Arrays.asList("20","Nisa", "21320069","Desa SinggahdiHati"));
         
         data.add(Arrays.asList("21","Limbat", "21320070","Desa Ditinggalpergi"));
         
         data.add(Arrays.asList("22","Aladin", "21320071","Desa Salingmencintai"));
         
         data.add(Arrays.asList("23","Berlin", "21320072","Desa Menghianati"));
         
         data.add(Arrays.asList("24","Adam", "21320073","Desa Selamatjalan"));
         
         data.add(Arrays.asList("25","Divi", "21320074","Desa Kenanglahaku"));
         
         data.add(Arrays.asList("26","Aldi", "21320075","Desa Yangterdalam"));
         
         data.add(Arrays.asList("27","Fasa", "21320076","Desa Meninggalkanmu"));
         
         data.add(Arrays.asList("28","Bibi", "21320077","Desa Melepaskanmu"));
         
         data.add(Arrays.asList("29","reza", "21320078","Desa Merindukanmu"));
        
        
        
        tiki.addAttribute("table", data );
        
        return "table";
    }
        
}
