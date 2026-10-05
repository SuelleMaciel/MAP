package main.java;

public abstract class QueryExecutorDecorator implements QueryExecutor {
     QueryExecutor executor;

     QueryExecutorDecorator(QueryExecutor executor) {
         this.executor = executor;
     }
    @Override
    public void execute(String sql) {
         executor.execute(sql);
    }
}
