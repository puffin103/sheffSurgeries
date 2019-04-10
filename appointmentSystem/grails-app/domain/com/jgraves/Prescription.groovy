package com.jgraves

class Prescription {

String pharmacyName
int prescripNumber
String medicine
Double totalCost
Date dateIssued
String patientPaying

static hasMany=[doctors: Doctor, patients: Patient]

    static constraints = {

pharmacyName blank: false, nullable: false
prescripNumber blank: false, nullable: false, unique: true
medicine blank: false, nullable: false
totalCost blank: false, nullable: false, scale: 2
dateIssued blank: false, nullable: false
patientPaying blank: false, nullable: false
    }
}
