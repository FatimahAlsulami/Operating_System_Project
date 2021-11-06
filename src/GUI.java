
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//------------------------------------
/*
Fatimah Al-sulami >> 1906175
Wejdan Al-ghtani >> 1907223
Layan Bitrah >> 1808301
Asil Al-hebshi >> 1906902
//------------------------------------

Section: ABR 
 */

public class GUI extends javax.swing.JFrame {

    static int NumberOfProcess;
    static int[] Bursut; //BurstTime
    static float[] turnaroundtime; //turnaround time
    static int[] Arrival;//Arrival Time
    static int[] terminationtime; // termination time
    static int[] responsetime; //response time
    static float[] WaittingTime; // wait time 
    static int[] priority;
    static int[] ID_process; //procsee id 

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SJF = new javax.swing.JToggleButton();
        FCFS = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Priority = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        result = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        r1 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        r2 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scheduling Algorithm");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setForeground(java.awt.Color.pink);
        setSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(100, 200, 199));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        SJF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SJF.setForeground(new java.awt.Color(0, 155, 152));
        SJF.setText("Short Job First(SJF)");
        SJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SJFActionPerformed(evt);
            }
        });

        FCFS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FCFS.setForeground(new java.awt.Color(0, 160, 138));
        FCFS.setText("First Come First Service(FCFS)");
        FCFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFSActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextPane1.setText("Please choose one of the algorithm:");
        jScrollPane1.setViewportView(jTextPane1);

        Priority.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Priority.setForeground(new java.awt.Color(0, 146, 127));
        Priority.setText("Priority");
        Priority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriorityActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(200, 250, 250));

        jTextPane2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextPane2.setText("OUTPUT");
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Process"), jTextPane4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(jTextPane4);

        jTextPane6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Burst Time"), jTextPane6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(jTextPane6);

        jTextPane7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Waiting Time"), jTextPane7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane7.setViewportView(jTextPane7);

        jTextPane8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Termination Time"), jTextPane8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane8.setViewportView(jTextPane8);

        jTextPane9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Response Time"), jTextPane9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane9.setViewportView(jTextPane9);

        r1.setColumns(20);
        r1.setRows(5);
        jScrollPane12.setViewportView(r1);

        r2.setColumns(20);
        r2.setRows(5);
        jScrollPane13.setViewportView(r2);

        jTextPane10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("Turnaround Time"), jTextPane10, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane10.setViewportView(jTextPane10);

        javax.swing.GroupLayout resultLayout = new javax.swing.GroupLayout(result);
        result.setLayout(resultLayout);
        resultLayout.setHorizontalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(resultLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane13))
                .addContainerGap())
        );
        resultLayout.setVerticalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jTextPane5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jScrollPane5.setViewportView(jTextPane5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1464, 1464, 1464)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Output.setEditable(false);
        Output.setBackground(new java.awt.Color(200, 250, 250));
        Output.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Output.setText("OUTPUT");
        jScrollPane3.setViewportView(Output);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(FCFS)
                        .addGap(68, 68, 68)
                        .addComponent(SJF)
                        .addGap(91, 91, 91)
                        .addComponent(Priority))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(937, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FCFS)
                    .addComponent(SJF)
                    .addComponent(Priority))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1672, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFSActionPerformed
        int i;
        int[] B = new int[NumberOfProcess];
        for (i = 1; i < NumberOfProcess; i++) {
            B[i] = Bursut[i];
        }
      //------------------------------------
        //waiteng time 
        WaittingTime[1] = 0;
        int b = 0;
        for (i = 2; i < NumberOfProcess; i++) {
            b += B[i - 1];
            WaittingTime[i] = b - Arrival[i];
        }
        //turnaround time ,terminationtime,responsetime
       //------------------------------------
        int j = 1;
        while (j < NumberOfProcess) {

            turnaroundtime[j] = WaittingTime[j] + B[j];
            terminationtime[j] = (int) (turnaroundtime[j] + Arrival[j]);
            responsetime[j] = (int) (turnaroundtime[j] - B[j]);
            j++;
        }
        //------------------------------------
        //print info of FCFS
        print(ID_process);
    }//GEN-LAST:event_FCFSActionPerformed

    private void PriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriorityActionPerformed
