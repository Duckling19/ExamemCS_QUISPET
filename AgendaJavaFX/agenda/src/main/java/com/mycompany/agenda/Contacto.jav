import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactos")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dni;

    private String nombre;
    private String apellidos
    private Long codigopostal;
    private Long cumpleaños;
    private String dirección;
    private String Ciudad;
}
