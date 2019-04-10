package com.jgraves

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
String doctorPhone
String bio

Prescription prescriptions

static hasMany=[surgeries: Surgery, nurses: Nurse, patients: Patient, appointments: Appointment]
static belongsTo=[Surgery]

    static constraints = {
fullName blank: false, nullable: false
qualification blank: false, nullable: false
position blank: false, nullable: false
doctorEmail blank: false, nullable: false, unique: true
password blank: false, nullable: false
doctorOffice blank: false, nullable: false
doctorPhone blank: false, nullable: false
bio blank: false, nullable: false
    }
}
