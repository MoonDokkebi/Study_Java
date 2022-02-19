package ch03;

public class Books {
    String title;
    String author;
}
class BookTestDriver{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0]=new Books();
        myBooks[1]=new Books();
        myBooks[2]=new Books();
        int x=0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The java Gatsby";
        myBooks[2]. title = "the Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.print(myBooks[x].author);
            x+=1;
            System.out.println();
        }
    }
}
