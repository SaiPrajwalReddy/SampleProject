package PractiseProject.sample;

import java.io.Serializable;
import java.util.Map;

import org.beanio.StreamFactory;
import org.beanio.Unmarshaller;

public class InputParser implements Serializable {

	Map<String, String> mapping = null;

	private static final long serialVersionUID = 4006487511489070948L;

	// TODO Auto-generated method stub
	// Bean attributes.
	private static Object syncObject = new Object();

	public final Object unMarshall(String beanName, String inputString) {
		Object entity = null;
		synchronized (syncObject) {

			StreamFactory factory = StreamFactory.newInstance();
			factory.loadResource("mapping.xml");			
			//factory.load("/datalake/optum/optuminsight/analytics_capability/temp/mredd110/batchjar/mapping.xml");
			Unmarshaller unmarshaller = factory.createUnmarshaller(beanName);

			entity = unmarshaller.unmarshal(inputString);
			return entity;
		}
	}

	public static void main(String args[]) {
/*
		InputParser inp = new InputParser();
		Reviews rev = (Reviews) inp.unMarshall("", "");*/

	}

}