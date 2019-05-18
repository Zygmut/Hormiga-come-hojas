/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public static final String hormigaN = "peces/hormiga_n.png";
    public static final String hormigaS = "peces/hormiga_s.png";
    public static final String hormigaE = "peces/hormiga_e.png";
    public static final String hormigaO = "peces/hormiga_o.png";
    public static final String hoja = "peces/hoja.png";
    public static final String nada = "peces/nada.png";

    public BufferedImage img;
    private String id;

    public Piece(String s) {
        /**
         * Corta el string por "/", coge la segunda parte y la corta por el
         * punto y devuelve la primera parte. En el caso de peces /
         * hormiga_n.png lo que haria seria separar peces y luego separar.png ,
         * de esta manera solo obtenemos el nombre del archivo
         */
        String[] aux = s.split("/");
        String[] aux2 = aux[1].split(".png");
        id = aux2[0];

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
