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
public class DoctorReport {
    private String name;
    private int heartRate;
    private int bloodPressureHigh;
    private int bloodPressureLow;
    
    public DoctorReport(String newName, int newRate, int newBPH, int newBPL) {
        name = newName;
        heartRate = newRate;
        bloodPressureHigh = newBPH;
        bloodPressureLow = newBPL;
    }
    
    public String toString() {
        return "Name: " + name + "\n\r" + "HeartRate: " + heartRate + "\n\r" + " Blood Pressure: " + bloodPressureHigh + " Over " + bloodPressureLow;
    }
    
}
