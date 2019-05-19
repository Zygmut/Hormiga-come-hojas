/*
 * Clase Pieza
 */
package Lahormigacomehojas;

/**
 *
 * @author Zygmut
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Piece {

    public static final String hormigaN = "sprite/hormiga_n.png";
    public static final String hormigaS = "sprite/hormiga_s.png";
    public static final String hormigaE = "sprite/hormiga_e.png";
    public static final String hormigaO = "sprite/hormiga_o.png";
    public static final String hoja = "sprite/hoja.png";
    public static final String nada = "sprite/nada.png";

    public BufferedImage img;
    private String id;

    public Piece(String s) {
        /**
         * Corta el string por "/", coge la segunda parte y la corta por el
         * punto y devuelve la primera parte. En el caso de sprite/hormiga_n.png
         * lo que haria seria separar sprite y luego separar.png , de esta
         * manera obteniendo hormiga_n
         */
        id = s.split("/")[1].split(".png")[0];

        try {
            img = ImageIO.read(new File(s));
        } catch (IOException e) {
        }
    }

    void paintComponent(Graphics g, float x, float y) {
        g.drawImage(img, (int) x, (int) y, null);
    }

    public String getId() {
        return id;
    }
}
