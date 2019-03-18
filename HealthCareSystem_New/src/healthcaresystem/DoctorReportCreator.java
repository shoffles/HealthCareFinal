/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import java.util.HashMap;

/**
 *
 * @author konno
 */
public class DoctorReportCreator {
    private Report report;
    private Patient patient;
    
    public DoctorReportCreator(Report newReport, Patient newPatient) {
        report = newReport;
        patient = newPatient;
    }
    
    public DoctorReport createReport() {
        DoctorReport newReport;
        HashMap<String, Integer> reportValues = report.getValueMap();
        HashMap<String, Integer> redactedValues = new HashMap<String, Integer>();
        
        String name = patient.getName();
        int value1 = reportValues.get("HR");
        int value2 = reportValues.get("BPH");
        int value3 = reportValues.get("BPL");
        
        newReport = new DoctorReport(name, value1, value2, value3);
        
        
        
        return newReport;
    }
}