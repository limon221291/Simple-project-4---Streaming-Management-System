import stream.StreamInfoV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("How many users? ");
        int array_size=in.nextInt();
        in.nextLine();

        StreamInfoV2[] stream=new StreamInfoV2[array_size];

        for(int i=0;i<array_size;i++){
            stream[i]=new StreamInfoV2();

            System.out.println("Enter user "+(i+1)+" name: ");
            stream[i].updateName(in.nextLine());

            System.out.println("Enter user "+(i+1)+" account number: ");
            stream[i].updateUAccountNo(in.nextInt());

            System.out.println("Enter user "+(i+1)+" balance: ");
            stream[i].setUbalance(in.nextDouble());

            System.out.println("How many movies user "+(i+1)+" want to watch? ");
            int moviescount=in.nextInt();
            in.nextLine();

            for(int j=1;j<=moviescount;j++){
                stream[i].watchMovie();
            }


        }

        for(int i=0;i<array_size;i++){
            System.out.println("User "+(i+1)+" current balance : "+stream[i].getUbalance());
            System.out.println("Movies watched by User "+(i+1)+" : "+stream[i].getNumberOfMovie());
        }

        int minimum=stream[0].getNumberOfMovie();
        int index=0;
        for(int i=0;i<array_size;i++){
            if(minimum>stream[i].getNumberOfMovie()){
                index=i;
            }
        }

        System.out.println("Minimum numbers of movies watched by "+stream[index].uName);

    }
}
