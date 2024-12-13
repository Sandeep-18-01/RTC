package rtc.modules.employees.models;

import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

// @Table(name="payroll")
public class Payroll {
    
    @Id
    private int accountNumber;
    
    @Name("staffId")
    private int staffId;

    
}
