package za.ac.cput.domain;

import java.util.Objects;

public class Payment {
    private String PaymentID;
    private String TransactionID;
    private String PaymentMethod;
    private String PaymentDate;
    private int Amount;
    private String Status;
    private String PaymentConfirmationNumber;
    private String Address;
    private String PaymentGateway;

    private Payment(){
    }
    private Payment (Payment builder) {
        this.PaymentID = builder.PaymentID;
        this.TransactionID = builder.TransactionID;
        this.PaymentMethod = builder.PaymentMethod;
        this.PaymentDate = builder.PaymentDate;
        this.Amount = builder.Amount;
        this.Status = builder.Status;
        this.PaymentConfirmationNumber = builder.Status;
        this.Address = builder.Address;
        this.PaymentGateway = builder.PaymentGateway;

    }
    public String getPaymentID() {
        return PaymentID;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public int getAmount() {
        return Amount;
    }

    public String getStatus() {
        return Status;
    }
    public String getPaymentConfirmationNumber() {
        return PaymentConfirmationNumber;
    }
    public String getAddress() {
        return Address;
    }
    public String getPaymentGateway(){return PaymentGateway;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return getAmount() == payment.getAmount() && Objects.equals(getPaymentID(), payment.getPaymentID()) && Objects.equals(getTransactionID(), payment.getTransactionID()) && Objects.equals(getPaymentMethod(), payment.getPaymentMethod()) && Objects.equals(getPaymentDate(), payment.getPaymentDate()) && Objects.equals(getStatus(), payment.getStatus()) && Objects.equals(getPaymentConfirmationNumber(), payment.getPaymentConfirmationNumber()) && Objects.equals(getAddress(), payment.getAddress()) && Objects.equals(getPaymentGateway(), payment.getPaymentGateway());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaymentID(), getTransactionID(), getPaymentMethod(), getPaymentDate(), getAmount(), getStatus(), getPaymentConfirmationNumber(), getAddress(), getPaymentGateway());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "PaymentID='" + PaymentID + '\'' +
                ", TransactionID='" + TransactionID + '\'' +
                ", PaymentMethod='" + PaymentMethod + '\'' +
                ", PaymentDate='" + PaymentDate + '\'' +
                ", Amount=" + Amount +
                ", Status='" + Status + '\'' +
                ", PaymentConfirmationNumber='" + PaymentConfirmationNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", PaymentGateway='" + PaymentGateway + '\'' +
                '}';
    }
    public static class Builder {
        private String PaymentID;
        private String TransactionID;
        private String PaymentMethod;
        private String PaymentDate;
        private int Amount;
        private String Status;
        private String PaymentConfirmationNumber;
        private String Address;
        private String PaymentGateway;

    }

    public void setPaymentID(java.lang.String paymentID) {
        PaymentID = paymentID;

    }

    public void setTransactionID(java.lang.String transactionID) {
        TransactionID = transactionID;
    }


    public void setPaymentMethod(java.lang.String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public void setPaymentDate(java.lang.String paymentDate) {
        PaymentDate = paymentDate;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public void setStatus(java.lang.String status) {
        Status = status;
    }

    public void setPaymentConfirmationNumber(java.lang.String paymentConfirmationNumber) {
        PaymentConfirmationNumber = paymentConfirmationNumber;
    }

    public void setAddress(java.lang.String address) {
        Address = address;
    }

    public void setPaymentGateway(java.lang.String paymentGateway) {
        PaymentGateway = paymentGateway;
    }

    public Builder copy(Payment p) {
        this.PaymentID= p.PaymentID;
        this.TransactionID= p.TransactionID;
        this.PaymentMethod= p.PaymentMethod;
        this.PaymentDate= p.PaymentDate;
        this.Amount= p.Amount;
        this. Status= p. Status;
        this.PaymentConfirmationNumber= p.PaymentConfirmationNumber;
        this.Address= p.Address;
        this.PaymentGateway= p.PaymentGateway;
        return this;

    }


    public Payment build(){
        return new Payment(this);
    }
}
