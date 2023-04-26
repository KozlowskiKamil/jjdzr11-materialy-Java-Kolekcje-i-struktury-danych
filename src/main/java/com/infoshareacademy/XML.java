package com.infoshareacademy;

import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.nio.file.Path;

public class XML {
    public static void main(String[] args) throws JAXBException {
        Engine engine = EngineFactory.generateEngine();
        System.out.println(engine);

        JAXBContext context = JAXBContext.newInstance(Engine.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(engine, System.out);

        Path pathToXml = Path.of("src", "main", "resources", "engine.xml");
        File file = new File(pathToXml.toString());

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Engine engineFromXml = (Engine) unmarshaller.unmarshal(file);
        System.out.println(engineFromXml);
    }
}
