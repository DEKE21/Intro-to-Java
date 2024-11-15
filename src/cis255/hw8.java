package cis255;

public class hw8 {
    public static void main(String[] args) {
        int theList[] = new int[4];
        theList[0] = 1;
        theList[1] = -7;
        theList[2] = 10;
        theList[3] = 23;
        System.out.println("The sum of the array is " +aSum(theList));
        System.out.println("The number of positive values in the arrays is " + aNumPos(theList));
        System.out.println("The sum of the negative values in the arrya is "+ aSumNeg(theList));
        System.out.println("The smallest value in the array is " + aMin(theList));
        System.out.println("Does the sum of the array equal to zero " +aIsClear(theList));
        System.out.println("Does the array contain a value equal to T " +aIsThere(theList, 0));
        System.out.println("The number of values in the araay that are less than x is "+aNumless(theList, 10));

    }
    public static int aSum(int list[]){
        int Sum = 0;
        for(int i =0; i< list.length; i++){
            Sum += list[i];
        }
        return Sum; 
    }
    public static int aNumPos(int list[]){
        int posData = 0;
        for(int i =0; i< list.length; i++){
            if(list[i] >0 ){
                posData += 1;
            }       
        }
        return posData;
    }
    public static int aSumNeg(int list[]){
        int Sum = 0;
        for(int i =0; i< list.length; i++){
            if(list[i] < 0 ){
                Sum += list[i];
            }       
        }
        return Sum;
    }
    public static int aMin(int list[]){
        int Min = 0;
        for(int i =0; i< list.length; i++){
            int x = 0;
            if(list[i] < list[x]){
                Min = list[i];
                x+=1;  

            }     
        }
        return Min;
    }
    public static boolean aIsClear(int list[]){
        int sum =0; 
        for(int i =0; i< list.length; i++){
            sum =+ list[i];
        }
        if(sum == 0){ return true;}
        else{return false;}
    }
    public static boolean aIsThere(int list[], int t){
        int x = 0;
        for(int i =0; i< list.length; i++){
            if(list[i] == t){
                x =+1;
            }
        }
        if( x >0){return true;}
        else{return false;}
    }
    public static int aNumless(int list[], int x){
        int num =0;
        for(int i =0; i< list.length; i++){
            if(list[i] < x){
                num +=1;
            }
        }
        return num;
    }
}