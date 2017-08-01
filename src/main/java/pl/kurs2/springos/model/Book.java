package pl.kurs2.springos.model;

public class Book{

private String Author;
private String Title;
private Double Price;

public Book(){}

public Book(String author, String title, Double price) {
        Author = author;
        Title = title;
        Price = price;
        }

public String getAuthor() {
        return Author;
        }

public void setAuthor(String author) {
        Author = author;
        }

public String getTitle() {
        return Title;
        }

public void setTitle(String title) {
        Title = title;
        }

public Double getPrice() {
        return Price;
        }

public void setPrice(Double price) {
        Price = price;
        }


//    niezgodne z wzorcami dao
//    public List<Book> findAll() {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Zosia","Zosia samosia",12.14));
//        books.add(new Book("ala","ktoś",12.14));
//        books.add(new Book("edek","edek",12.14));
//        books.add(new Book("kur","kur",12.14));
//        return books;
//
//    }

@Override
public String toString() {
        return "Book{" +
        "Author='" + Author + '\'' +
        ", Title='" + Title + '\'' +
        ", Price=" + Price +
        '}';
        }
        }