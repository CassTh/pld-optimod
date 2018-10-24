package controler;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import ui.Window;
import xml.XMLException;

public class DefaultState implements State{
	public void openPlan(Controler controler, Window window)throws XMLException, ParserConfigurationException, SAXException, IOException{}
	public void openDeliveries(Controler controler) throws  XMLException, ParserConfigurationException, SAXException, IOException{}
	public void openParameters(Controler controler){}
	public void calculateTour(Controler controler){}
}
