package cn.com.test;

import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class ReadXML {
	public static void main(String[] args) {
		try {
			
			String realPath = ReadXML.class.getResource("/").getPath();//��ȡ���·��
	        realPath = realPath+"erp-config-bean.xml";//��ȡxml�ļ�·��
	        File file = new File(realPath);
	        SAXBuilder saxBuilder = new SAXBuilder();
	        Document doc = new Document();
	        doc = saxBuilder.build(file);//��xml�ļ�����Ϣ��ӵ�document����
	        Element rootElement = doc.getRootElement(); //��ȡ���ڵ�
            List beanList = rootElement.getChildren();//��ȡ����bean�ڵ�
            for (int i = 0; i < beanList.size(); i++) {
                Element bean = (Element) beanList.get(i);
                List propertyList = bean.getChildren(); //��ȡ����property�ڵ�
                for (int j = 0; j < propertyList.size(); j++) {
               
                    Element propertyElement = (Element) propertyList.get(j);//��ȡ��j+1��property�ڵ�
                    System.out.println("propertyName------"+propertyElement.getAttributeValue("name"));
//                    String paraName = propertyElement.getAttributeValue("name"); //��ȡproperty�ڵ�name���Ե�ֵ
//                    
//                    List entryList= propertyElement.getChildren("entry");
                    
//                    for(int k = 0; k<list.size() ; k++){
//                    	Element entryElement = (Element) entryList.get(0);
//                    	 if ("list".equalsIgnoreCase(listElement.getName())) {
//                    		 System.out.println(entryElement.getAttributeValue("name"));
//                    		 System.out.println();
//                    		 List entryList = null;
//                             entryList = (listElement.getChild("map")).getChildren(); //��ȡMAPԪ���µ�����entry�ڵ�
//                             Map paraMap = new LinkedHashMap();
//                             for (int n = 0; n < entryList.size(); n++) {
//                                 Element entry = (Element) entryList.get(n);
//                                 String key = entry.getAttributeValue("key"); //��ȡentry�ڵ�key���Ե�ֵ
//                                 String value = entry.getAttributeValue("value");
//                                 System.out.print("entity_key-------"+key+"\t\t\t");
//                                 System.out.println("entity_value-------"+value);
//                             }
//                         }
//                    }
//                    
//                    
//                   
                }
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
}
