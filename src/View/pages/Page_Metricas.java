
package View.pages;

import Modelo.interfaz.ModelPieChart;
import View.Swing.PieChart;
import View.Swing.ScrollBarCustom2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;

public class Page_Metricas extends javax.swing.JPanel {

    public Page_Metricas() {
        initComponents();
        init();
    }

    private void init(){
        
        jScrollGraficas.setBorder(null);
        jScrollGraficas.getViewport().setBackground(Color.WHITE);
        jScrollGraficas.setVerticalScrollBar(new ScrollBarCustom2());
        jScrollGraficas.getVerticalScrollBar().setBackground(Color.WHITE);
        
        showLineChart();
        showHistogram();
        showBarChart();
        
        
        pieChart1.setChartType(PieChart.PeiChartType.DEFAULT);
        pieChart1.addData(new ModelPieChart("Hamburguesa", 78, new Color(23, 126, 238)));
        pieChart1.addData(new ModelPieChart("Churrasco", 45, new Color(221, 65, 65)));
        pieChart1.addData(new ModelPieChart("Ceviche", 26, new Color(47, 157, 64)));
        pieChart1.addData(new ModelPieChart("Camarones", 31, new Color(196, 151, 58)));
        
        pieChart2.setChartType(PieChart.PeiChartType.DONUT_CHART);
        pieChart2.addData(new ModelPieChart("Cóctel", 35, new Color(23, 126, 238)));
        pieChart2.addData(new ModelPieChart("Batido", 15, new Color(221, 65, 65)));
        pieChart2.addData(new ModelPieChart("Helado", 43, new Color(47, 157, 64)));
        pieChart2.addData(new ModelPieChart("Cerveza", 92, new Color(196, 151, 58)));
    }
    
    public void showLineChart(){
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(4, "Monto", "E");
        dataset.setValue(2.3, "Monto", "F");
        dataset.setValue(3.1, "Monto", "M");
        dataset.setValue(1.1, "Monto", "A");
        dataset.setValue(2.5, "Monto", "M");
        dataset.setValue(3.6, "Monto", "J");
        dataset.setValue(2.1, "Monto", "J");
        dataset.setValue(4.6, "Monto", "A");
        dataset.setValue(5, "Monto", "S");
        dataset.setValue(4.2, "Monto", "O");
        dataset.setValue(4, "Monto", "N");
//        dataset.setValue(0, "Monto", "D");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Ingresos","Mes","Monto", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
        //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }
    
    public void showHistogram(){
        
//        List<Integer> pedidosFrecuencia = Arrays.asList(10, 20, 15, 30, 25, 18, 22, 28, 35, 40, 32, 27);
//        
//        double[] values = new double[pedidosFrecuencia.size()];
//    
//        for (int i = 0; i < pedidosFrecuencia.size(); i++) {
//            values[i] = pedidosFrecuencia.get(i);
//        }
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Frecuencia de Pedidos", values, 20);
        
        JFreeChart chart = ChartFactory.createHistogram("Frecuencia de Pedidos", "Número de Pedidos", "Frecuencia", 
            dataset, PlotOrientation.VERTICAL, false, true, false);
        
        XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        panelHistogram.removeAll();
        panelHistogram.add(barpChartPanel2, BorderLayout.CENTER);
        panelHistogram.validate();
    }
    
    public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBar.removeAll();
        panelBar.add(barpChartPanel, BorderLayout.CENTER);
        panelBar.validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollGraficas = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        panelHistogram = new javax.swing.JPanel();
        panelBar = new javax.swing.JPanel();
        pieChart1 = new View.Swing.PieChart();
        pieChart2 = new View.Swing.PieChart();

        setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Metricas");

        panelLineChart.setLayout(new java.awt.BorderLayout());

        panelHistogram.setLayout(new java.awt.BorderLayout());

        panelBar.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLineChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHistogram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(pieChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHistogram, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pieChart2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollGraficas.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollGraficas)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollGraficas;
    private javax.swing.JPanel panelBar;
    private javax.swing.JPanel panelHistogram;
    private javax.swing.JPanel panelLineChart;
    private View.Swing.PieChart pieChart1;
    private View.Swing.PieChart pieChart2;
    // End of variables declaration//GEN-END:variables
}
