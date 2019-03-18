/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import java.util.ArrayList;


public class Patient {
    
    private EarlyWarning earlyWarning;
    
    private String patientName;
    private ArrayList<Report> reportList;
    
    public Patient(String newPatientName) {
        patientName = newPatientName;
        reportList = new ArrayList<>();
        System.out.println("Patient Created");
    }
            

    public void addReport(Report newReport){
        /* 
        Adds a new Report object to the list 
        of reports for this patient
        */
        this.reportList.add(newReport);
        
    }

    public void viewReportList(){
        /*
        Loads a new view that displays a 
        List of all available reports for the specified patient
        */
       this.reportList.forEach(report -> {
           System.out.println(report);
       });
        System.out.println("Report List created");
    }

    public void editPatientInfo(String newName){
        /*
        Allows corrections to be made to
        the Patient Name
        */
        this.patientName = newName;
        System.out.println("Patient updated");
    }
    
    public void addEarlyWarning(EarlyWarning addedEarlyWarning) {
        /* 
        Replaces the old Early Warning with a new one generated
        by a doctor from the "Add early warning" page.  This then 
        runs the latest report by these numbers
        */
        this.earlyWarning = addedEarlyWarning;
        System.out.println("Early warning added");
    }
    
    public String getName() {
        return patientName;
    }

    
}
