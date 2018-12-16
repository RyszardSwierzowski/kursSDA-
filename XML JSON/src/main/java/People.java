import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement // !!!!!!!!!!!!!!! ROOT XML // tylko dla xml
public class People
{
    @JacksonXmlElementWrapper(useWrapping = false)// !!!!!!!!!! nie dupikuj w xml // tylko dla xml
    @JacksonXmlProperty(localName = "person") //     !!!!!!!!!! zmiana z listOfPerson -> person // tylko dla xml
    private List<Person> listOfPerson;

    public People(List<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    public People() {
    }

    public List<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(List<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    @Override
    public String toString() {
        return "People{" +
                "listOfPerson=" + listOfPerson +
                '}';
    }
}
