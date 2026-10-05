package main.java;

public class Main {
    public static void main(String[] args) {
        QueryExecutor executor =
                new LoggingDecorator(
                        new AuditDecorator(
                                new MetricsDecorator(
                                        new SecurityValidationDecorator(
                                                new BasicQueryExecutor()
                                        )
                                ),
                                "luciana"
                        )
                );

        executor.execute("SELECT * FROM users");
        System.out.println();
        executor.execute("DROP TABLE users; --");
        System.out.println();
        executor.execute("SELECT * FROM users WHERE name = 'admin' OR '1'='1'");
    }
}
