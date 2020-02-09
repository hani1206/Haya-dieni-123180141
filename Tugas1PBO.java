import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        String nama;
        int[] nilai = new int[5];
        double jmlNilai = 0;
        double min = 101;
        double max = 0;
        Scanner sc = new Scanner(System.in);
        Scanner NumSc = new Scanner(System.in);
        System.out.print("Nama = ");
        nama = sc.nextLine();
        int i;
        for ( i=0; i<5; i++){
        System.out.print( "Nilai Ke - " + (i+1) + " = ");
        nilai[i] = NumSc.nextInt();
         if (i == 1){
                min = nilai[i];
                max = nilai[i];
            }
            else if (min > nilai[i]){
                min = nilai[i];
            }
            else if (max < nilai[i]){
                max = nilai[i];
            }
            jmlNilai = jmlNilai + nilai[i];
        }
        double avg;
            avg = jmlNilai / i;
            
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata - rata Nilai : " + avg);

        
        }
    }
