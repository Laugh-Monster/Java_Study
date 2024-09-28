package encapsulationexer.exer2;

/**
 * @ClassName:book1
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/24
 */
public class Book1 {
    private String bookName;
    private String author;
    private int price;



    public String getbookName() {
        return bookName;
    }

    public void setbookName(String name){
        bookName = name;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String au){
        author = au;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int pr) {
        price = pr;
    }

    public String showIofo(){
        return "书名为：" + bookName + ",作者：" + author + ",价格：" + price;
    }
}
