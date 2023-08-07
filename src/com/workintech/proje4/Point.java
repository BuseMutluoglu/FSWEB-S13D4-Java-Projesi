package com.workintech.proje4;
//ACsess modifier(public,private,protected,default)protected yaparsam private i
// sadece aynı packectekiler erişebilir sadece proje4tekirler erişir maindeki erişemez
//default değeri protected gibi davranır
//static keyword = duragan demek. bişey staticse o instancea baglı değildir sınıfa baglıdır.
// Math.PI erişebilirim cunku static
//static metotlar instance variablelara erişemez statik metotlara erişir
//bir değişken staticse final olmaya adaydır yapılabiliyorsa yap.
//static metotlara sınıf üzerinden erişilir
//encapsulatison instancelar public olursa dısarıdan değiştirilebilir ve bunu istemeyiz yazılımcı kontrolunde olmalı
//bunun için instance lar private edilip(bu halde güncellenemez) getter ve setter
// metotları oluşturulup güncelleme yapılabilir hale gelir

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    //this.x-0 yazmak zorunda değiliz cunku bir x diye parametre yok o yüzden instancetaki oldugu kesin
      return Math.sqrt(Math.pow((this.x-0),2)+Math.pow((this.y-0),2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow((this.x-a),2)+Math.pow((this.y-b),2));
    }

    public double distance(Point p){
       /* if(p==null){
            p=new Point(0,0);
        }*/
        if(p!=null) {
            return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
        }
        return distance();
    }

}
