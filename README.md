# ISP — Dispositivos (testes falham inicialmente)

`OfficeService.printReport()` chama `scan()` desnecessariamente. `SimplePrinter` não suporta e lança `UnsupportedOperationException`.  
O teste espera **não** lançar. Inicialmente, falha.

## Tarefa
- Segregar interfaces (`Printer`, `Scanner`) e garantir que `printReport` use **apenas** `Printer`.

## Rodar
```bash
mvn -q test
```
