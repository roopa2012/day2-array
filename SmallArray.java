public class SmallArray{
  public static void main(String[] args){
    int[] num = { 1,2,3,4,5,6,7,87,9,20};
    int min = num[0];
    for(int i = 0;i<num.length ; i++){
      if (num[i] > min)
        min = num[i];
    }
    System.out.println(min);
  }
}
