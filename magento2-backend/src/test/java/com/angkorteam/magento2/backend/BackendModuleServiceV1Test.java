//package com.angkorteam.magento2.backend;
//
//import net.ddns.pkayjava.magento2.soap._default.BackendModuleServiceV1GetModulesRequestDocument;
//import net.ddns.pkayjava.magento2.soap._default.BackendModuleServiceV1GetModulesResponseDocument;
//import org.apache.axis2.client.ServiceClient;
//import org.apache.axis2.context.NamedValue;
//import org.junit.Test;
//
//import java.rmi.RemoteException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by socheat on 2/24/16.
// */
//public class BackendModuleServiceV1Test {
//
//    @Test
//    public void backendModuleServiceV1GetModulesTest() throws RemoteException, GenericFaultException {
//        BackendModuleServiceV1ServiceStub serviceStub = new BackendModuleServiceV1ServiceStub();
//
//        // Create an instance of org.apache.axis2.client.ServiceClient
//        ServiceClient serviceClient = serviceStub._getServiceClient();
//
//        List<NamedValue> list = new ArrayList<>();
//
//        NamedValue header = new NamedValue("Authorization", "Bearer dn0babnmkqqalmkv2kx2luiyo0q6lqxe");
//        list.add(header);
//
//        serviceClient.getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.HTTP_HEADERS, list);
//
//        BackendModuleServiceV1GetModulesRequestDocument document = BackendModuleServiceV1GetModulesRequestDocument.Factory.newInstance();
//        document.addNewBackendModuleServiceV1GetModulesRequest();
//        BackendModuleServiceV1GetModulesResponseDocument response = serviceStub.backendModuleServiceV1GetModules(document);
//        for (String string : response.getBackendModuleServiceV1GetModulesResponse().getResult().getItemArray()) {
//            System.out.println(string);
//        }
//    }
//}
