//package com.angkorteam.magento2.backend.integration;
//
//import com.angkorteam.magento2.integration.GenericFaultException;
//import com.angkorteam.magento2.integration.IntegrationAdminTokenServiceV1ServiceStub;
//import net.ddns.pkayjava.magento2.soap._default.IntegrationAdminTokenServiceV1CreateAdminAccessTokenRequest;
//import net.ddns.pkayjava.magento2.soap._default.IntegrationAdminTokenServiceV1CreateAdminAccessTokenRequestDocument;
//import net.ddns.pkayjava.magento2.soap._default.IntegrationAdminTokenServiceV1CreateAdminAccessTokenResponseDocument;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.rmi.RemoteException;
//
///**
// * Created by socheat on 2/24/16.
// */
//public class IntegrationAdminTokenServiceV1Test {
//
//    @Test
//    public void integrationAdminTokenServiceV1CreateAdminAccessTokenTest() throws RemoteException, GenericFaultException {
//        IntegrationAdminTokenServiceV1CreateAdminAccessTokenRequestDocument document = IntegrationAdminTokenServiceV1CreateAdminAccessTokenRequestDocument.Factory.newInstance();
//        IntegrationAdminTokenServiceV1CreateAdminAccessTokenRequest request = document.addNewIntegrationAdminTokenServiceV1CreateAdminAccessTokenRequest();
//        request.setPassword("admin123");
//        request.setUsername("admin");
//
//        IntegrationAdminTokenServiceV1ServiceStub serviceStub = new IntegrationAdminTokenServiceV1ServiceStub();
//        IntegrationAdminTokenServiceV1CreateAdminAccessTokenResponseDocument response = serviceStub.integrationAdminTokenServiceV1CreateAdminAccessToken(document);
//        String token = response.getIntegrationAdminTokenServiceV1CreateAdminAccessTokenResponse().getResult();
//        Assert.assertNotNull(token);
//    }
//}
