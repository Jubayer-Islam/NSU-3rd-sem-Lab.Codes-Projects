package ascending;
public class Ascending {
    public static void main(String[] args) {
        int arr []= {0,1,1,0,3,45,0,6,766,5,4,3,6,8};
        int temp,i,j;
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp; 
              //if ( arr[j]==arr[i])
                //System.out.println(arr[j]);
                }
            }
        }
        System.out.println("Ascending order : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
              
            //System.out.println(+arr[i]);
        }
        System.out.printf("\n");
    }
    
}
