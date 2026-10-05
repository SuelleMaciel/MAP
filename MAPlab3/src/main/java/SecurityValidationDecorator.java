package main.java;

public class SecurityValidationDecorator extends QueryExecutorDecorator{
    public SecurityValidationDecorator(QueryExecutor queryExecutor) {
        super(queryExecutor);
    }
    String[] bloqueados = {"DROP", "DELETE", "TRUNCATE", "ALTER", "' OR '1'='1", "--", ";"};

    @Override
    public void execute(String sql) {
        String sqlMaiusculo = sql.toUpperCase();
        for (String bloqueado : bloqueados) {
            if (sqlMaiusculo.contains(bloqueado)) {
                System.out.println("[SECURITY] Query bloqueada por validação de segurança.");
                return;
            }
        } executor.execute(sql);
    }

}
