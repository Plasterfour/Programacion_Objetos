/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_3;

/**
 *
 * @author Francisco Gallegos
 */
public class BankAccount {

 private Integer accountNumber;
 private Integer accountBalance;
 private String name;
 
 public BankAccount(Integer accountNumber,Integer accountBalance,String name){
     this.accountBalance=accountBalance;
     this.accountNumber=accountNumber;
     this.name=name;
 }
  public Integer deductMonthlyFee(){
      return getAccountBalance()-4;
  }
  
  public String explainAccountPolicy(){
      return String.format("La tarifa de servicio de $4 se deducirá cada mes");
  }

    /**
     * @return the accountNumber
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the accountBalance
     */
    public Integer getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
  
}
