public class Book {

    private String title;
    private String author;
    private String description;
    private float price;
    private boolean isInStock;

    public Book() { //default constructor
        System.out.println("A title has been created, \n the constructor ran successfully");
        this.title = "";
        this.author = "";
        this.description = "";
        this.price = 0;
        this.isInStock = true;


        }    //overload constructor
    public Book(String title, String author, String description, float price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;



    }//method to get title attribute
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getDescription() {
        return this.description;
    }
    public float getPrice() {
        return this.price;
    }
    public boolean getInStock() {
        return this.isInStock;
    }







}
/*Create a project in IntelliJ called BookApplication.

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.



The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.



Publish your solution to GitHub and submit your GitHub url as the assignment.*/
