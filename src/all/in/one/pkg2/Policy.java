/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package all.in.one.pkg2;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author TPRGIUB
 */
public class Policy {
    
    public Element root;
    private String polType;
    
    public Policy(){}
    
    public Policy(Element root){
        this.root = root;
    }
    
    public void detectPolType () {
        
        NodeList nList = root.getElementsByTagName("PersPolicy");
        Node node = nList.item(0);
        NodeList nodeList = node.getChildNodes();
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node n = nodeList.item(i);
            if(n.getNodeName().equals("LOBCd")){
                setPolType(n.getTextContent());
                break;
            }
        }
    }
    
    public void checkIds() {
        System.out.println("pol type: " + getPolType());
        if (getPolType().equals("AUTO")) {
            NodeList nList = root.getElementsByTagName("PersDriver");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                NodeList subNodeList = node.getChildNodes();
                Node driverIdInfo = subNodeList.item(1);
                Node itemId = driverIdInfo.getFirstChild().getNextSibling();
                String str = itemId.getTextContent();
                
                if (str != null && !str.isEmpty()) {
                    System.out.println("id: " + str);
                } else {
                    System.out.println("ID is null or empty");
                }
            }
        } else {
        }
    }

    /**
     * @return the polType
     */
    public String getPolType() {
        return polType;
    }

    /**
     * @param polType the polType to set
     */
    public void setPolType(String polType) {
        this.polType = polType;
    }
}
