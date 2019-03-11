package com.jgraves

class Prescription {

String pharmacyName
int prescripNumber
String medicine
Double totalCost
Date dateIssued
Boolean patientPaying

    static constraints = {

pharmacyName blank:false
prescripNumber blank:false, unique:true
medicine blank:false
totalCost blank:false, scale:3
dateIssued blank:false
patientPaying blank:false
    }
}
