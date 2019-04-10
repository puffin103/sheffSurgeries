package com.jgraves

class BootStrap {

    def init = { servletContext ->

def Ladybrook_Health_Centre = new Surgery(

name: 'Ladybrook Health Centre',
address: '63 Andover Road',
postcode: 'NG19 0QY',
telephone: '01623421981',
numberOfPatients: '60',
description: 'Ladybrooks Health Centre',
openingTime: '09:00hrs',
).save()

def Baysdale_Health_Centre = new Surgery(

name: 'Baysdale Health Centre',
address: '9 Baysdale Road',
postcode: 'NG19 6TZ',
telephone: '01623633379',
numberOfPatients: '95',
description: 'Baysdales Health Centre',
openingTime: '09:00hrs',
).save()

def Doctor_Strange = new Doctor(

fullName: 'Doctor Strange',
qualification: 'University Degree',
position: 'Head Doctor',
doctorEmail: 'StrangeAvenge@gmail.com',
password: 'strange123',
doctorOffice: 'Office 19',
doctorPhone: '0114444557',
bio: 'Head doctor at the heath centre',
).save()

def Doctor_C = new Doctor(

fullName: 'Doctor C',
qualification: 'University Degree',
position: 'Senior Doctor',
doctorEmail: 'DoctorC@yahoo.com',
password: 'strange123',
doctorOffice: 'Office 3',
doctorPhone: '01145619857',
bio: 'Senior doctor at the heath centre',
).save()

def Appointment_1 = new Appointment(

appDate: '02/06/19',
appTime: '10:30',
appDuration: '45',
roomNumber: '14',
).save()

def Appointment_2 = new Appointment(

appDate: '03/06/19',
appTime: '12:30',
appDuration: '15',
roomNumber: '2',
).save()

def Appointment_2 = new Appointment(
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone

    }

    def destroy = {
    }
}
