package com.watchdog.dao;

import java.util.List;

import com.watchdog.entity.PatientEntity;

public interface PatientDAO 
{
	//This method will be called when a patient object is added
    public void addPatient(PatientEntity patient);
    //Get patients by name
    public List<PatientEntity> getPatientByName(String name);
    //Get the patient by id
    public PatientEntity getPatientById(Integer id);
    //This method return list of patients in database
    public List<PatientEntity> getAllPatients();
    //Deletes a patient by it's id
    public void deletePatient(Integer patientId);
    //Get patient by EPC tag id
    public PatientEntity getPatientByTagId(String tagId);
}