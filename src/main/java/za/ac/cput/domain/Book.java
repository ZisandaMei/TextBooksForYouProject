package za.ac.cput.domain;

import java.util.Objects;

public class Book {
    private String ISBN;
    private String Title;
    private String Author;
    private String Edition;
    private String Condition;
    private String Description;
    private String Publisher;
    private Double Price;
    private String UserID;
    private String DatePosted;

    private Book() {
    }

    protected Book(Builder builder){
        this.ISBN= builder.ISBN;
        this.Title= builder.Title;
        this.Author= builder.Author;
        this.Edition= builder.Edition;
        this.Condition= builder.Condition;
        this.Description= builder.Description;
        this.Publisher= builder.Publisher;
        this.Price= builder.Price;
        this.UserID= builder.UserID;
        this.DatePosted= builder.DatePosted;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getEdition() {
        return Edition;
    }

    public String getCondition() {
        return Condition;
    }

    public String getDescription() {
        return Description;
    }

    public String getPublisher() {
        return Publisher;
    }

    public Double getPrice() {
        return Price;
    }

    public String getUserID() {
        return UserID;
    }

    public String getDatePosted() {
        return DatePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getEdition(), book.getEdition()) && Objects.equals(getCondition(), book.getCondition()) && Objects.equals(getDescription(), book.getDescription()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getPrice(), book.getPrice()) && Objects.equals(getUserID(), book.getUserID()) && Objects.equals(getDatePosted(), book.getDatePosted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getISBN(),
                getTitle(),
                getAuthor(),
                getEdition(),
                getCondition(),
                getDescription(),
                getPublisher(),
                getPrice(),
                getUserID(),
                getDatePosted());
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Edition='" + Edition + '\'' +
                ", Condition='" + Condition + '\'' +
                ", Description='" + Description + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Price=" + Price +
                ", UserID='" + UserID + '\'' +
                ", DatePosted='" + DatePosted + '\'' +
                '}';
    }

    public static class Builder {
        private String ISBN;
        private String Title;
        private String Author;
        private String Edition;
        private String Condition;
        private String Description;
        private String Publisher;
        private Double Price;
        private String UserID;
        private String DatePosted;

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public void setEdition(String edition) {
            Edition = edition;
        }

        public void setCondition(String condition) {
            Condition = condition;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public void setPublisher(String publisher) {
            Publisher = publisher;
        }

        public void setPrice(Double price) {
            Price = price;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public void setDatePosted(String datePosted) {
            DatePosted = datePosted;
        }

        public Builder copy(Book b) {
            this.ISBN= b.ISBN;
            this.Title= b.Title;
            this.Author= b.Author;
            this.Edition= b.Edition;
            this.Condition= b.Condition;
            this.Description= b.Description;
            this.Publisher= b.Publisher;
            this.Price= b.Price;
            this.UserID= b.UserID;
            this.DatePosted= b.DatePosted;
            return this;

        }

        public Book build(){
            return new Book(this);
        }
    }
}
