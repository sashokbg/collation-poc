package com.example.demo;

import an.awesome.pipelinr.Command;
import java.util.ArrayList;
import java.util.List;

public class AddBeneficiariesCommand implements BulkCommand, Command<List<Beneficiary>> {
  public List<Beneficiary> beneficiaries = new ArrayList<>();
}
