package com.fixdecode;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Student student = new Student (1, "Shantanu",  "shantanu@gmail.com" , 557958.79);
        convertToXml(student);
    }
    public static void convertToXml(Student student) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(student, stringWriter);
        String xmlContent = stringWriter.toString();
        System.out.println(xmlContent);
    }
}
