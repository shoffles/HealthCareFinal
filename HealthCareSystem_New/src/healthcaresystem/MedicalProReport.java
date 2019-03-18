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
public class MedicalProReport {
    private int heartRate;
    private int bloodPressureHigh;
    private int bloodPressureLow;
    
    public MedicalProReport(int newRate, int newBPH, int newBPL) {
        heartRate = newRate;
        bloodPressureHigh = newBPH;
        bloodPressureLow = newBPL;
    }
    
    public String toString() {
        return "HeartRate: " + heartRate + "\n\r" + " Blood Pressure: " + bloodPressureHigh + " Over " + bloodPressureLow;
    }
    
}
