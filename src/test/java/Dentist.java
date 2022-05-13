import java.util.ArrayList;
import java.util.List;

public class Dentist {

    /*
    Implement the Dentist class, which handle appointments (patientName, appointment).
     The class should have a newAppointment (add a new patient with appointment),
     a resign (remove the given appointment of a patient),
     and a getAppointments (return the details of actually stored appointments as a String: ) method.
     */

    private String patientName;
    private String appointment;

    public Dentist() {
        this.patientName = " ";
        this.appointment = " ";
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public ArrayList<String> dentistArrayList =  new ArrayList<>();

    public int getIndex(String appointment){
        for(int i=1; i<dentistArrayList.size(); i++){
            if(dentistArrayList.get(i).equals(appointment)){
                return i;
            }
        }
        return -1;
    }

    public void newAppointment(String patientName, String timestamp){
        Dentist dentist = new Dentist();
        dentistArrayList.add(patientName + " " + timestamp);
    }

    public void resign(String appointment){
        int index = getIndex(appointment);
        dentistArrayList.remove(index);
    }

    public String getAppointments(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<dentistArrayList.size(); i++){
            String dentist = dentistArrayList.get(i);
            stringBuilder.append(dentist);
            if(i<dentistArrayList.size() -1){
                stringBuilder.append("\r\n");
            }
        }
        return stringBuilder.toString();
    }

    public ArrayList<String> getDentistArrayList(){
        return dentistArrayList;
    }
}
