package encapsulationexer.exer2;

/**
 * @ClassName:bookTest2
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/24
 */
public class BookTest2 {
    public static void main(String[] args) {
        Book1 book1 = new Book1();
        Book1 book2 = new Book1();
        book1.setbookName("哈哈怪");
        book1.setAuthor("Laugh_Monster");
        book1.setPrice(999);
        System.out.println(book1.showIofo());
    }
}
