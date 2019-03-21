/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

/**
 *
 * @author konno
 */
public class ReportView {
    
    private Report report;
    private User user;
    private Patient patient;
    
    public ReportView(Report newReport, User newUser, Patient newPatient) {
        System.out.println("ReportView running");
        report = newReport;
        user = newUser;
        patient = newPatient;
    }
    
    public void getTieredReport() {
        ReportReaderFactory RRF = new ReportReaderFactory(user, report, patient);
    }
    
}
