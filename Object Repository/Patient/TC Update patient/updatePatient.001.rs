<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>updatePatient.001</name>
   <tag></tag>
   <elementGuidId>a5146cd2-8d1d-4bc0-bf24-42256fa6cfde</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzEwOTU0OTAsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.eRT9FRBAqfArHcwYy65NjeRlhFRRrJCouXnDIwqO04o</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;nik\&quot;: \&quot;12341234\&quot;,\n    \&quot;name\&quot;: \&quot;John Cena\&quot;,\n    \&quot;gender\&quot;: 1,\n    \&quot;address\&quot;: \&quot;Jakarta\&quot;,\n    \&quot;phone\&quot;: \&quot;0812121213\&quot;,\n    \&quot;marital_status\&quot;: false,\n    \&quot;birth_date\&quot;: \&quot;2000-01-01T00:00:00.000Z\&quot;,\n    \&quot;religion_id\&quot;: 1\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>5c8b5643-9e2c-4ac2-9002-5009e9bbe652</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzEwOTU0OTAsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.eRT9FRBAqfArHcwYy65NjeRlhFRRrJCouXnDIwqO04o</value>
      <webElementGuid>d4f535b2-a6d5-428c-9064-206bda4533bf</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
