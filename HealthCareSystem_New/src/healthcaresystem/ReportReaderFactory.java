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
public class ReportReaderFactory {
    
    
    
    public ReportReaderFactory(User newUser, Report newReport, Patient newPatient) {
        if (newUser.getUserType() == 3) {
            DoctorReportCreator DRC = new DoctorReportCreator(newReport, newPatient);
        } else {
            MedicalProReportCreator MPRC = new MedicalProReportCreator(newReport);
        }
    }
}
