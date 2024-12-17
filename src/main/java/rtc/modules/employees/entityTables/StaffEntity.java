package rtc.modules.employees.entityTables;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import rtc.common.enums.StaffRoles;
@Entity
@Table(name = "staff")
@Data // Combines @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
@NoArgsConstructor  // Lombok will generate a no-argument constructor
@AllArgsConstructor // Lombok will generate a constructor with all fields

public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "staff_number", unique = true, nullable = false)
    private String staffNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private StaffRoles role;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "contact_number")
    private String contactNumber;

   
}

