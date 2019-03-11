package com.jgraves

class Nurse {

String nurseName
String nurseEmail
String qualifications
Double nurseOffice
int nursePhone


    static constraints = {

nurseName blank:false
nurseEmail email:true, blank:false
qualifications blank:false
nurseOffice blank:false
nursePhone blank:false, maxSize:11


    }
}
