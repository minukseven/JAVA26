package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.MKAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.MKMemberService;

public class MKConsoleBankApp {

	public static void main(String[] args) {
		MemberService ms = new MKMemberService(new MemberListDao());
		AccountService as = new MKAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}
}