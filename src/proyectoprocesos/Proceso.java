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
        auxUserResponse = 0;
        rataCuantum = generateRandomNumber(2, 5);
        percentage = 0;
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
    
    public int getCuantum(){
        return timeMin/rataCuantum;
    }
    
    public void setProcessedTime(){
        processedTime++;
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