// finishCheck means it is flag it checks process is completed or not
        boolean[] finishCheck = new boolean[NumberOfProcess];
        int starttime = 0;  //start time 
        int Counter = 1;  // count 
        //--------------------------------------
        for (int i = 1; i < NumberOfProcess; i++) {  //We set a default value that all process are not finished
            finishCheck[i] = false;
        }
         //--------------------------------------
        while (true) {
            int c = NumberOfProcess;
            int min = 100;//Initial value
            if (Counter == NumberOfProcess) // total no of process = completed process loop will be terminated
            {
                break;
            }
         //--------------------------------------
            int i = 1;
            while (i < NumberOfProcess) {

                // If i process arrival time <= system time and its flag=false  and priority<min 
                // That process will be executed first 
                if ((Arrival[i] <= starttime) && (finishCheck[i] == false) && (priority[i] < min)) {
                    min = priority[i];
                    c = i;
                }
                i++;
            }
             //--------------------------------------
            // If c==n means c value can not updated because no process arrival time< system time so we increase the system time
            if (c == NumberOfProcess) {
                starttime++;
            } else {
                terminationtime[c] = starttime + Bursut[c];
                starttime += Bursut[c];
                turnaroundtime[c] = terminationtime[c] - Arrival[c];
                WaittingTime[c] = (int) (turnaroundtime[c] - Bursut[c]);
                finishCheck[c] = true;
                ID_process[Counter] = c;
                Counter++;
                responsetime[c] = (int) (turnaroundtime[c] - Bursut[c]);
            }
        }

         //print info of Priority 
        print(ID_process);
    }//GEN-LAST:event_PriorityActionPerformed

    private void SJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SJFActionPerformed

        boolean[] finishCheck = new boolean[NumberOfProcess];  // check process if complete or not 
        int starttime = 0;  //start time 
        int Counter = 1; // count 
        for (int i = 1; i < NumberOfProcess; i++) { // set a default value>>  all process are not finished
            finishCheck[i] = false;
        }
        //-----------------------------
        while (true) {
            int c = NumberOfProcess;
            int min_Val = 100;//Initial value
            if (Counter == NumberOfProcess) // total no of process = completed process loop will be terminated
            {
                break;
            }
        //-----------------------------
            int i = 1;
            while (i < NumberOfProcess) {

                // If i process arrival time <= system time and its flag=false  and burst<min  
                //then  That process will be executed first
                if ((Arrival[i] <= starttime) && (finishCheck[i] == false) && (Bursut[i] < min_Val)) {
                    min_Val = Bursut[i];
                    c = i;
                }
                i++;
            }
            // If c==n means c value can not updated >> no process arrival time< system time so we increase the system time
            if (c == NumberOfProcess) {
                starttime++;
            } else {
                terminationtime[c] = starttime + Bursut[c];
                starttime += Bursut[c];
                turnaroundtime[c] = terminationtime[c] - Arrival[c];
                WaittingTime[c] = (int) (turnaroundtime[c] - Bursut[c]);
                finishCheck[c] = true;
                ID_process[Counter] = c;
                Counter++;
                responsetime[c] = (int) (turnaroundtime[c] - Bursut[c]);
            }
        }
        // print info of SJF 
        print(ID_process);

    }//GEN-LAST:event_SJFActionPerformed

    private static void Read_From_file() throws FileNotFoundException {
        File inputfile = new File("input.txt");
        Scanner input = new Scanner(inputfile);
        if (inputfile.exists()) {
            NumberOfProcess = input.nextInt(); //Number of  process 
            NumberOfProcess++;
            Bursut = new int[NumberOfProcess];
            Arrival = new int[NumberOfProcess];
            priority = new int[NumberOfProcess];
//-------------------------------------------------------------------
            WaittingTime = new float[NumberOfProcess];
            turnaroundtime = new float[NumberOfProcess];
            terminationtime = new int[NumberOfProcess];
            responsetime = new int[NumberOfProcess];
            ID_process = new int[NumberOfProcess];
            for (int i = 1; i < NumberOfProcess; i++) {
                ID_process[i] = i;
            }
            while (input.hasNext()) {
                String commend = input.next();
                if (commend.equalsIgnoreCase("BurstTime")) {
                    for (int i = 1; i < NumberOfProcess; i++) {
                        Bursut[i] = input.nextInt();
                    }
                } else if (commend.equalsIgnoreCase("Priority")) {
                    for (int i = 1; i < NumberOfProcess; i++) {
                        priority[i] = input.nextInt();
                    }
                } else if (commend.equalsIgnoreCase("ArrivalTime")) {
                    for (int i = 1; i < NumberOfProcess; i++) {
                        Arrival[i] = input.nextInt();
                    }
                } else {
                    break;
                }

            }
        }
    }
    //these is  method used to print 
    private void print(int[] pid) {

        int index = 0;
        r1.setText("");
        for (int k = 1; k < NumberOfProcess; k++) {
            index = pid[k];

            r1.append(index + "\t     " + Bursut[index] + "\t\t" + WaittingTime[index] +
                    "\t\t" + turnaroundtime[index] + "\t\t   " + terminationtime[index] + 
                    "\t\t" + responsetime[index] + "\n");
            r1.append("\n");

        }
        //--------------------------------------------------------------------------------------------------------------------------------
        //output             

        r2.setText("");
        for (int j = 1; j < NumberOfProcess; j++) {
            index = pid[j];
            r2.append("P" + index + "  start at  " + (terminationtime[index] - Bursut[index]) + 
                    "  end at   " + terminationtime[index] + "\n");
            r2.append(" \n");
        }
    }
    public static void main(String args[]) {
        try {
            Read_From_file();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton FCFS;
    private javax.swing.JTextPane Output;
    private javax.swing.JToggleButton Priority;
    private javax.swing.JToggleButton SJF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JTextArea r1;
    private javax.swing.JTextArea r2;
    private javax.swing.JPanel result;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
