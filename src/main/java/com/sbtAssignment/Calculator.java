package com.sbtAssignment;

import java.sql.*;
import java.util.Scanner;

public class Calculator {
    private double left_operand;
    private double right_operand;
    private double result;
    private String operation;
    private Calculator calcOperator;
    public Connection dbSaver=new DBClass().getConnection();

    public void setCalcOperator(Calculator calcOperator) {
        this.calcOperator = calcOperator;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getLeft_operand() {
        return left_operand;
    }

    public void setLeft_operand(double left_operand) {
        this.left_operand = left_operand;
    }

    public double getRight_operand() {
        return right_operand;
    }

    public void setRight_operand(double right_operand) {
        this.right_operand = right_operand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void displayOperations(Calculator object)
    {
        System.out.println("please select the desired choice");
        System.out.println("press 1 to Add");
        System.out.println("press 2 to Subtract");
        System.out.println("press 3 to divide");
        System.out.println("press 4 to multiply");
        System.out.println("press 5 to power");
        System.out.println("press 6 to find the absolute value");
        System.out.println("press 7 to find max of two");
        System.out.println("press 8 to find the min of two");
        System.out.println("press 9 to find the modulus");

        Scanner s=new Scanner(System.in);
        int input   = s.nextInt();

        switch (input){
            case 1:
                object.add();
                break;
            case 2:
                object.subtract();
                break;
            case 3:
                object.divide();
                break;
            case 4:
                object.multiply();
                break;
            case 5:
                object.power();
                break;
            case 6:
                object.absolute();
                break;
            case 7:
                object.maxOfTwo();
                break;
            case 8:
                object.minOfTwo();
                break;
            case 9:
                object.modulus();
                break;
            default:
                System.out.println("please try again thank you");
        }

    }


    public void setOperands(){
        System.out.println("enter the value of first operand");
        Scanner input=new Scanner(System.in);
        this.setLeft_operand(input.nextFloat());
        System.out.println("enter the value of second operand");
        this.setRight_operand(input.nextFloat());
    }

    public void add(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        calcOperator.setOperation("Add");
        calcOperator.result=calcOperator.getLeft_operand()+calcOperator.getRight_operand();
        System.out.println("the result is "+calcOperator.result);
        calcOperator.saveToDataBase();
    }
    public void subtract(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        calcOperator.setOperation("Subtract");
        calcOperator.result=calcOperator.getLeft_operand()-calcOperator.getRight_operand();
        System.out.println("the result is "+calcOperator.result);
        calcOperator.saveToDataBase();
    }
    public void divide(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        calcOperator.setOperation("Divide");
        if(calcOperator.getRight_operand()!=0) {
            calcOperator.result = calcOperator.getLeft_operand() /calcOperator.getRight_operand();
            System.out.println("the result is "+calcOperator.result);
            calcOperator.saveToDataBase();
        }
        else {
            System.out.println("Divisor cant be zero");
        }
    }
    public void multiply(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        calcOperator.setOperation("Multiplication");
        calcOperator.result=calcOperator.getLeft_operand()*calcOperator.getRight_operand();
        System.out.println("the result is "+calcOperator.result);
        calcOperator.saveToDataBase();

    }
    public void modulus(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        if(calcOperator.getLeft_operand()>0&&calcOperator.getRight_operand()>0)
        {
            calcOperator.setResult(calcOperator.getLeft_operand()%(int)calcOperator.getRight_operand());
            System.out.println("the result is "+calcOperator.getResult());
            calcOperator.setOperation("modulus");
            calcOperator.saveToDataBase();

        }
        else {
            System.out.println("both operands must be positive");
        }
    }
    public void maxOfTwo(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        if(calcOperator.getLeft_operand()>calcOperator.getRight_operand())
        {
            calcOperator.result=calcOperator.getLeft_operand();
            System.out.println("the result is "+calcOperator.getLeft_operand()+" is greater");
            calcOperator.setOperation("Max Value");
            calcOperator.saveToDataBase();
        }
        else if(calcOperator.getRight_operand()>calcOperator.getLeft_operand())
        {

            calcOperator.result=calcOperator.getRight_operand();
            System.out.println("the result is "+calcOperator.getRight_operand()+" is greater");
            calcOperator.setOperation("Max Value");
            calcOperator.saveToDataBase();
        }
        else{
            System.out.println("both are equal");
        }

    }
    public void minOfTwo(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        if(calcOperator.getLeft_operand()>calcOperator.getRight_operand())
        {
            calcOperator.result=calcOperator.getLeft_operand();
            System.out.println("the result is "+calcOperator.getRight_operand()+" is smaller");
            calcOperator.setOperation("min Value");
            calcOperator.saveToDataBase();
        }
        else if(calcOperator.getRight_operand()>calcOperator.getLeft_operand())
        {

            calcOperator.result=calcOperator.getRight_operand();
            System.out.println("the result is "+calcOperator.getLeft_operand()+" is smaller");
            calcOperator.setOperation("min Value");
            calcOperator.saveToDataBase();
        }
        else{
            System.out.println("both are equal");
        }
    }
    public void power(){
        calcOperator=new Calculator();
        calcOperator.setOperands();
        calcOperator.setOperation("power");
        double sum=1;
        int count=(int)calcOperator.getRight_operand();
        while(count>0)
        {
            sum=sum*calcOperator.getLeft_operand();
            count--;
        }
        calcOperator.setResult(sum);
        System.out.println("the result is "+calcOperator.getResult());
        calcOperator.saveToDataBase();
    }
    public void absolute(){
        calcOperator=new Calculator();
        System.out.println("enter the value");
        calcOperator.setLeft_operand(new Scanner(System.in).nextFloat());
        calcOperator.setRight_operand(0);
        if(calcOperator.getLeft_operand()<0)
        {
            calcOperator.setResult(0-calcOperator.getLeft_operand());
        }
        else   {
            calcOperator.setResult(calcOperator.getLeft_operand());
        }
        System.out.println("the result is "+calcOperator.getResult()+" is the absolue value");
        calcOperator.setOperation("absolute value");
        calcOperator.saveToDataBase();
    }

    public void saveToDataBase()
    {
        String update="INSERT INTO calculator (left_operand,right_operand,operator,result) values (?,?,?,?)";
        try {
            PreparedStatement preparedStatement=dbSaver.prepareStatement(update);
            preparedStatement.setFloat(1,(float) this.left_operand);
            preparedStatement.setFloat(2,(float)this.right_operand);
            preparedStatement.setString(3,this.operation);
            preparedStatement.setFloat(4,(float)this.result);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void viewOperations()
    {
        DBClass db=new DBClass();
        Connection dbConnection=db.getConnection();
        System.out.println("press 1 to view all operations");
        System.out.println("press 2 to view operations of a specific operation");
        Scanner reader=new Scanner(System.in);
        int x=reader.nextInt();
        if(x==1)
        {
            try {
                Statement statement=dbConnection.createStatement();
                ResultSet rs= statement.executeQuery("SELECT * FROM calculator;");
                if(rs.isBeforeFirst())
                {
                    printResultSet(rs);
                }
                else {
                    System.out.println("no operations available");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if(x==2)
        {
            operationSpecific();
        }
        else{
            System.out.println("you  did not selected a valid input, please try again");
        }
    }
    private static void printResultSet(ResultSet input)
    {

        try{

            while (input.next()) {
                System.out.println(input.getInt(1) + "    " + input.getTimestamp(2) + "   "
                        + input.getFloat(3) + "    " + input.getFloat(4) + "  "
                        + input.getString(5) + "    " + input.getFloat(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void operationSpecific()
    {
        System.out.println("please select the desired choice");
        System.out.println("press 1 for all Add operations");
        System.out.println("press 2 for all Subtract operations");
        System.out.println("press 3 for all divide operations");
        System.out.println("press 4 for all multiply operations");
        System.out.println("press 5 for all power operations");
        System.out.println("press 6 for all absolute value operations");
        System.out.println("presss 7 for all max of two operations");
        System.out.println("press 8 for all min of two operations");
        System.out.println("press 9 for all  modulus operations");

        int input=new Scanner(System.in).nextInt();
        String operation;
        switch (input){
            case 1:
                operation="Add";
                showSpecificOperation(operation);
                break;
            case 2:
                operation="Subtract";
                showSpecificOperation(operation);
                break;
            case 3:
                operation="Divide";
                showSpecificOperation(operation);
                break;
            case 4:
                operation="Multiplcation";
                showSpecificOperation(operation);
                break;
            case 5:
                operation="power";
                showSpecificOperation(operation);
                break;
            case 6:
                operation="absolute value";
                showSpecificOperation(operation);
                break;
            case 7:
                operation="Max Value";
                showSpecificOperation(operation);
                break;
            case 8:
                operation="min Value";
                showSpecificOperation(operation);
                break;
            case 9:
                operation="modulus";
                showSpecificOperation(operation);
                break;
            default:
                System.out.println("you did not selected the appropriate option, please try again");

        }
    }


    private static void showSpecificOperation(String operation)
    {
        Connection fetch=new DBClass().getConnection();
        String query="SELECT * FROM calculator WHERE operator=?";
        try {
            PreparedStatement stm=fetch.prepareStatement(query);
            stm.setString(1,operation);
            ResultSet resultSet=stm.executeQuery();
            if(resultSet.isBeforeFirst())
            {

                printResultSet(resultSet);

            }
            else {
                System.out.println("no data availbe");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
