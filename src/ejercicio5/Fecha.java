package ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private Calendar calendar;
    private int dia;
    private int mes;
    private int año;


    public Fecha() {
        calendar = new GregorianCalendar();
        dia = Calendar.DAY_OF_MONTH;
        mes = Calendar.MONTH;
        año = Calendar.YEAR;
    }

    public void añadirDia() {
        setDia(getDia() + 1);
        calendar.set(año, mes, dia);
    }

    public String toString() {
        return this.calendar.getTime().toString();
    }

    public boolean isDateCorrect() {

        if (this.calendar.getTime().getDay() == Calendar.DAY_OF_MONTH
                && this.calendar.getTime().getMonth() == Calendar.MONTH
                && this.calendar.getTime().getYear() == Calendar.YEAR) {
            return true;
        }
        return false;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
