package za.ac.cput.domain;

import java.util.Date;

import java.util.Objects;

public class Transaction {
    private String transactionID;
    private String ISBN;
    private String sellerID;
    private String buyerID;
    private String transactionDate;
    private int quantity;
    private Payment payment;
    private ShippingDetails shippingDetails;
    private String transactionStatus;

    private Transaction() {
    }

    protected Transaction(Builder builder) {
        this.transactionID = builder.transactionID;
        this.ISBN = builder.ISBN;
        this.sellerID = builder.sellerID;
        this.buyerID = builder.buyerID;
        this.transactionDate = builder.transactionDate;
        this.quantity = builder.quantity;
        this.payment = builder.payment;
        this.shippingDetails = builder.shippingDetails;
        this.transactionStatus = builder.transactionStatus;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getSellerID() {
        return sellerID;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public Payment getPayment() {
        return payment;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return quantity == that.quantity &&
                Objects.equals(transactionID, that.transactionID) &&
                Objects.equals(ISBN, that.ISBN) &&
                Objects.equals(sellerID, that.sellerID) &&
                Objects.equals(buyerID, that.buyerID) &&
                Objects.equals(transactionDate, that.transactionDate) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(shippingDetails, that.shippingDetails) &&
                Objects.equals(transactionStatus, that.transactionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, ISBN, sellerID, buyerID, transactionDate, quantity, payment, shippingDetails, transactionStatus);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", sellerID='" + sellerID + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", quantity=" + quantity +
                ", payment=" + payment +
                ", shippingDetails=" + shippingDetails +
                ", transactionStatus='" + transactionStatus + '\'' +
                '}';
    }

    public static class Builder {
        private String transactionID;
        private String ISBN;
        private String sellerID;
        private String buyerID;
        private String transactionDate;
        private int quantity;
        private Payment payment;
        private ShippingDetails shippingDetails;
        private String transactionStatus;

        public Builder setTransactionID(String transactionID) {
            this.transactionID = transactionID;
            return this;
        }

        public Builder setISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder setSellerID(String sellerID) {
            this.sellerID = sellerID;
            return this;
        }

        public Builder setBuyerID(String buyerID) {
            this.buyerID = buyerID;
            return this;
        }

        public Builder setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setPayment(Payment payment) {
            this.payment = payment;
            return this;
        }

        public Builder setShippingDetails(ShippingDetails shippingDetails) {
            this.shippingDetails = shippingDetails;
            return this;
        }

        public Builder setTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    public static class Payment {
        private String paymentMethod;
        private String transactionNumber;

        public Payment() {
        }

        public Payment(String paymentMethod, String transactionNumber) {
            this.paymentMethod = paymentMethod;
            this.transactionNumber = transactionNumber;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getTransactionNumber() {
            return transactionNumber;
        }

        public void setTransactionNumber(String transactionNumber) {
            this.transactionNumber = transactionNumber;
        }

        @Override
        public String toString() {
            return "Payment{" +
                    "paymentMethod='" + paymentMethod + '\'' +
                    ", transactionNumber='" + transactionNumber + '\'' +
                    '}';
        }
    }

    public static class ShippingDetails {
        private String senderName;
        private String senderAddress;
        private String recipientName;
        private String recipientAddress;
        private String contentsDescription;
        private String carrier;

        public ShippingDetails() {
        }

        public ShippingDetails(String senderName, String senderAddress, String recipientName, String recipientAddress, String contentsDescription, String carrier) {
            this.senderName = senderName;
            this.senderAddress = senderAddress;
            this.recipientName = recipientName;
            this.recipientAddress = recipientAddress;
            this.contentsDescription = contentsDescription;
            this.carrier = carrier;
        }

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public String getRecipientName() {
            return recipientName;
        }

        public void setRecipientName(String recipientName) {
            this.recipientName = recipientName;
        }

        public String getRecipientAddress() {
            return recipientAddress;
        }

        public void setRecipientAddress(String recipientAddress) {
            this.recipientAddress = recipientAddress;
        }

        public String getContentsDescription() {
            return contentsDescription;
        }

        public void setContentsDescription(String contentsDescription) {
            this.contentsDescription = contentsDescription;
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        @Override
        public String toString() {
            return "ShippingDetails{" +
                    "senderName='" + senderName + '\'' +
                    ", senderAddress='" + senderAddress + '\'' +
                    ", recipientName='" + recipientName + '\'' +
                    ", recipientAddress='" + recipientAddress + '\'' +
                    ", contentsDescription='" + contentsDescription + '\'' +
                    ", carrier='" + carrier + '\'' +
                    '}';
        }
    }
}
