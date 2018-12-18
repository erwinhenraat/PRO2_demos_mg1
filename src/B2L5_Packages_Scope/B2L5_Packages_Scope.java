package B2L5_Packages_Scope;
import B2L5_Packages_Scope.utils.Calculator;
import B2L5_Packages_Scope.utils.Whatever;

public class B2L5_Packages_Scope {

    public static void main(String[] args){
        System.out.println("hallo ik kom uit een package");


        Calculator c = new Calculator();
        //c.operation = "vermenigvuldigen";
        // operation is niet beschikbaar omdat Calculator in een andere package zit.
        Whatever w = new Whatever();


    }
}
