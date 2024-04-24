package za.ac.cput.domain;

public class Wishlist {
    private int WishlistID;
    private int UserID;
    private int ISBN;
    private  double Price;
    private String Priority;
    private double totalPrice;

    public Wishlist() {
    }

    private Wishlist(Builder builder) {
        this.WishlistID = builder.WishlistID;
        this.UserID = builder.UserID;
        this.ISBN = builder.ISBN;
        this.Price = builder.Price;
        this.Priority = builder.Priority;
        this.totalPrice = builder.totalPrice;

    }


    public int getWishlistID() {
        return WishlistID;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getUserID() {
        return UserID;
    }

    public String getPriority() {
        return Priority;
    }

    public double getPrice() {
        return Price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Book details" + WishlistID +  UserID + ISBN + Price + Priority + totalPrice  ;
    }
    public static class Builder {
        private int WishlistID;
        private int UserID;
        private int ISBN;
        private double Price;
        private String Priority;
        private double totalPrice;


        public Builder setWishlistID(int wishlistID) {
            this.WishlistID = wishlistID;
            return this;
        }

        public Builder setUserID(int userID) {
            this.UserID = userID;
            return this;
        }

        public Builder setISBN(int ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder setPrice(double price) {
            this.Price = price;
            return this;
        }

        public Builder setPriority(String priority) {
            this.Priority = priority;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;

        }

        public Builder copy(Wishlist e) {
            this.WishlistID = e.WishlistID;
            this.UserID = e.UserID;
            this.ISBN = e.ISBN;
            this.Price = e.Price;
            this.Priority = e.Priority;
            this.totalPrice = e.totalPrice;
            return this;
        }

        public Wishlist build(){return new Wishlist(this);
        }
    }

}
