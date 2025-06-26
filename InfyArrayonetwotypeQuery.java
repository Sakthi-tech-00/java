
import java.util.*;
public class InfyArrayonetwotypeQuery {
        public static void main(String[] args) {

            Scanner sk=new Scanner(System.in);
            final int mod=1_000_000_007;
            int n=sk.nextInt();
            int []A=new int[n];
            for(int i=0;i<n;i++) A[i]=sk.nextInt();
            int q=sk.nextInt();
            long totsum=0;
            for(int j=1;j<=q;j++){
                int typ=sk.nextInt();
                int l=sk.nextInt();
                int r=sk.nextInt();
                if(typ==1){
                    for(int i=l;i<=r;i++){
                        A[i]=(int)((i-l+1)*A[l])%mod;
                    }
                }
                else if(typ==2){
                    long sum=0;
                    for(int i=l;i<=r;i++){
                        sum+=A[i];
                    }
                    totsum=(totsum+sum)%mod;
                }

            }
            System.out.println(totsum);



        }
}