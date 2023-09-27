public class Book {
    private String name;
    private String author;
    private String year;
    private String edition;
    private boolean available;

    public Book(String name,String author,String year,String edition) {
        this.name=name;
        this.author=author;
        this.year=year;
        this.edition=edition;
        this.available=true;

    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {

        this.edition = edition;
    }

    // public Book() {

    //     this.available = true;
    //}

    //public boolean isAvailable() {
    //   return available = true;
    // }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean loan(){
        if (available == true) {
            available = false;
            return true;
        }
        return false;
    }
    public boolean returnBook(){
        if (available == false) {
            available = true;
            return true;
        }
        return false;
    }




    public String toString() {
        return "\n" +" Book name: " + name + "\n" + " Author: " + author + "\n" + " Release Year: " + year + "\n" + " Book Edition: " + edition + "\n" + " In stock: " + available + "\n" +"\n";
    }
}
