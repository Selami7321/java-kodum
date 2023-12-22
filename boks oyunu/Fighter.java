public class Fighter {
    String ad;
    int hasar;
    int can;
    int agirlik;
    int bloke;
    int ilkvurus;

    Fighter(String ad, int hasar, int can, int agirlik,int bloke,int ilkvurus){
        this.ad=ad;
        this.hasar=hasar;
        this.can=can;
        this.agirlik=agirlik;
        this.ilkvurus=ilkvurus;
       if(bloke>=0 && bloke <=100) {
           this.bloke = bloke;
       }else{
           this.bloke=0;
       }
    }
int hit(Fighter rakip ){
     System.out.println(this.ad + "  =<>=  " + rakip.ad + " "+ this.hasar + " hasar vurdu ");
if(rakip.can-this.hasar <0){
    return 0;
}
        return rakip.can-this.hasar;

}


}
