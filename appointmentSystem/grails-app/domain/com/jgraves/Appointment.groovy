package com.jgraves

class Appointment {

Date appDate
Float appTime
int appDuration
int roomNumber

Patient patients
Surgery surgeries

static hasMany=[doctors: Doctor]

    static constraints = {
appDate blank: false, nullable: false
appTime blank: false, nullable: false, unique: true
appDuration blank: false, nullable: false
roomNumber blank: false, nullable: false, unique: true
    }
}
