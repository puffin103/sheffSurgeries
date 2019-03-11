package com.jgraves

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword 
int recepPhone

    static constraints = {

recepName blank:false
recepEmail email:true, blank:false
recepUsername unique:true, blank:false
recepPassword blank:false, min:6, max:16
recepPhone blank:false, min:11, max:11

    }
}
