/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprocesos;

import java.util.Random;


/**
 *
 * @author hugoa_kaskhih
 */
public class Proceso extends javax.swing.JDialog {
    private String name;
    private int timeMin, priority, pid, userResponse, auxUserResponse;
    private int rataCuantum, percentage, processedTime;
    
    public Proceso(String nameProcess,int pidn){
        name = nameProcess;
        pid = pidn;
        timeMin = generateRandomNumber(1, 10);
        priority = generateRandomNumber(1, 3);
        userResponse = generateRandomNumber(0, 2);
        auxUserResponse = 1;
        rataCuantum = generateRandomNumber(2, 5);
        percentage = 0;
        processedTime = 0;
    }
    
    public Proceso(String nameProcess,int pidn,int userRespon,int timeMini, int rataC){
        name = nameProcess;
        pid = pidn;
        timeMin = timeMini;
        priority = generateRandomNumber(1, 3);
        userResponse = userRespon;
        auxUserResponse = 1;
        rataCuantum = rataC;
        percentage += rataCuantum*100/timeMin;
        processedTime = 0;
    }
    
    public Object rowinfo(){
        String perc = percentage+"%";
        Object info[] = {name,timeMin,priority,pid,userResponse,perc};
        return info;
    }
    
    public String getNameProc(){
        return name;
    }
    
    public int getTimeMin(){
        return timeMin;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public int getPid(){
        return pid;
    }
    
    public int getPercentage(){
        return percentage;
    }
    
    public int getRataCuantum(){
        return rataCuantum;
    }
    
    public void setProcessedTime(){
        processedTime++;
    }
    
    public int getUserResponse(){
        return userResponse;
    }
    
    public int getAuxUserResponse(){
        return auxUserResponse;
    }
    
    public void setAuxUserResponse(int newValue){
        auxUserResponse = newValue;
    }
    
    public int generateRandomNumber(int valueMin, int valueMax){
        int prueba = Integer.toString(valueMax).length();
        int value = 0;
        int multDiez;
        String cad = "1";
        Random  ran = new Random();
        
        for (int i = 0; i < prueba; i++) {
            cad = cad+"0";
        }
        
        multDiez = Integer.parseInt(cad);
        value = ((int)(ran.nextDouble() * multDiez + valueMin));
        if (value > valueMax) {
            return generateRandomNumber(valueMin,valueMax);
        }
        return value;
    }
}
