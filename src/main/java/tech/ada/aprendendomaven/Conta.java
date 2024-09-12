package tech.ada.aprendendomaven;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conta {
    private BigDecimal saldo;
    private int numero;
    private int agencia;
}