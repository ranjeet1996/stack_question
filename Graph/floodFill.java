package Graph;

public class floodFill {
    public static void main(String[] args) {
        
    }

    public int[][] floodfill(int[][] image, int sr, int sc, int newcolor) {
        if(image[sr][sc]==newcolor) return image;

        fill(image,sr,sc,image[sr][sc],newcolor);

        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color,int newcolor) {
        if(image[sr][sc]!=color || sr<0 || sc<0 || sr>=image.length || sc>=image[0].length){
            return ;
        } 
        image[sr][sc]=newcolor;
        fill(image,sr-1,sc,color,newcolor);
        fill(image,sr+1,sc,color,newcolor);
        fill(image,sr,sc-1,color,newcolor);
        fill(image,sr,sc+1,color,newcolor);
           
        
    }
    
}
