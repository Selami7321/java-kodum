public class Main {
    public static void main(String[] args) {
int [][] dizi={
        {2,3,4},
        {5,6,7},
        {0,5,8}};
int transpoze[][];
transpoze=new int[dizi[0].length] [dizi.length];
for(int i=0;i<dizi.length;i++) {
    for (int j = 0; j < dizi[0].length; j++) {
        transpoze[i][j] = dizi[j][i];}

}
for(int i=0;i<dizi.length;i++){
    for(int j=0;j<dizi[0].length;j++){
        System.out.print(transpoze[i] [j]);
    }
    System.out.println();
}









    }
}