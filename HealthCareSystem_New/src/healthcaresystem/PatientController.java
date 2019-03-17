
package healthcaresystem;


class PatientController {
    
    private PatientView patientView;
    private Patient patient;
    
    
    public PatientController() {
        this.patientView = new PatientView();
        this.patient = new Patient("Thomas");
        this.patientTest();
    }
    
    
    
    public void patientTest() {
        this.patient.addEarlyWarning(new EarlyWarning("High Fever!"));
        this.patient.addReport(new Report("Patient brought in with low fever, need to keep overnight.", "02/25/19", 1));
        this.patient.editPatientInfo("Thomas Shoff");
        this.patient.viewReportList();
        System.out.println("Patient test complete");
    }
}
