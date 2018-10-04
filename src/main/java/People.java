import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class People {


    @JacksonXmlElementWrapper(useWrapping = false)
    List<Person> peopleToXml;

    public People() {
    }

    public People(List<Person> peopleToXml) {
        this.peopleToXml = peopleToXml;
    }

    public List<Person> getPeopleToXml() {
        return peopleToXml;
    }

    public void setPeopleToXml(List<Person> peopleToXml) {
        this.peopleToXml = peopleToXml;
    }
}
