
package entitas_kelompok_6;


public class list_menu_kelompok_6 {
    private String nama_menu;
    private int harga_menu;
    private int jumlah_porsi;
    private String deskripsi_menu;
    
    public list_menu_kelompok_6(String nama, int harga, int jum, String deskripsi){
        nama_menu = nama;
        harga_menu = harga;
        jumlah_porsi = jum;
        deskripsi_menu = deskripsi;
    }
    
    public void setNama_Menu(String nama){
        nama_menu = nama;
    }
    public void setHarga_Menu(int harga){
        harga_menu = harga;
    }
    public void setJumlah_Porsi(int jum){
        jumlah_porsi = jum;
    }
    public void setDeskripsi_Menu(String deskripsi){
        deskripsi_menu = deskripsi;
    }
    
    public String getNama_Menu(){
        return nama_menu;
    }
    public int getHarga_Menu(){
        return harga_menu;
    }
    public int getJumlah_Porsi(){
        return jumlah_porsi;
    }
    public String getDeskripsi_Menu(){
        return deskripsi_menu;
    }
}