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

def Jordan_Graves = new Patient(

patientName: 'Jordan Graves',
patientAddress: '9 Langworth Junction',
patientResidence: 'Langworth',
patientDob: '02/12/1995',
patientID: '3342',
dateRegistered: '02/12/1995',
patientPhone: '01623419882',
).save()

def Gregory_Thomas = new Patient(

patientName: 'Gregory Thomas',
patientAddress: 'Themes Lane',
patientResidence: 'Themes',
patientDob: '09/05/1999',
patientID: '62',
dateRegistered: '05/01/2005',
patientPhone: '01623454499',
).save()

def Receptionist1 = new Receptionist(

recepName: 'Pepper Potts',
recepEmail: 'Potts4@gmail.com',
recepUsername: 'Potts',
recepPassword: 'Pepperpig',
recepPhone: '0114555666',
).save()

def Receptionist2 = new Receptionist(

recepName: 'Evelina',
recepEmail: 'Lina@gmail.com',
recepUsername: 'Evelina',
recepPassword: 'russia',
recepPhone: '0114545666',
).save()

def Nurse1 = new Nurse(

nurseName: 'MrsAshbourne',
nurseEmail: 'Ashbourne@slates.com',
qualifications: 'Nursing Degree',
nurseOffice: '221',
nursePhone: '0774112334',

).save()

def Nurse2 = new Nurse(

nurseName: 'Lucy',
nurseEmail: 'lucyb@gmail.com',
qualifications: 'Nursing Degree',
nurseOffice: '24',
nursePhone: '07743326794',

).save()

def Prescription1 = new Prescription(

pharmacyName: 'Ladybrook Health Centre',
prescripNumber: '334',
medicine: 'Para',
totalCost: '£4.99',
dateIssued: '25/04/2017',
patientPaying: 'Yes',

).save()

def Prescription2 = new Prescription(

pharmacyName: 'Ladybrook Health Centre',
prescripNumber: '335',
medicine: 'Dojo',
totalCost: '£43.99',
dateIssued: '29/04/2017',
patientPaying: 'Yes',

).save()




    }

    def destroy = {
    }
}
