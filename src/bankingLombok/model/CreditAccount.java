package bankingLombok.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount extends Account {
    private String cardNumber;
    private LocalDateTime expiredDate;
    private String secretNumber;

    // The constructor with the accountName is still handled manually
    public CreditAccount(String accountName) {
        super(accountName);  // Initialize the accountName in the superclass
    }
}
