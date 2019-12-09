/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprocesos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hugoa_kaskhih
 */
public class VentanaPrincipal extends javax.swing.JDialog {
    private DefaultListModel modelList1,modelList2,modelList3;
    private DefaultTableModel modelTable;
    private String[] namesProcess = {"Proceso 1","Proceso 2","Proceso 3","Proceso 4","Proceso 5"};
    private ArrayList<Proceso> arraylist = new ArrayList();
    private ArrayList<Proceso> arraylistAux1 = new ArrayList();
    private ArrayList<Proceso> arraylistAux2 = new ArrayList();
    private ArrayList<Integer> availabilityPID = new ArrayList();
    private int valueMax = 0;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        drivingListOne();
    }
    
    private void drivingListOne(){
        modelList1 = new DefaultListModel();
        modelList2 = new DefaultListModel();
        modelList3 = new DefaultListModel();
        for (int i = 0; i < namesProcess.length; i++) {
            modelList2.addElement(namesProcess[i]);
        }
        jList2.setModel(modelList2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        startProcess = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stepByStep = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane2.setViewportView(jList2);

        startProcess.setText("Iniciar Proceso");
        startProcess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startProcessMouseReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo procesador", "Prioridad", "PID", "Interacción Usua.", "% Ejecución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estado Inactivo");

        jLabel2.setText("Estado Preparado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("En Ejecución");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(startProcess))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startProcess)
                .addContainerGap())
        );

        stepByStep.setText("Paso a paso");
        stepByStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stepByStepMouseReleased(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Estado Suspendido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(stepByStep)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stepByStep)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startProcessMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startProcessMouseReleased
        modelTable = (DefaultTableModel) jTable1.getModel();
        try {
            int number = jList2.getSelectedIndex();
            String processText = jList2.getModel().getElementAt(number);
            
           
            Proceso newProcess = new Proceso(processText,generatePid());
            modifyTable(newProcess);
            
            modelList2.remove(number);
        } catch (ArrayIndexOutOfBoundsException ex) {
            if(Integer.parseInt(ex.getMessage()) == -1){
                JOptionPane.showMessageDialog(null, "Seleccione un proceso");
            }
        }
        int auxCont = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            auxCont = (int)modelTable.getValueAt(i, 1);
            if (auxCont > valueMax) {
                valueMax = auxCont;
            }
        }
    }//GEN-LAST:event_startProcessMouseReleased

    private void modifyTable(Proceso newProcess){
        boolean aux = true;
        
        if(arraylist.size() != 0){
            for (int i = 0; i < arraylist.size(); i++) {
                if (arraylist.get(i).getTimeMin() != newProcess.getTimeMin()) {
                    if (arraylist.get(i).getTimeMin() > newProcess.getTimeMin()) {
                        arraylist.add(i, newProcess);
                        aux = false;
                        break;
                    }
                }else if(arraylist.get(i).getPriority() != newProcess.getPriority()){
                    if (arraylist.get(i).getPriority() > newProcess.getPriority()) {
                        arraylist.add(i, newProcess);
                        aux = false;
                        break;
                    }
                }else if(arraylist.get(i).getPid() > newProcess.getPid()){
                    arraylist.add(i, newProcess);
                    aux = false;
                    break;
                }
            }
        }
        if(aux){
             arraylist.add((arraylist.size()),newProcess);
        }
       // arraylist.add(0, (Object[]) newProcess.rowinfo());
//        System.out.println("hola señores: "+modelTable.getRowCount()+"-"+arraylist.size());
        
        for (int i = (modelTable.getRowCount()-1); i >= 0; i--) {
//            System.out.println("adfqerke: "+i);
            modelTable.removeRow(0);
        }
        for (int i = 0; i < arraylist.size(); i++) {
            modelTable.addRow((Object[]) arraylist.get(i).rowinfo());
        }
    }
    
    private void stepByStepMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stepByStepMouseReleased
