package bank.test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}
	
	public static void testAccountDao() {
		AccountListDao adao = new AccountListDao();
		
		System.out.println(">>> 계좌 추가 및 계좌 목록");
		adao.save(new Account(111111,"1111","leeyuchan",0));
		adao.save(new Account(222222,"1111","yuchan",0));
		List<Account> alist = adao.findAll();
		
		printAccountList(alist);
		System.out.println(">>> 계좌번호로 계좌 찾기");
		Account a = adao.findByNo(111111);
		System.out.println(a);
		
		System.out.println(">>> 사용자 아이디로 계좌 찾기");
		printAccountList(adao.findByMemberId("yuchan"));
		
		System.out.println(">>> 비밀번호 변경");
		a.setPassword("1234");
		adao.update(a);
		
		printAccountList(adao.findAll());
		System.out.println(">>> 잔액변경");
		a.setBalance(1000);
		adao.update(a);
		
		printAccountList(adao.findAll());
		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findByNo(222222));
		printAccountList(adao.findAll());
	}
	
	public static void printAccountList(List<Account> alist) {
		for(Account a : alist) {
			System.out.println(a);
		}
	}
}