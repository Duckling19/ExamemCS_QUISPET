import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {
    private final ContactoRepository contactoRepository;

    @Autowired
    public ContactoService(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public Contacto guardarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public List<Contacto> obtenerTodosLosContactos() {
        return contactoRepository.findAll();
    }

    public Contacto obtenerContactoPorId(Long dni) {
        return contactoRepository.findById(dni).orElse(null);
    }

    public void eliminarContacto(Long dni) {
        contactoRepository.deleteById(dni);
    }
}
