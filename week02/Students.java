public class Students{

public static void main(String[] args){

String name1= "joe", name2= "william", name3= "mary sue", name4="terry", name5= "keith";
int lab1=43, lab2=50, lab3=39, lab4=45, lab5=49;
int bon1=7, bon2=8, bon3=10, bon4=9, bon5=6;
int tot1, tot2, tot3, tot4, tot5;
tot1 = lab1+bon1;
tot2 = lab2+bon2;
tot3 = lab3+bon3;
tot4 = lab4+bon4;
tot5 = lab5+bon5;

System.out.println("\b///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("==          Student Points          ==");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\b///////////////////\n");

System.out.println("Name\t\tLab\tBonus\tTotal"); 
System.out.println("----\t\t---\t-----\t-----");

System.out.println(name1 +"\t\t" + lab1 +"\t" + bon1 +"\t" + tot1); 
System.out.println(name2 +"\t\t" + lab2 +"\t" + bon2 +"\t" + tot2);
System.out.println(name3 +"\t" + lab3 +"\t" + bon3 +"\t" + tot3);
System.out.println(name4 +"\t\t" + lab4 +"\t" + bon4 +"\t" + tot4);
System.out.println(name5 +"\t\t" + lab5 +"\t" + bon5 +"\t" + tot5); 
 
}
}
 




