package com.example.demo;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BeneficiaryHandler implements Command.Handler<AddBeneficiariesCommand, List<TransactionInstance>> {
  @Override
  public List<TransactionInstance> handle(AddBeneficiariesCommand command) {
    command.beneficiaries.forEach((benef) -> System.out.println("NEW TRANSACTION"));
    return null;
  }
}
