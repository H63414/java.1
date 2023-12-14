public class Prime{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=20;i++){
            if(i==2||i==3){
                System.out.println(i);
            }
            else{
                for(j=2;j<=i;j++){
                    if(i%j==0){
                        break;
                    }
                    if(j==i/2){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}