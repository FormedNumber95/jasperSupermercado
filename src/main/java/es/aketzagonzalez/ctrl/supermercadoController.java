package es.aketzagonzalez.ctrl;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import es.aketzagonzalez.db.ConexionBBDD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class supermercadoController {

    @FXML
    private Button btnAgruparSecciones;

    @FXML
    private Button btnGraficoProductos;

    @FXML
    private Button btnListarProductos;

    @FXML
    private Button btnTablaProductos;

    @FXML
    void AccionAgruparSecciones(ActionEvent event) {

    }

    @FXML
    void AccionGraficoProductos(ActionEvent event) {

    }

    @FXML
    void AccionListarProductos(ActionEvent event) {
    	try {
			ConexionBBDD db=new ConexionBBDD();
			InputStream reportStream =getClass().getResourceAsStream("/jasper/ListaProductos.jasper");
			if (reportStream == null) {
                System.out.println("El archivo no esta ahí");
            }else {
                System.out.println("El archivo se ha encontrado");
            }
            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("IMAGE_PATH", db.getClass().getResource("/imagenes/").toString());
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (JRException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void AccionTablaProductos(ActionEvent event) {

    }

}
