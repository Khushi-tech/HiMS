package com.hos.service;

import com.hos.entities.Patient;

import java.util.List;

public interface PatientService {
	List<Patient> getAllPatients();
    Patient getPatientById(Integer id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(Integer id);
}

