public class Maç {
    Fighter f1;
    Fighter f2;
    int minAgirlik;
    int makAgirlik;

    Maç(Fighter f1, Fighter f2, int minagirlik, int makagirlik) {
        this.f1 = f1;
        this.f2 = f2;
        this.minAgirlik = minagirlik;
        this.makAgirlik = makagirlik;
    }

    void run() {
        if (isCheck()) {
while(this.f1.can>0 && this.f2.can>=0) {
    System.out.println("--------------YENİ ROUND-------------");
if(this.f1.ilkvurus==50 && this.f2.ilkvurus ==50){
   double randomValue=Math.random() *100;
    this.f1.can=this.f2.hit(this.f1);
if(kazanmak()){
    break;
}

this.f2.can=this.f1.hit(this.f2);
if(kazanmak()){
    break;}
}
System.out.println(this.f1.ad + " Bloke edebildi "+ this.f1.bloke);
System.out.println(this.f2.ad + "Bloke edebildi " + this.f2.bloke);
System.out.println(this.f1.ad + " Sağlık  " + this.f1.can);
System.out.println(this.f2.ad + " Sağlık  " + this.f2.can);

}
        }else{
            System.out.println("Sporcuların sikletleri uymuyor :");
        }
    }

        boolean isCheck(){
        return(this.f1.agirlik>=minAgirlik && this.f1.agirlik <=makAgirlik ) && this.f2.agirlik>=minAgirlik && (this.f2.agirlik<=makAgirlik);
        }
    boolean kazanmak(){
        if(this.f1.can==0){
            System.out.println("KAZANAN : "+ this.f2.ad);
return true;
        }

        if(this.f2.can==0){
            System.out.println("KAZANAN : " + this.f1.ad);
            return true;
        }
        return false;
    }



}