package graficos;

public final class Pantalla {

	
	private final int ancho;
	private final int alto;
	
	
	public final int[] pixeles;
	
	
	//temporal//
	
	private final static int LADO_SPRITE = 32;
	private final static int MASCARA_SPRITE = LADO_SPRITE -1;
	
	
	//fin temporal //
	
	
	public Pantalla(final int ancho, final int alto){
		
		
		this.ancho = ancho; 
		this.alto = alto;
		
		pixeles = new int[ancho*alto];
		
		
	}
	
	/*
	 * limpia la pantalla en cada actualizacion
	 * "0" es el valor del color negro, de modo que la 
	 * pantalla se actualizara en negro y no en blanco
	 */
	public void limpiar(){
		
		for(int i = 0; i<pixeles.length; i++){
			
			
			pixeles[i] = 0;
			
			
		}
		
	}
	
	public void mostrar(final int compensacionX, final int compensacionY){

		for(int y= 0; y<alto; y++){

			int posiciony = y + compensacionY;
			
			if(posiciony <0 || posiciony >= alto){ // para no salirnos del mapa
				
				continue;
				
			}
			
			for (int x = 0; x<ancho; x++){

				int posicionx  = x + compensacionX;

				if(posicionx <0 || posicionx >= ancho){
					
					
					continue;
				}
						// codigo para dibujar la pantalla//
				
				
				//rellenar el array de pixeles (tempral solo un sprite) //
				
				pixeles[posicionx + posiciony * ancho] = 
				Sprite.gress.pixeles[(x&MASCARA_SPRITE) + (y&MASCARA_SPRITE) * LADO_SPRITE];
				
			}
		}


	}





}
