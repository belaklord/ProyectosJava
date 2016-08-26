package graficos;

public class Sprite {
	
	private final int lado;
	
	private int x;
	private int y;
	
	
	public int[]pixeles;
	
	private final HojaSprites hoja;
	
	// coleccion de hojas de Sprites //
	
	public static Sprite gress = new Sprite(32, 0, 0, HojaSprites.grass02);
	
	
	// fin de la coleccion //
	
	public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja){
		
		this.lado  = lado;
		pixeles = new int[lado*lado];
		
		//averiguar las coordenadas//
		
		this.x = columna*lado;
		this.y = fila*lado;
		this.hoja = hoja;
		// extraer el sprite de la hoja de sprites  utilizamos un bucle for //
		// final del video 7 explicacion//
		
		for(int i = 0; i<lado; i++){
			
			for(int j=0; j<lado; j++){
				
				
				pixeles[j+i *lado] = hoja.pixeles[(j+this.x) + (i+this.y)* hoja.obtenAncho()];
				
				
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
