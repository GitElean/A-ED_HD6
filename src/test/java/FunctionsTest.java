

import hdt6.Functions;
import hdt6.TextReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionsTest {

    @Test
    public void test_category(){
        Functions functions = new Functions();
        assertEquals("Mueble de terraza ",functions.getCategory("Mueble de terraza |\tMesas de jardínMueble de terraza |\tSillas de jardínMueble de terraza |\tConjuntos mesas y sillas de jardínMueble de terraza |\tMesas de Ping Pong exterioresSillones de masaje |\tCojines y colchonetas de masajeSillones de masaje |\tSillones relax y sofás de masajesSillones de masaje |\tSillones de masajes avanzadosSillones de masaje |\tSofás camasBebidas |\tCerveza tibetana BarleyBebidas |\tTé friosBebidas |\tCoca cola 1 litroBebidas |\tCoca cola 2 litrosCondimentos |\tSirope de regalizCondimentos |\tEspecies Cajun del chefCondimentos |\tMezcla Gumbo del chefFrutas |\tPeras secasFrutas |\tPasasFrutas |\tManzana rojaFrutas |\tManzana verdeCarnes |\tResCarnes |\tPolloCarnes |\tCerdoCarnes |\tCamaronesCarnes |\tPescadosLácteos |\tQueso de cabraLácteos |\tQueso Manchego Lácteos |\tLeche descremadaLácteos |\tLeche deslactosadaLácteos |\tLeche entera"));
    }

    @Test
    public void test_product() {
        Functions functions = new Functions();
        assertEquals(" Mesas de jardín",functions.getProduct("Mueble de terraza | Mesas de jardín"));
    }

    @Test
    public void loadfile(){
        TextReader txtR = new TextReader();
        assertEquals(" ",txtR.readFile("src/ListadoProducto.txt"));
    }
}