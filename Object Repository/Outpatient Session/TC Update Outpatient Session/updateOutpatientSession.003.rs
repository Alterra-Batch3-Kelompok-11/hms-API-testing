<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>updateOutpatientSession.003</name>
   <tag></tag>
   <elementGuidId>585448dc-817d-4f04-9541-959b9ef53b2e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzE0MjYwMDgsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.-z0wmoIHHCaArlW_u519oN8P5spPYoCKFLF7CbByoZM</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;patient_id\&quot;: 11,\n  \&quot;doctor_id\&quot;: 7,\n  \&quot;complaint\&quot;: \&quot;Batuk Pilek dan Demam\&quot;,\n  \&quot;schedule_date\&quot;: \&quot;18-12-2022\&quot;,\n  \&quot;schedule_time\&quot;: \&quot;13:30:00\&quot;\n}&quot;,
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
      <webElementGuid>2d84d09c-d7a6-47c8-91cc-7a231245122f</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzE0MjYwMDgsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.-z0wmoIHHCaArlW_u519oN8P5spPYoCKFLF7CbByoZM</value>
      <webElementGuid>9b13ed25-9d1f-47fb-b07e-c0eb97185cb8</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/a</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>8e0ef427-5e99-44db-8c90-9180ec78542c</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
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
