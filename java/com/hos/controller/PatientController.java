package com.hos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hos.entities.Patient;
import com.hos.service.PatientService;

@RestController 
@RequestMapping("api/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired    
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    //Fetch all patient
    @GetMapping
    public ResponseEntity<List<Patient>> getallPatients(){
    	List<Patient> patients = patientService.getAllPatients();
    	return new ResponseEntity<>(patients,HttpStatus.OK);
    }

//    // Fetch a single patient by ID
     @GetMapping("/{id}")
      public ResponseEntity<Patient> getpatientById(@PathVariable Integer id){
    	  Patient patient = patientService.getPatientById(id);
		return new ResponseEntity<>(patient,HttpStatus.OK);
      }
  // Create a new patient
     @PostMapping
     public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
    	 Patient createdPatient = patientService.createPatient(patient);
		return new ResponseEntity <>(createdPatient, HttpStatus.CREATED) ;
    	 
     }

//    Update new Patient id
     @PutMapping()
     public ResponseEntity<Patient> updatePatient( @RequestBody Patient patientDetails){
		Patient updatedPatient= patientService.updatePatient(patientDetails);
    	 return new ResponseEntity<>(updatedPatient,HttpStatus.OK);
    	 
     }
     
     
//     // Delete a patient by ID
     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deletePatient(@PathVariable Integer id){
    	 patientService.deletePatient(id);
    	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    	 
     }
    	 
     }

