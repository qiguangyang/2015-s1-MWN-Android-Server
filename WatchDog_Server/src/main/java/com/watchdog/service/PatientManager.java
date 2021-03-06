package com.watchdog.service;

import java.util.List;

import com.watchdog.entity.PatientEntity;

public interface PatientManager {
	//This method will be called when a patient object is added
    public void addPatient(PatientEntity patient);
    //This method return list of patients in database
    public List<PatientEntity> getAllPatients();
    //Get patient info by id
    public PatientEntity getPatientById(Integer patientId);
    //Deletes a patient by it's id
    public void deletePatient(Integer patientId);
    //Get patient by EPC tag id
    public PatientEntity getPatientByTagId(String tagId);
}
