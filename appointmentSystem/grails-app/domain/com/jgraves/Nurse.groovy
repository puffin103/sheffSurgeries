package com.jgraves

class Nurse {

String nurseName
String nurseEmail
String qualifications
Double nurseOffice
String nursePhone

static hasMany=[doctors: Doctor, surgeries: Surgery]
static belongsTo=[Doctor]

    static constraints = {

nurseName blank: false, nullable: false
nurseEmail blank: false, nullable: false, unique: true
qualifications blank: false, nullable: false
nurseOffice blank: false, nullable: false
nursePhone blank: false, nullable: false


    }
}