//        System.out.println("link: "+jList1.getModel().getSize());
        try {
            if(jList1.getModel().getSize()!=0 || (jList3.getModel().getSize()!=0 || jTable1.getRowCount()>0)){
//                System.out.println("Error ines 1");
                if(jTable1.getRowCount()>0){
//                    System.out.println("error ines 2");
                    if (jList1.getModel().getSize()!=0) {
//                        System.out.println("error ines 3");
                        if (arraylistAux1.get(0).getPercentage() >= 100) {
//                            System.out.println("error ines 4");
                            modelList2.addElement(arraylistAux1.get(0).getNameProc());
                            arraylistAux1.remove(0);
                            modelList1.removeAllElements();
                            jList1.setModel(modelList1);
                            jList2.setModel(modelList2);
                        }else{
//                            System.out.println("error ines 5");
                            float auxPorcentaje = arraylistAux1.get(0).getPercentage();
                            int auxTimemin = arraylistAux1.get(0).getTimeMin();
                            int auxRataC = arraylistAux1.get(0).getRataCuantum();
                            float result = (float)(auxPorcentaje+((auxTimemin/auxRataC)*100/valueMax));
                            arraylistAux1.get(0).setPercentage(result,valueMax);
//                            System.out.println("asdf: "+auxPorcentaje);
//                            System.out.println("asdf: "+(auxTimemin/auxRataC));
//                            System.out.println("asdf: "+valueMax);
//                            System.out.println("asdf: "+result);
//                            System.out.println("holaaaaaaaaaaaaaaaaaaaaaaaa"+arraylistAux1.get(0).getPercentage());
                            arraylistAux2.add(arraylistAux1.get(0));
                            arraylistAux1.remove(0);
                            modelList1.removeAllElements();
                            jList1.setModel(modelList1);
                            
                            try {
                                manejoEspecialList3();
                            } catch (Exception e) {
                                System.out.println("error inesperado 1.2");
                            }

                            
                        }
                    }
//                    System.out.println("error ines 6");
                    arraylistAux1.add(arraylist.get(0));
                    arraylist.remove(0);
                    modelTable.removeRow(0);
                    jTable1.setModel(modelTable);
                    String info = "<html>Nombre proceso: "+arraylistAux1.get(0).getNameProc()+
                                  "<br>Pid: "+arraylistAux1.get(0).getPid()+
                                  "<br>Interacciones con el usuario: "+arraylistAux1.get(0).getUserResponse()
                                + "<br>Porcentaje ejecutado: "+arraylistAux1.get(0).getPercentage()+"%</html>";
                    modelList1.addElement(info);
                    jList1.setModel(modelList1);
                }
            }else{
//                System.out.println("error ines 7");
    //            Debe tener en cuenta los casos de ejecución y pausa
                JOptionPane.showMessageDialog(null, "Primero comience un proceso");
            }
//            System.out.println("error ines 8");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error inesperado");
        }
        
    }//GEN-LAST:event_stepByStepMouseReleased

    private void manejoEspecialList3(){
        if (arraylistAux2.size() > 0) {
//            System.out.println("error1");
            for (int i = 0; i < arraylistAux2.size(); i++) {
//                System.out.println("error2");
                if (arraylistAux2.get(i).getUserResponse()>0 ) {
//                    System.out.println("error3");
                    if (arraylistAux2.get(i).getAuxUserResponse() == 0) {
                        System.out.println("error4");
                        Proceso newProcess = new Proceso(arraylistAux2.get(i).getNameProc(),
                                                         arraylistAux2.get(i).getPid(),
                                                         arraylistAux2.get(i).getUserResponse()-1,
                                                         arraylistAux2.get(i).getTimeMin(),
                                                         arraylistAux2.get(i).getPercentage());
                        modifyTable(newProcess);
                        arraylistAux2.remove(i);
                        modelList3.remove(i);
                        jList3.setModel(modelList3);
                        System.out.println("error 4.1");
                    }else{
                        System.out.println("error5");
                        arraylistAux2.get(i).setAuxUserResponse(0);
                    }
                }else{
//                    System.out.println("error 5.1");
                    Proceso newProcess = new Proceso(arraylistAux2.get(i).getNameProc(),
                                                     arraylistAux2.get(i).getPid(),0,
                                                     arraylistAux2.get(i).getTimeMin(),
                                                     arraylistAux2.get(i).getPercentage());
                    modifyTable(newProcess);
                    arraylistAux2.remove(i);
                    modelList3.remove(i);
                    jList3.setModel(modelList3);
                }
            }
        }
//        System.out.println("error7");
//        double auxPorcentaje = arraylistAux2.get(arraylistAux2.size()-1).getPercentage();
//        int auxTimemin = arraylistAux2.get(arraylistAux2.size()-1).getTimeMin();
//        int auxRataC = arraylistAux2.get(arraylistAux2.size()-1).getRataCuantum();
//        arraylistAux2.get(arraylistAux2.size()-1).setPercentage(auxPorcentaje+(auxTimemin*100/auxRataC));
//        arraylistAux2.get(arraylistAux2.size()-1).setPercentage(auxPorcentaje+((auxTimemin/auxRataC)*100/valueMax));
        String info = "<html><br>Nombre proc.: "+arraylistAux2.get(arraylistAux2.size()-1).getNameProc()
                    + "<br>PID: "+arraylistAux2.get(arraylistAux2.size()-1).getPid()
                    +"<br>Interacciones Usuario: "+arraylistAux2.get(arraylistAux2.size()-1).getUserResponse()
                    +"<br>Porcentaje ejecutado: "+arraylistAux2.get(arraylistAux2.size()-1).getPercentage()+"%<br></html>";
//        System.out.println("error8");
        modelList3.addElement(info);
//        System.out.println("error9");
        jList3.setModel(modelList3);
//        System.out.println("error10");
    }
    
    private int generatePid(){
        System.out.println("prde_ ");
        if (availabilityPID.size()>0) {
            for (int i = 0; i < availabilityPID.size(); i++) {
                if (availabilityPID.get(i)!=(i+1)) {
                    availabilityPID.add(i, (i+1));
                    return i+1;
                }
            }
            availabilityPID.add(availabilityPID.size()+1);
            return availabilityPID.size();
        }else{
            availabilityPID.add(1);
            return 1;
        }
        
//        Random  ran = new Random();
//        int value = ((int)(ran.nextDouble() * 1000 + 1));
//        boolean verify = true;
//        System.out.println("value: "+value);
//        if (arraylist.size() > 0) {
//            for (int i = 0; i < arraylist.size(); i++) {
//                if (value == arraylist.get(i).getPid()) {
//                    verify = false;
//                    break;
//                }
//            }
//        }
//        if (verify) {
//            return value;
//        }else{
//            value = generatePid();
//        }
//        
//        return value;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton startProcess;
    private javax.swing.JButton stepByStep;
    // End of variables declaration//GEN-END:variables
}
