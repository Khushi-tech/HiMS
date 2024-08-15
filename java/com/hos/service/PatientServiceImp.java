package com.hos.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hos.entities.Patient;
import com.hos.exception.ResourceNotFoundException;
import com.hos.respositories.*;

@Service
public class PatientServiceImp implements PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Integer id) {
        patientRepository.deleteById(id);
    }
    
    @Override
    public Patient updatePatient(Patient patient) {
    	 Patient existingPatient = patientRepository.findById(patient.getId())
    		        .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + patient.getId()));
        // Update the patient details
        existingPatient.setName(patient.getName());
        existingPatient.setAge(patient.getAge());
        existingPatient.setGender(patient.getGender());
        existingPatient.setDepartment(patient.getDepartment());
        existingPatient.setPhone_number(patient.getPhone_number());
        existingPatient.setEmail(patient.getEmail());
        existingPatient.setAddress(patient.getAddress());
        
        existingPatient.setDoctor_id(patient.getDoctor_id());

        // Save the updated patient back to the repository
        return patientRepository.save(existingPatient);
    }
    }

