package com.CodeWithMe;

public class Chapter_7_Methods {
    //This is Called Methods Here We Pack Methods in One Patch and Called it in Static Main
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
          x = 56; // Here Value of X Doest Not Change Check Out Notes-------->
        System.out.println(x);
        return z;
    }
    public static void main(String[] args) {
//        System.out.println("The Value is "+logic(5,4));

        //Calling a Methods
        /*
        Here If We Not Include Static And We Want To Use Function Or Method so we Always Make Object to use it Like This.----->
         */
        Chapter_7_Methods obj = new Chapter_7_Methods();
        int c = obj.logic(5,8);
        System.out.println(c);

        /*
        If We Call Methods Then The Value of Your Argument is Copy And Go to Your Methods not the Actual Value------->
         */







    }
}
