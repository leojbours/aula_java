package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService
{

    PaymentService paymentService;

    public ContractService( PaymentService paymentService )
    {
        this.paymentService = paymentService;
    }

    public void processContract( Contract contract, int months )
    {
        for ( int i = 1; i <= months; i++ )
        {
            double monthInstallmentValue = paymentService.fee(contract.getTotalValue() / months, i);
            monthInstallmentValue = paymentService.tax( monthInstallmentValue );

            Installment installment = new Installment( monthInstallmentValue, contract.getContractDate().plusMonths(i) );

            contract.getInstallments().add( installment );
        }
    }

}
