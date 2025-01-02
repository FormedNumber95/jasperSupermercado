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

/**
 * The Class supermercadoController.
 */
public class supermercadoController {

    /** The btn agrupar secciones. */
    @FXML
    private Button btnAgruparSecciones;

    /** The btn grafico productos. */
    @FXML
    private Button btnGraficoProductos;

    /** The btn listar productos. */
    @FXML
    private Button btnListarProductos;

    /** The btn tabla productos. */
    @FXML
    private Button btnTablaProductos;

    /**
     * Accion agrupar secciones.
     *
     * @param event the event
     */
    @FXML
    void AccionAgruparSecciones(ActionEvent event) {
    	try {
			ConexionBBDD db=new ConexionBBDD();
			InputStream reportStream =getClass().getResourceAsStream("/jasper/AgruparSecciones.jasper");
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

    /**
     * Accion grafico productos.
     *
     * @param event the event
     */
    @FXML
    void AccionGraficoProductos(ActionEvent event) {
    	try {
			ConexionBBDD db=new ConexionBBDD();
			InputStream reportStream =getClass().getResourceAsStream("/jasper/GraficoProductos.jasper");
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

    /**
     * Accion listar productos.
     *
     * @param event the event
     */
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

    /**
     * Accion tabla productos.
     *
     * @param event the event
     */
    @FXML
    void AccionTablaProductos(ActionEvent event) {
    	try {
			ConexionBBDD db=new ConexionBBDD();
			InputStream reportStream =getClass().getResourceAsStream("/jasper/TablaProductos.jasper");
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

}
