package observer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class Grafico implements Observer{

    private DefaultCategoryDataset dataset;
    private JFrame jFrame = new JFrame();

    public Grafico() {
        dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart("Acoes",
                "Codigos",
                "Quantidade",
                dataset, PlotOrientation.VERTICAL,
                false, true, false);

        ChartPanel panel = new ChartPanel(chart);
        jFrame.setContentPane(panel);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void update(String code, Integer qt) {
        dataset.setValue(qt,"Quantidade", code);
    }
}
