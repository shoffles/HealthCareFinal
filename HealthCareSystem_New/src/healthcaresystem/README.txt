TO DO: Implement a view system to load a report.  Two Views needed, Doctor(DoctorReportView) and NonDoctor(MedProfView).

Load data in a HashMap with Keys.  Display "Key: Value" onto the view.  Only difference between views will be private info.
i.e. SSN, DOB, all that kinda personal stuff that will be saved patient side.  Both views are to load the "Model Classes" Report.java and Patient.java.  
DoctorReportView displays personal data along with all reportValues from the HashMap.  
(In the future, we will create a form to enter report data, thus generating this map for storage)
MedProfView displays patient name ONLY, along with the reportValue HashMap. 