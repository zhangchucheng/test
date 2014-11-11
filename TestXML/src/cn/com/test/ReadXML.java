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
			
			String realPath = ReadXML.class.getResource("/").getPath();//获取类根路径
	        realPath = realPath+"erp-config-bean.xml";//获取xml文件路径
	        File file = new File(realPath);
	        SAXBuilder saxBuilder = new SAXBuilder();
	        Document doc = new Document();
	        doc = saxBuilder.build(file);//将xml文件的信息添加到document里面
	        Element rootElement = doc.getRootElement(); //获取根节点
            List beanList = rootElement.getChildren();//获取所有bean节点
            for (int i = 0; i < beanList.size(); i++) {
                Element bean = (Element) beanList.get(i);
                List propertyList = bean.getChildren(); //获取所有property节点
                for (int j = 0; j < propertyList.size(); j++) {
               
                    Element propertyElement = (Element) propertyList.get(j);//获取第j+1个property节点
                    System.out.println("propertyName------"+propertyElement.getAttributeValue("name"));
//                    String paraName = propertyElement.getAttributeValue("name"); //获取property节点name属性的值
//                    
//                    List entryList= propertyElement.getChildren("entry");
                    
//                    for(int k = 0; k<list.size() ; k++){
//                    	Element entryElement = (Element) entryList.get(0);
//                    	 if ("list".equalsIgnoreCase(listElement.getName())) {
//                    		 System.out.println(entryElement.getAttributeValue("name"));
//                    		 System.out.println();
//                    		 List entryList = null;
//                             entryList = (listElement.getChild("map")).getChildren(); //获取MAP元素下的所有entry节点
//                             Map paraMap = new LinkedHashMap();
//                             for (int n = 0; n < entryList.size(); n++) {
//                                 Element entry = (Element) entryList.get(n);
//                                 String key = entry.getAttributeValue("key"); //获取entry节点key属性的值
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
