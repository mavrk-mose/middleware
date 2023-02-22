package io.credable.middleware.data.model;

import java.util.Date;

public class Model {
    //customer model
    private String accountNumber;
    private double alternativechanneltrnscrAmount;
    private int alternativechanneltrnscrNumber;
    private double alternativechanneltrnsdebitAmount;
    private int alternativechanneltrnsdebitNumber;
    private int atmTransactionsNumber;
    private double atmtransactionsAmount;
    private int bouncedChequesDebitNumber;
    private int bouncedchequescreditNumber;
    private double bouncedchequetransactionscrAmount;
    private double bouncedchequetransactionsdrAmount;
    private double chequeDebitTransactionsAmount;
    private int chequeDebitTransactionsNumber;
    private Date createdAt;
    private Date createdDate;
    private double credittransactionsAmount;
    private double debitcardpostransactionsAmount;
    private int debitcardpostransactionsNumber;
    private double fincominglocaltransactioncrAmount;
    private Long id;
    private double incominginternationaltrncrAmount;
    private int incominginternationaltrncrNumber;
    private int incominglocaltransactioncrNumber;
    private Integer intrestAmount;
    private Date lastTransactionDate;
    private String lastTransactionType;
    private Integer lastTransactionValue;
    private double maxAtmTransactions;
    private double maxMonthlyBebitTransactions;
    private double maxalternativechanneltrnscr;
    private double maxalternativechanneltrnsdebit;
    private double maxbouncedchequetransactionscr;
    private double maxchequedebittransactions;
    private double maxdebitcardpostransactions;
    private double maxincominginternationaltrncr;
    private double maxincominglocaltransactioncr;
    private double maxmobilemoneycredittrn;
    private double maxmobilemoneydebittransaction;
    private double maxmonthlycredittransactions;
    private double maxoutgoinginttrndebit;
    private double maxoutgoinglocaltrndebit;
    private double maxoverthecounterwithdrawals;
    private double minAtmTransactions;
    private double minMonthlyDebitTransactions;
    private double minalternativechanneltrnscr;
    private double minalternativechanneltrnsdebit;
    private double minbouncedchequetransactionscr;
    private double minchequedebittransactions;
    private double mindebitcardpostransactions;
    private double minincominginternationaltrncr;
    private double minincominglocaltransactioncr;
    private double minmobilemoneycredittrn;
    private double minmobilemoneydebittransaction;
    private double minmonthlycredittransactions;
    private double minoutgoinginttrndebit;
    private double minoutgoinglocaltrndebit;
    private double minoverthecounterwithdrawals;
    private double mobilemoneycredittransactionAmount;
    private int mobilemoneycredittransactionNumber;
    private double mobilemoneydebittransactionAmount;
    private int mobilemoneydebittransactionNumber;
    private double monthlyBalance;
    private double monthlydebittransactionsAmount;
    private double outgoinginttransactiondebitAmount;
    private int outgoinginttrndebitNumber;
    private double outgoinglocaltransactiondebitAmount;
    private int outgoinglocaltransactiondebitNumber;
    private double overdraftLimit;
    private double overthecounterwithdrawalsAmount;
    private int overthecounterwithdrawalsNumber;
    private double transactionValue;
    private Date updatedAt;

    
    //getters and setters 
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAlternativechanneltrnscrAmount() {
        return alternativechanneltrnscrAmount;
    }
    public void setAlternativechanneltrnscrAmount(double alternativechanneltrnscrAmount) {
        this.alternativechanneltrnscrAmount = alternativechanneltrnscrAmount;
    }
    public int getAlternativechanneltrnscrNumber() {
        return alternativechanneltrnscrNumber;
    }
    public void setAlternativechanneltrnscrNumber(int alternativechanneltrnscrNumber) {
        this.alternativechanneltrnscrNumber = alternativechanneltrnscrNumber;
    }
    public double getAlternativechanneltrnsdebitAmount() {
        return alternativechanneltrnsdebitAmount;
    }
    public void setAlternativechanneltrnsdebitAmount(double alternativechanneltrnsdebitAmount) {
        this.alternativechanneltrnsdebitAmount = alternativechanneltrnsdebitAmount;
    }
    public int getAlternativechanneltrnsdebitNumber() {
        return alternativechanneltrnsdebitNumber;
    }
    public void setAlternativechanneltrnsdebitNumber(int alternativechanneltrnsdebitNumber) {
        this.alternativechanneltrnsdebitNumber = alternativechanneltrnsdebitNumber;
    }
    public int getAtmTransactionsNumber() {
        return atmTransactionsNumber;
    }
    public void setAtmTransactionsNumber(int atmTransactionsNumber) {
        this.atmTransactionsNumber = atmTransactionsNumber;
    }
    public double getAtmtransactionsAmount() {
        return atmtransactionsAmount;
    }
    public void setAtmtransactionsAmount(double atmtransactionsAmount) {
        this.atmtransactionsAmount = atmtransactionsAmount;
    }
    public int getBouncedChequesDebitNumber() {
        return bouncedChequesDebitNumber;
    }
    public void setBouncedChequesDebitNumber(int bouncedChequesDebitNumber) {
        this.bouncedChequesDebitNumber = bouncedChequesDebitNumber;
    }
    public int getBouncedchequescreditNumber() {
        return bouncedchequescreditNumber;
    }
    public void setBouncedchequescreditNumber(int bouncedchequescreditNumber) {
        this.bouncedchequescreditNumber = bouncedchequescreditNumber;
    }
    public double getBouncedchequetransactionscrAmount() {
        return bouncedchequetransactionscrAmount;
    }
    public void setBouncedchequetransactionscrAmount(double bouncedchequetransactionscrAmount) {
        this.bouncedchequetransactionscrAmount = bouncedchequetransactionscrAmount;
    }
    public double getBouncedchequetransactionsdrAmount() {
        return bouncedchequetransactionsdrAmount;
    }
    public void setBouncedchequetransactionsdrAmount(double bouncedchequetransactionsdrAmount) {
        this.bouncedchequetransactionsdrAmount = bouncedchequetransactionsdrAmount;
    }
    public double getChequeDebitTransactionsAmount() {
        return chequeDebitTransactionsAmount;
    }
    public void setChequeDebitTransactionsAmount(double chequeDebitTransactionsAmount) {
        this.chequeDebitTransactionsAmount = chequeDebitTransactionsAmount;
    }
    public int getChequeDebitTransactionsNumber() {
        return chequeDebitTransactionsNumber;
    }
    public void setChequeDebitTransactionsNumber(int chequeDebitTransactionsNumber) {
        this.chequeDebitTransactionsNumber = chequeDebitTransactionsNumber;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public double getCredittransactionsAmount() {
        return credittransactionsAmount;
    }
    public void setCredittransactionsAmount(double credittransactionsAmount) {
        this.credittransactionsAmount = credittransactionsAmount;
    }
    public double getDebitcardpostransactionsAmount() {
        return debitcardpostransactionsAmount;
    }
    public void setDebitcardpostransactionsAmount(double debitcardpostransactionsAmount) {
        this.debitcardpostransactionsAmount = debitcardpostransactionsAmount;
    }
    public int getDebitcardpostransactionsNumber() {
        return debitcardpostransactionsNumber;
    }
    public void setDebitcardpostransactionsNumber(int debitcardpostransactionsNumber) {
        this.debitcardpostransactionsNumber = debitcardpostransactionsNumber;
    }
    public double getFincominglocaltransactioncrAmount() {
        return fincominglocaltransactioncrAmount;
    }
    public void setFincominglocaltransactioncrAmount(double fincominglocaltransactioncrAmount) {
        this.fincominglocaltransactioncrAmount = fincominglocaltransactioncrAmount;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getIncominginternationaltrncrAmount() {
        return incominginternationaltrncrAmount;
    }
    public void setIncominginternationaltrncrAmount(double incominginternationaltrncrAmount) {
        this.incominginternationaltrncrAmount = incominginternationaltrncrAmount;
    }
    public int getIncominginternationaltrncrNumber() {
        return incominginternationaltrncrNumber;
    }
    public void setIncominginternationaltrncrNumber(int incominginternationaltrncrNumber) {
        this.incominginternationaltrncrNumber = incominginternationaltrncrNumber;
    }
    public int getIncominglocaltransactioncrNumber() {
        return incominglocaltransactioncrNumber;
    }
    public void setIncominglocaltransactioncrNumber(int incominglocaltransactioncrNumber) {
        this.incominglocaltransactioncrNumber = incominglocaltransactioncrNumber;
    }
    public Integer getIntrestAmount() {
        return intrestAmount;
    }
    public void setIntrestAmount(Integer intrestAmount) {
        this.intrestAmount = intrestAmount;
    }
    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }
    public void setLastTransactionDate(Date lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }
    public String getLastTransactionType() {
        return lastTransactionType;
    }
    public void setLastTransactionType(String lastTransactionType) {
        this.lastTransactionType = lastTransactionType;
    }
    public Integer getLastTransactionValue() {
        return lastTransactionValue;
    }
    public void setLastTransactionValue(Integer lastTransactionValue) {
        this.lastTransactionValue = lastTransactionValue;
    }
    public double getMaxAtmTransactions() {
        return maxAtmTransactions;
    }
    public void setMaxAtmTransactions(double maxAtmTransactions) {
        this.maxAtmTransactions = maxAtmTransactions;
    }
    public double getMaxMonthlyBebitTransactions() {
        return maxMonthlyBebitTransactions;
    }
    public void setMaxMonthlyBebitTransactions(double maxMonthlyBebitTransactions) {
        this.maxMonthlyBebitTransactions = maxMonthlyBebitTransactions;
    }
    public double getMaxalternativechanneltrnscr() {
        return maxalternativechanneltrnscr;
    }
    public void setMaxalternativechanneltrnscr(double maxalternativechanneltrnscr) {
        this.maxalternativechanneltrnscr = maxalternativechanneltrnscr;
    }
    public double getMaxalternativechanneltrnsdebit() {
        return maxalternativechanneltrnsdebit;
    }
    public void setMaxalternativechanneltrnsdebit(double maxalternativechanneltrnsdebit) {
        this.maxalternativechanneltrnsdebit = maxalternativechanneltrnsdebit;
    }
    public double getMaxbouncedchequetransactionscr() {
        return maxbouncedchequetransactionscr;
    }
    public void setMaxbouncedchequetransactionscr(double maxbouncedchequetransactionscr) {
        this.maxbouncedchequetransactionscr = maxbouncedchequetransactionscr;
    }
    public double getMaxchequedebittransactions() {
        return maxchequedebittransactions;
    }
    public void setMaxchequedebittransactions(double maxchequedebittransactions) {
        this.maxchequedebittransactions = maxchequedebittransactions;
    }
    public double getMaxdebitcardpostransactions() {
        return maxdebitcardpostransactions;
    }
    public void setMaxdebitcardpostransactions(double maxdebitcardpostransactions) {
        this.maxdebitcardpostransactions = maxdebitcardpostransactions;
    }
    public double getMaxincominginternationaltrncr() {
        return maxincominginternationaltrncr;
    }
    public void setMaxincominginternationaltrncr(double maxincominginternationaltrncr) {
        this.maxincominginternationaltrncr = maxincominginternationaltrncr;
    }
    public double getMaxincominglocaltransactioncr() {
        return maxincominglocaltransactioncr;
    }
    public void setMaxincominglocaltransactioncr(double maxincominglocaltransactioncr) {
        this.maxincominglocaltransactioncr = maxincominglocaltransactioncr;
    }
    public double getMaxmobilemoneycredittrn() {
        return maxmobilemoneycredittrn;
    }
    public void setMaxmobilemoneycredittrn(double maxmobilemoneycredittrn) {
        this.maxmobilemoneycredittrn = maxmobilemoneycredittrn;
    }
    public double getMaxmobilemoneydebittransaction() {
        return maxmobilemoneydebittransaction;
    }
    public void setMaxmobilemoneydebittransaction(double maxmobilemoneydebittransaction) {
        this.maxmobilemoneydebittransaction = maxmobilemoneydebittransaction;
    }
    public double getMaxmonthlycredittransactions() {
        return maxmonthlycredittransactions;
    }
    public void setMaxmonthlycredittransactions(double maxmonthlycredittransactions) {
        this.maxmonthlycredittransactions = maxmonthlycredittransactions;
    }
    public double getMaxoutgoinginttrndebit() {
        return maxoutgoinginttrndebit;
    }
    public void setMaxoutgoinginttrndebit(double maxoutgoinginttrndebit) {
        this.maxoutgoinginttrndebit = maxoutgoinginttrndebit;
    }
    public double getMaxoutgoinglocaltrndebit() {
        return maxoutgoinglocaltrndebit;
    }
    public void setMaxoutgoinglocaltrndebit(double maxoutgoinglocaltrndebit) {
        this.maxoutgoinglocaltrndebit = maxoutgoinglocaltrndebit;
    }
    public double getMaxoverthecounterwithdrawals() {
        return maxoverthecounterwithdrawals;
    }
    public void setMaxoverthecounterwithdrawals(double maxoverthecounterwithdrawals) {
        this.maxoverthecounterwithdrawals = maxoverthecounterwithdrawals;
    }
    public double getMinAtmTransactions() {
        return minAtmTransactions;
    }
    public void setMinAtmTransactions(double minAtmTransactions) {
        this.minAtmTransactions = minAtmTransactions;
    }
    public double getMinMonthlyDebitTransactions() {
        return minMonthlyDebitTransactions;
    }
    public void setMinMonthlyDebitTransactions(double minMonthlyDebitTransactions) {
        this.minMonthlyDebitTransactions = minMonthlyDebitTransactions;
    }
    public double getMinalternativechanneltrnscr() {
        return minalternativechanneltrnscr;
    }
    public void setMinalternativechanneltrnscr(double minalternativechanneltrnscr) {
        this.minalternativechanneltrnscr = minalternativechanneltrnscr;
    }
    public double getMinalternativechanneltrnsdebit() {
        return minalternativechanneltrnsdebit;
    }
    public void setMinalternativechanneltrnsdebit(double minalternativechanneltrnsdebit) {
        this.minalternativechanneltrnsdebit = minalternativechanneltrnsdebit;
    }
    public double getMinbouncedchequetransactionscr() {
        return minbouncedchequetransactionscr;
    }
    public void setMinbouncedchequetransactionscr(double minbouncedchequetransactionscr) {
        this.minbouncedchequetransactionscr = minbouncedchequetransactionscr;
    }
    public double getMinchequedebittransactions() {
        return minchequedebittransactions;
    }
    public void setMinchequedebittransactions(double minchequedebittransactions) {
        this.minchequedebittransactions = minchequedebittransactions;
    }
    public double getMindebitcardpostransactions() {
        return mindebitcardpostransactions;
    }
    public void setMindebitcardpostransactions(double mindebitcardpostransactions) {
        this.mindebitcardpostransactions = mindebitcardpostransactions;
    }
    public double getMinincominginternationaltrncr() {
        return minincominginternationaltrncr;
    }
    public void setMinincominginternationaltrncr(double minincominginternationaltrncr) {
        this.minincominginternationaltrncr = minincominginternationaltrncr;
    }
    public double getMinincominglocaltransactioncr() {
        return minincominglocaltransactioncr;
    }
    public void setMinincominglocaltransactioncr(double minincominglocaltransactioncr) {
        this.minincominglocaltransactioncr = minincominglocaltransactioncr;
    }
    public double getMinmobilemoneycredittrn() {
        return minmobilemoneycredittrn;
    }
    public void setMinmobilemoneycredittrn(double minmobilemoneycredittrn) {
        this.minmobilemoneycredittrn = minmobilemoneycredittrn;
    }
    public double getMinmobilemoneydebittransaction() {
        return minmobilemoneydebittransaction;
    }
    public void setMinmobilemoneydebittransaction(double minmobilemoneydebittransaction) {
        this.minmobilemoneydebittransaction = minmobilemoneydebittransaction;
    }
    public double getMinmonthlycredittransactions() {
        return minmonthlycredittransactions;
    }
    public void setMinmonthlycredittransactions(double minmonthlycredittransactions) {
        this.minmonthlycredittransactions = minmonthlycredittransactions;
    }
    public double getMinoutgoinginttrndebit() {
        return minoutgoinginttrndebit;
    }
    public void setMinoutgoinginttrndebit(double minoutgoinginttrndebit) {
        this.minoutgoinginttrndebit = minoutgoinginttrndebit;
    }
    public double getMinoutgoinglocaltrndebit() {
        return minoutgoinglocaltrndebit;
    }
    public void setMinoutgoinglocaltrndebit(double minoutgoinglocaltrndebit) {
        this.minoutgoinglocaltrndebit = minoutgoinglocaltrndebit;
    }
    public double getMinoverthecounterwithdrawals() {
        return minoverthecounterwithdrawals;
    }
    public void setMinoverthecounterwithdrawals(double minoverthecounterwithdrawals) {
        this.minoverthecounterwithdrawals = minoverthecounterwithdrawals;
    }
    public double getMobilemoneycredittransactionAmount() {
        return mobilemoneycredittransactionAmount;
    }
    public void setMobilemoneycredittransactionAmount(double mobilemoneycredittransactionAmount) {
        this.mobilemoneycredittransactionAmount = mobilemoneycredittransactionAmount;
    }
    public int getMobilemoneycredittransactionNumber() {
        return mobilemoneycredittransactionNumber;
    }
    public void setMobilemoneycredittransactionNumber(int mobilemoneycredittransactionNumber) {
        this.mobilemoneycredittransactionNumber = mobilemoneycredittransactionNumber;
    }
    public double getMobilemoneydebittransactionAmount() {
        return mobilemoneydebittransactionAmount;
    }
    public void setMobilemoneydebittransactionAmount(double mobilemoneydebittransactionAmount) {
        this.mobilemoneydebittransactionAmount = mobilemoneydebittransactionAmount;
    }
    public int getMobilemoneydebittransactionNumber() {
        return mobilemoneydebittransactionNumber;
    }
    public void setMobilemoneydebittransactionNumber(int mobilemoneydebittransactionNumber) {
        this.mobilemoneydebittransactionNumber = mobilemoneydebittransactionNumber;
    }
    public double getMonthlyBalance() {
        return monthlyBalance;
    }
    public void setMonthlyBalance(double monthlyBalance) {
        this.monthlyBalance = monthlyBalance;
    }
    public double getMonthlydebittransactionsAmount() {
        return monthlydebittransactionsAmount;
    }
    public void setMonthlydebittransactionsAmount(double monthlydebittransactionsAmount) {
        this.monthlydebittransactionsAmount = monthlydebittransactionsAmount;
    }
    public double getOutgoinginttransactiondebitAmount() {
        return outgoinginttransactiondebitAmount;
    }
    public void setOutgoinginttransactiondebitAmount(double outgoinginttransactiondebitAmount) {
        this.outgoinginttransactiondebitAmount = outgoinginttransactiondebitAmount;
    }
    public int getOutgoinginttrndebitNumber() {
        return outgoinginttrndebitNumber;
    }
    public void setOutgoinginttrndebitNumber(int outgoinginttrndebitNumber) {
        this.outgoinginttrndebitNumber = outgoinginttrndebitNumber;
    }
    public double getOutgoinglocaltransactiondebitAmount() {
        return outgoinglocaltransactiondebitAmount;
    }
    public void setOutgoinglocaltransactiondebitAmount(double outgoinglocaltransactiondebitAmount) {
        this.outgoinglocaltransactiondebitAmount = outgoinglocaltransactiondebitAmount;
    }
    public int getOutgoinglocaltransactiondebitNumber() {
        return outgoinglocaltransactiondebitNumber;
    }
    public void setOutgoinglocaltransactiondebitNumber(int outgoinglocaltransactiondebitNumber) {
        this.outgoinglocaltransactiondebitNumber = outgoinglocaltransactiondebitNumber;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverthecounterwithdrawalsAmount() {
        return overthecounterwithdrawalsAmount;
    }
    public void setOverthecounterwithdrawalsAmount(double overthecounterwithdrawalsAmount) {
        this.overthecounterwithdrawalsAmount = overthecounterwithdrawalsAmount;
    }
    public int getOverthecounterwithdrawalsNumber() {
        return overthecounterwithdrawalsNumber;
    }
    public void setOverthecounterwithdrawalsNumber(int overthecounterwithdrawalsNumber) {
        this.overthecounterwithdrawalsNumber = overthecounterwithdrawalsNumber;
    }
    public double getTransactionValue() {
        return transactionValue;
    }
    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //constructors
    public Model(String accountNumber, double alternativechanneltrnscrAmount,
            int alternativechanneltrnscrNumber, double alternativechanneltrnsdebitAmount,
            int alternativechanneltrnsdebitNumber, int atmTransactionsNumber, double atmtransactionsAmount,
            int bouncedChequesDebitNumber, int bouncedchequescreditNumber, double bouncedchequetransactionscrAmount,
            double bouncedchequetransactionsdrAmount, double chequeDebitTransactionsAmount,
            int chequeDebitTransactionsNumber, Date createdAt, Date createdDate, double credittransactionsAmount,
            double debitcardpostransactionsAmount, int debitcardpostransactionsNumber,
            double fincominglocaltransactioncrAmount, Long id2, double incominginternationaltrncrAmount,
            int incominginternationaltrncrNumber, int incominglocaltransactioncrNumber, Integer intrestAmount,
            Date lastTransactionDate, String lastTransactionType, Integer lastTransactionValue,
            double maxAtmTransactions, double maxMonthlyBebitTransactions, double maxalternativechanneltrnscr,
            double maxalternativechanneltrnsdebit, double maxbouncedchequetransactionscr,
            double maxchequedebittransactions, double maxdebitcardpostransactions, double maxincominginternationaltrncr,
            double maxincominglocaltransactioncr, double maxmobilemoneycredittrn, double maxmobilemoneydebittransaction,
            double maxmonthlycredittransactions, double maxoutgoinginttrndebit, double maxoutgoinglocaltrndebit,
            double maxoverthecounterwithdrawals, double minAtmTransactions, double minMonthlyDebitTransactions,
            double minalternativechanneltrnscr, double minalternativechanneltrnsdebit,
            double minbouncedchequetransactionscr, double minchequedebittransactions,
            double mindebitcardpostransactions, double minincominginternationaltrncr,
            double minincominglocaltransactioncr, double minmobilemoneycredittrn, double minmobilemoneydebittransaction,
            double minmonthlycredittransactions, double minoutgoinginttrndebit, double minoutgoinglocaltrndebit,
            double minoverthecounterwithdrawals, double mobilemoneycredittransactionAmount,
            int mobilemoneycredittransactionNumber, double mobilemoneydebittransactionAmount,
            int mobilemoneydebittransactionNumber, double monthlyBalance, double monthlydebittransactionsAmount,
            double outgoinginttransactiondebitAmount, int outgoinginttrndebitNumber,
            double outgoinglocaltransactiondebitAmount, int outgoinglocaltransactiondebitNumber, double overdraftLimit,
            double overthecounterwithdrawalsAmount, int overthecounterwithdrawalsNumber, double transactionValue,
            Date updatedAt) {
        this.accountNumber = accountNumber;
        this.alternativechanneltrnscrAmount = alternativechanneltrnscrAmount;
        this.alternativechanneltrnscrNumber = alternativechanneltrnscrNumber;
        this.alternativechanneltrnsdebitAmount = alternativechanneltrnsdebitAmount;
        this.alternativechanneltrnsdebitNumber = alternativechanneltrnsdebitNumber;
        this.atmTransactionsNumber = atmTransactionsNumber;
        this.atmtransactionsAmount = atmtransactionsAmount;
        this.bouncedChequesDebitNumber = bouncedChequesDebitNumber;
        this.bouncedchequescreditNumber = bouncedchequescreditNumber;
        this.bouncedchequetransactionscrAmount = bouncedchequetransactionscrAmount;
        this.bouncedchequetransactionsdrAmount = bouncedchequetransactionsdrAmount;
        this.chequeDebitTransactionsAmount = chequeDebitTransactionsAmount;
        this.chequeDebitTransactionsNumber = chequeDebitTransactionsNumber;
        this.createdAt = createdAt;
        this.createdDate = createdDate;
        this.credittransactionsAmount = credittransactionsAmount;
        this.debitcardpostransactionsAmount = debitcardpostransactionsAmount;
        this.debitcardpostransactionsNumber = debitcardpostransactionsNumber;
        this.fincominglocaltransactioncrAmount = fincominglocaltransactioncrAmount;
        this.incominginternationaltrncrAmount = incominginternationaltrncrAmount;
        this.incominginternationaltrncrNumber = incominginternationaltrncrNumber;
        this.incominglocaltransactioncrNumber = incominglocaltransactioncrNumber;
        this.intrestAmount = intrestAmount;
        this.lastTransactionDate = lastTransactionDate;
        this.lastTransactionType = lastTransactionType;
        this.lastTransactionValue = lastTransactionValue;
        this.maxAtmTransactions = maxAtmTransactions;
        this.maxMonthlyBebitTransactions = maxMonthlyBebitTransactions;
        this.maxalternativechanneltrnscr = maxalternativechanneltrnscr;
        this.maxalternativechanneltrnsdebit = maxalternativechanneltrnsdebit;
        this.maxbouncedchequetransactionscr = maxbouncedchequetransactionscr;
        this.maxchequedebittransactions = maxchequedebittransactions;
        this.maxdebitcardpostransactions = maxdebitcardpostransactions;
        this.maxincominginternationaltrncr = maxincominginternationaltrncr;
        this.maxincominglocaltransactioncr = maxincominglocaltransactioncr;
        this.maxmobilemoneycredittrn = maxmobilemoneycredittrn;
        this.maxmobilemoneydebittransaction = maxmobilemoneydebittransaction;
        this.maxmonthlycredittransactions = maxmonthlycredittransactions;
        this.maxoutgoinginttrndebit = maxoutgoinginttrndebit;
        this.maxoutgoinglocaltrndebit = maxoutgoinglocaltrndebit;
        this.maxoverthecounterwithdrawals = maxoverthecounterwithdrawals;
        this.minAtmTransactions = minAtmTransactions;
        this.minMonthlyDebitTransactions = minMonthlyDebitTransactions;
        this.minalternativechanneltrnscr = minalternativechanneltrnscr;
        this.minalternativechanneltrnsdebit = minalternativechanneltrnsdebit;
        this.minbouncedchequetransactionscr = minbouncedchequetransactionscr;
        this.minchequedebittransactions = minchequedebittransactions;
        this.mindebitcardpostransactions = mindebitcardpostransactions;
        this.minincominginternationaltrncr = minincominginternationaltrncr;
        this.minincominglocaltransactioncr = minincominglocaltransactioncr;
        this.minmobilemoneycredittrn = minmobilemoneycredittrn;
        this.minmobilemoneydebittransaction = minmobilemoneydebittransaction;
        this.minmonthlycredittransactions = minmonthlycredittransactions;
        this.minoutgoinginttrndebit = minoutgoinginttrndebit;
        this.minoutgoinglocaltrndebit = minoutgoinglocaltrndebit;
        this.minoverthecounterwithdrawals = minoverthecounterwithdrawals;
        this.mobilemoneycredittransactionAmount = mobilemoneycredittransactionAmount;
        this.mobilemoneycredittransactionNumber = mobilemoneycredittransactionNumber;
        this.mobilemoneydebittransactionAmount = mobilemoneydebittransactionAmount;
        this.mobilemoneydebittransactionNumber = mobilemoneydebittransactionNumber;
        this.monthlyBalance = monthlyBalance;
        this.monthlydebittransactionsAmount = monthlydebittransactionsAmount;
        this.outgoinginttransactiondebitAmount = outgoinginttransactiondebitAmount;
        this.outgoinginttrndebitNumber = outgoinginttrndebitNumber;
        this.outgoinglocaltransactiondebitAmount = outgoinglocaltransactiondebitAmount;
        this.outgoinglocaltransactiondebitNumber = outgoinglocaltransactiondebitNumber;
        this.overdraftLimit = overdraftLimit;
        this.overthecounterwithdrawalsAmount = overthecounterwithdrawalsAmount;
        this.overthecounterwithdrawalsNumber = overthecounterwithdrawalsNumber;
        this.transactionValue = transactionValue;
        this.updatedAt = updatedAt;
    }
}
