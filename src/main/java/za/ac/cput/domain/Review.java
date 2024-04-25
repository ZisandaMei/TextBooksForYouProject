package za.ac.cput.domain;
import java.util.Date;
import java.util.Objects;

public class Review {

    private String reviewID;
    private double rating;
    private String textReview;
    private String context;
    private Date date;


    private Review(){
    }
    public String getReviewID(){
        return reviewID;
    }

    public String getTextReview(){
        return textReview;
    }

    public String getContext() {
        return context;
    }

    public double getRating() {
        return rating;
    }

    public Date getDate() {
        return date;
    }



    protected Review (Builder builder){
        this.reviewID= builder.reviewID;
        this.rating= builder.rating;
        this.textReview= builder.textReview;
        this.context=builder.context;
        this.date = builder.date;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Double.compare(rating, review.rating) == 0 && Objects.equals(reviewID, review.reviewID) && Objects.equals(textReview, review.textReview) && Objects.equals(context, review.context) && Objects.equals(date, review.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewID, rating, textReview, context, date);
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewID='" + reviewID + '\'' +
                ", rating=" + rating +
                ", textReview='" + textReview + '\'' +
                ", context='" + context + '\'' +
                ", date=" + date +
                '}';
    }
    public static class Builder{
        private String reviewID;
        private Double rating;
        private String textReview;
        private String context;
        private Date date;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;

    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTextReview(String textReview) {
        this.textReview = textReview;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}





