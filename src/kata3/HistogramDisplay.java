package kata3;
   
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
           ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
           chartPanel.setPreferredSize(new Dimension(500,400));
           return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(
            "",
            "Dominios", 
            "Nº email", 
            dataset, 
            PlotOrientation.VERTICAL, 
            false, 
            false, 
            false
        );
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(17,"ENE","gmail.com");
        dataset.addValue(2,"ENE","gmail.com");
        dataset.addValue(11,"ENE","gmail.com");
        dataset.addValue(10,"FEB","ulpgc.es");
        dataset.addValue(3,"ENE","ulpgc.es");
        dataset.addValue(33,"FEB","ulpgc.es");
        dataset.addValue(6,"FEB","hotmail.com");
        dataset.addValue(22,"ENE","hotmail.com");
        dataset.addValue(1,"FEB","hotmail.com");
        return dataset;
    }
    
    public void execute (){
        setVisible(true);
    }
}