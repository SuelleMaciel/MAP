package main.java;

public class LoggingDecorator extends QueryExecutorDecorator {
    public LoggingDecorator(QueryExecutor executor) {
        super(executor);
    }
    @Override
    public void execute(String sql){
        System.out.println("[LOG] Tentando executar: "+ sql);
        executor.execute(sql);
    }

}
