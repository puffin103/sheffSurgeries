package com.jgraves

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword 
String recepPhone

static hasMany=[surgeries: Surgery]

    static constraints = {

recepName blank: false, nullable: false
recepEmail email: true, blank: false, unique: true
recepUsername unique: true, blank: false
recepPassword blank: false
recepPhone blank: false

    }
}
