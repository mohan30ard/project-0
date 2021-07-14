package com.bank.model;

public class Account extends Customer{
	private String name;
	private long accountNumber;
	private String panCard;
	private String amount;
	private String openingBalance;
	private String closingBalance;
	private boolean status;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String userId,String name, long accountNumber, String panCard, String amount, String openingBalance,
			String closingBalance, boolean status) {
		super(userId);
		this.name = name;
		this.accountNumber = accountNumber;
		this.panCard = panCard;
		this.amount = amount;
		this.openingBalance = openingBalance;
		this.closingBalance = closingBalance;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(String closingBalance) {
		this.closingBalance = closingBalance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNumber=" + accountNumber + ", panCard=" + panCard + ", amount="
				+ amount + ", openingBalance=" + openingBalance + ", closingBalance=" + closingBalance + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((closingBalance == null) ? 0 : closingBalance.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((openingBalance == null) ? 0 : openingBalance.hashCode());
		result = prime * result + ((panCard == null) ? 0 : panCard.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (closingBalance == null) {
			if (other.closingBalance != null)
				return false;
		} else if (!closingBalance.equals(other.closingBalance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (openingBalance == null) {
			if (other.openingBalance != null)
				return false;
		} else if (!openingBalance.equals(other.openingBalance))
			return false;
		if (panCard == null) {
			if (other.panCard != null)
				return false;
		} else if (!panCard.equals(other.panCard))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
}
