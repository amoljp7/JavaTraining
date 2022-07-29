import java.util.*;
public class Assignment1 {
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter","1","jk rolling","1",200,1000f);
		Book b2 = new Book("Atomic habits","1","james clear","1",300,1500f);
		Book b3 = new Book("Atomic habits","1","james clear","1",300,1500f);
		 
		HashSet<Book> hs = new HashSet<Book>();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		for(Book b :hs)
		{
			System.out.println(b);
		}
	}

}
class Book
{
	String title;
	String bookNo;
	String author;
	String edition;
	int pageco; 
	float price;
	public Book(String title, String bookNo, String author, String edition, int pageco, float price) {
		super();
		this.title = title;
		this.bookNo = bookNo;
		this.author = author;
		this.edition = edition;
		this.pageco = pageco;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookNo, edition, pageco, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookNo, other.bookNo)
				&& Objects.equals(edition, other.edition) && pageco == other.pageco
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookNo=" + bookNo + ", author=" + author + ", edition=" + edition
				+ ", pageco=" + pageco + ", price=" + price + "]";
	}
	
	
	
}