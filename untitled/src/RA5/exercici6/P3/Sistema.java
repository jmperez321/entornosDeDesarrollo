package RA5.exercici6.P3;

public class Sistema {
    public String login(String user, String pass){
        if(user==user && pass==pass){
            String Dashboards="cositas";
            return Dashboards;
        } else {
            String Error = "incorrecto";
            return Error;
        }
    }
}
