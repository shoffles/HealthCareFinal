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
public class MedicalProReportCreator {
    private Report report;
    
    public MedicalProReportCreator(Report newReport) {
        report = newReport;
    }
    
    public MedicalProReport createReport() {
        MedicalProReport newReport;
        HashMap<String, Integer> reportValues = report.getValueMap();
        HashMap<String, Integer> redactedValues = new HashMap<String, Integer>();
        
        int value1 = reportValues.get("HR");
        int value2 = reportValues.get("BPH");
        int value3 = reportValues.get("BPL");
        
        newReport = new MedicalProReport(value1, value2, value3);
        
        
        
        return newReport;
    }
}
