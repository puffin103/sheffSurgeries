package com.jgraves

class Surgery {

String name
String address
String postcode
String telephone
int numberOfPatients
String description 
String openingTime

Doctor doctors
Nurse nurses
Receptionist receptionists

static hasMany=[patients: Patient, appointments: Appointment]

    static constraints = {
name blank: false, nullable: false
address blank: false, nullable: false
postcode blank: false, nullable: false
telephone blank: false, nullable: false
numberOfPatients blank: false, nullable: false
description blank: false, nullable: false
openingTime blank: false, nullable: false

    }
}
