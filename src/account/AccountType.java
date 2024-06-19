package account;

public enum AccountType {
    SAVINGS("Savings account"),
    CHECKING("Checking account");

    private String type;

    AccountType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
