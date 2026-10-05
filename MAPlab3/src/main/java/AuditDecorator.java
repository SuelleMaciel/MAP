package main.java;

public class AuditDecorator extends QueryExecutorDecorator {
    String usuario;

    public AuditDecorator(QueryExecutor executor, String usuario) {
        super(executor);
        this.usuario = usuario;
    }
    @Override
    public void execute(String sql) {
        System.out.println("[AUDIT] Usuario responsavel: "+ usuario);
        executor.execute(sql);
    }
}
