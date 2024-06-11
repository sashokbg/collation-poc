package com.example.demo;

import an.awesome.pipelinr.Command;
import org.springframework.stereotype.Component;

@Component
public class CollationMiddleware implements Command.Middleware {
  @Override
  public <R, C extends Command<R>> R invoke(C command, Next<R> next) {
    R response = next.invoke();
    // add collation id if type implements BulkCommand

    if(command instanceof BulkCommand) {
      new TransactionCollation();
      // repo.save()
    }

    // Return collation id 
    return response;
  }
}
