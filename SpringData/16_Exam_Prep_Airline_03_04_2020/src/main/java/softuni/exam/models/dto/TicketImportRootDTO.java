package softuni.exam.models.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "tickets")
@XmlAccessorType(XmlAccessType.FIELD)
public class TicketImportRootDTO {

@XmlElement(name = "ticket")
private List<TicketImportDTO> tickets;


    public List<TicketImportDTO> getTickets() {
        return tickets;
    }
}
