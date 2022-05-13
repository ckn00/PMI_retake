public class Assistant extends Dentist{
    /*
    Derive an Assistant class from the Dentist class.
    This class has to contain a refreshAppointment method,
    with which we can modify the appointment of a patient in Dentist.
     */

    public void refreshAppointment(String patientName, String appointment){
        int index = super.getIndex(appointment);
        super.getDentistArrayList().get(index);
    }
}
