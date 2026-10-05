package main.java;

public class MetricsDecorator extends QueryExecutorDecorator {
    public MetricsDecorator(QueryExecutor executor) {
        super(executor);
    }
    @Override
    public void execute(String sql) {
        long inicio = System.currentTimeMillis();
        executor.execute(sql);
        long fim = System.currentTimeMillis();
        System.out.println("[METRICS] Tempo de execução: " + (fim - inicio) + "ms");
    }
}
