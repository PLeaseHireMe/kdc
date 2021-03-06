
package org.kiwi.dictao.webservices.d2s;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "D2SSoap", targetNamespace = "http://www.dictao.com/D2S/Interface")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface D2SSoap {


    /**
     * 
     * @param signatureType
     * @param signatureParameter
     * @param transactionId
     * @param pluginParameter
     * @param requestId
     * @param dataToSign
     * @param tag
     * @param signatureContext
     * @param detachedSignature
     * @param signatureFormat
     * @return
     *     returns org.kiwi.dictao.webservices.d2s.D2SResponseEx
     */
    @WebMethod(action = "http://www.dictao.com/D2S/Interface/signatureEx")
    @WebResult(name = "signatureExResult", targetNamespace = "http://www.dictao.com/D2S/Interface")
    @RequestWrapper(localName = "signatureEx", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.SignatureEx")
    @ResponseWrapper(localName = "signatureExResponse", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.SignatureExResponse")
    public D2SResponseEx signatureEx(
        @WebParam(name = "requestId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String requestId,
        @WebParam(name = "transactionId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String transactionId,
        @WebParam(name = "tag", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String tag,
        @WebParam(name = "dataToSign", targetNamespace = "http://www.dictao.com/D2S/Interface")
        DataType dataToSign,
        @WebParam(name = "detachedSignature", targetNamespace = "http://www.dictao.com/D2S/Interface")
        DataType detachedSignature,
        @WebParam(name = "signatureFormat", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String signatureFormat,
        @WebParam(name = "signatureType", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String signatureType,
        @WebParam(name = "signatureParameter", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String signatureParameter,
        @WebParam(name = "signatureContext", targetNamespace = "http://www.dictao.com/D2S/Interface")
        ContextType signatureContext,
        @WebParam(name = "pluginParameter", targetNamespace = "http://www.dictao.com/D2S/Interface")
        ArrayOfPluginParameterStruct pluginParameter);

    /**
     * 
     * @param pluginParameter
     * @param archiveId
     * @param requestId
     * @return
     *     returns org.kiwi.dictao.webservices.d2s.D2SArchiveResponseEx
     */
    @WebMethod(action = "http://www.dictao.com/D2S/Interface/getArchiveEx")
    @WebResult(name = "getArchiveExResult", targetNamespace = "http://www.dictao.com/D2S/Interface")
    @RequestWrapper(localName = "getArchiveEx", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.GetArchiveEx")
    @ResponseWrapper(localName = "getArchiveExResponse", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.GetArchiveExResponse")
    public D2SArchiveResponseEx getArchiveEx(
        @WebParam(name = "requestId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String requestId,
        @WebParam(name = "archiveId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String archiveId,
        @WebParam(name = "pluginParameter", targetNamespace = "http://www.dictao.com/D2S/Interface")
        ArrayOfPluginParameterStruct pluginParameter);

    /**
     * 
     * @param keyContainerParameter
     * @param keyContainerFormat
     * @param transactionId
     * @param pluginParameter
     * @param requestId
     * @param keyContainerType
     * @param tag
     * @param properties
     * @return
     *     returns org.kiwi.dictao.webservices.d2s.D2SResponseEx
     */
    @WebMethod(action = "http://www.dictao.com/D2S/Interface/prepareSignatureEx")
    @WebResult(name = "prepareSignatureExResult", targetNamespace = "http://www.dictao.com/D2S/Interface")
    @RequestWrapper(localName = "prepareSignatureEx", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.PrepareSignatureEx")
    @ResponseWrapper(localName = "prepareSignatureExResponse", targetNamespace = "http://www.dictao.com/D2S/Interface", className = "org.kiwi.dictao.webservices.d2s.PrepareSignatureExResponse")
    public D2SResponseEx prepareSignatureEx(
        @WebParam(name = "requestId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String requestId,
        @WebParam(name = "transactionId", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String transactionId,
        @WebParam(name = "tag", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String tag,
        @WebParam(name = "keyContainerFormat", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String keyContainerFormat,
        @WebParam(name = "keyContainerType", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String keyContainerType,
        @WebParam(name = "keyContainerParameter", targetNamespace = "http://www.dictao.com/D2S/Interface")
        String keyContainerParameter,
        @WebParam(name = "properties", targetNamespace = "http://www.dictao.com/D2S/Interface")
        DataType properties,
        @WebParam(name = "pluginParameter", targetNamespace = "http://www.dictao.com/D2S/Interface")
        ArrayOfPluginParameterStruct pluginParameter);

}
