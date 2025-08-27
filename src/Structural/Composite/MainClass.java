package Structural.Composite;

import Structural.Composite.ExpressionEvaluation.ArithmeticExpression;
import Structural.Composite.ExpressionEvaluation.Expression;
import Structural.Composite.ExpressionEvaluation.Number;
import Structural.Composite.ExpressionEvaluation.Operator;
import Structural.Composite.FileSystem.Directory;
import Structural.Composite.FileSystem.File;
import Structural.Composite.FileSystem.FileSystem;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //File System Design
        FileSystem file1 = new File("Notes1.txt");
        FileSystem file2 = new File("Notes2.txt");
        FileSystem file3 = new File("Notes3.txt");
        FileSystem file4 = new File("Notes4.txt");

        List<FileSystem> subFileSystem = List.of(file3, file4);
        FileSystem SubDir = new Directory("Sub Dir", subFileSystem);
        List<FileSystem> mainFileSystem = List.of(file1, file2,SubDir);
        FileSystem mainDir = new Directory("Main Dir", mainFileSystem);
        mainDir.ls();

        //Expression Evaluation Design
        //2*(1+7)
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression add = new Expression(one,seven,Operator.ADD);

        ArithmeticExpression two = new Number(2);

        ArithmeticExpression multiply = new Expression(two,add,Operator.MULTIPLY);

        int evaluate = multiply.evaluate();
        System.out.println(evaluate);


    }


}
