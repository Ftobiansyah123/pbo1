package model;

import java.util.ArrayList;

public class User {
  // ini adalah atribut / propeti
  private string id;
  private string namalengkap;
  private int banyakbarang;
  private double jmlbarang;
  private string namabarang;
  private int nobarang;
  private string kadaluarsa;
  private string tipe;
}

 // setterandgetter
public string getId(){
  retun id;
 }
public void setId(String id) {
  this.id = id;
}

public string getNamalengkap() {
return namalengkap;
}

public void setNamalengkap(String namalengkap) {
 this.namalengkap = namalengkap;
}

public string getBanyakbarang(){
  return banyakbarang;
}
public void setBanyakbarang(String id) {
  this.banyakbarang = banyakbarang;
}

public string getJmlbarang(){
  return jmlbarang;
}
public void setJmlbarang(String jmlbarang) {
  this.jmlbarang = jmlbarang;
}

public string getNamabarang(){
  return namabarang;
  
  public void ketUser()
}
public void setNamabarang(String namabarang) {
  this.namabarang = namabarang;
}

public string getNobarang(){
  return nobarang;
}
public void setNobarang(String nobarang) {
  this.nobarang = nobarang;
}

public string getKadaluarsa(){
  return kadaluarsa;
}
public void setKadaluarsa(String kadaluarsa) {
  this.kadaluarsa = kadaluarsa;
}

public string getTipe(){
  return tipe;
}
public void setTipe(String tipe) {
  this.tipe = tipe;
}

//methode menampilkan user
public void tampilkanidentitas(){
  System.out.println("id user :"+id);
  System.out.println("Nama user :"+namalengkap);
  System.out.println("banyaknya barang : "+banyakbarang);
  System.out.println("jumlah barang :"+jmlbarang);
  System.out.println("nama barang :"+namabarang);
  System.out.println("nomor barang :"+nobarang); System.out.println("Kadaluarsa :"+kadaluarsa);
  System.out.println("Tipe barang"+tipe);
   
}


