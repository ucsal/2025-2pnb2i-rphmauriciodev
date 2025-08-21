package br.com.mariojp.solid.isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {
    @Test
    void print_should_not_require_scan() {
        var svc = new OfficeService(new SimplePrinter());
        assertDoesNotThrow(() -> svc.printReport("Relatório"),
                "Após refatoração, não deve chamar scan para imprimir");
    }
}
