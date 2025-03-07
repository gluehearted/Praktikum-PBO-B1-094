/**
 * File : ExceptionOnArray.java
 * deskripsi : Program penggunaan eksepsi meggunakan class library java
 * nama : Gabriel Prakosa Ardhi
 * tanggal : 4 Februari 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args){
        int[] arr = new int[5];
        try {
            arr[2] = 11;
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
