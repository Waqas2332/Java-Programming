import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int i = 0;
        while(i < image.length){
            int j = 0;
            int k = image[i].length - 1;
            while(j < k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            for (int l = 0; l < image[i].length; l++) {
                if(image[i][l] == 0){
                    image[i][l] = 1;
                }else{
                    image[i][l] = 0;
                }
            }
            i++;
        }


        for(int[] img:image){
            System.out.println(Arrays.toString(img));
        }
        return image;
    }
}
