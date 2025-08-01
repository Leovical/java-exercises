package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		//test
		contract.getInstallments().add(new Installment(LocalDate.of(2025, 8, 01), 206.04));
		contract.getInstallments().add(new Installment(LocalDate.of(2025, 9, 01), 208.08));
	}
	
}
