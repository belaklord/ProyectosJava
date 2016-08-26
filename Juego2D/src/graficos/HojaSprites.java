
/*
 * VIDEOS 6 Y 7
 */

package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * grficos del juego animaciones etc
 * 
 */
public class HojaSprites {
	
	private final int ancho;
	private final int alto;
	
	//trataremos las imagenes pixeles a pixeles para ello utilizaremos un array ///
	
	public final int [] pixeles;
	
	
	
	// coleccion de hojas de sprites //
	
	public static HojaSprites grass02 = new HojaSprites
			("/texturas/grass02.png",320,320);
	
	
	
	
	
	
	//fin de la coleccion //
	
	public HojaSprites(final String ruta,final int ancho, final int alto){
		
		this.ancho = ancho;
		this.alto = alto;
		
		
		pixeles = new int [ancho*alto];
		
		BufferedImage imagen;
		try {
			imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
			
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public int obtenAncho(){
		
		
		return ancho;
	}
	
	
	

}
