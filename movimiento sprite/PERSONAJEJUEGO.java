private Dialogo dialogo;
	private Mercader mercader;
	private Mercado mercado;
	private Board board;
	private Inventario inventario;
	private Marco marco;
	private Movimiento movimientos;
	
	private final int CRAFT_SIZE = 20;
	
	
	 	private int dx;
	    private int dy;
	    private int x;
	    private int y;
	    
	    private int width;
		private int height;
		
		private boolean left;
		private boolean right;
		private boolean jumping;
		private boolean falling;
		
		
		private boolean facingLeft;
	  
	  private boolean inventarios;
	  
	  
	/*
	private String craft = "/imagenes/guerrerotop.gif";
	private String craft2 = "/imagenes/guerreroderecha.gif";
	private String craft3 = "/imagenes/guerreroabajo.gif";
	private String craft4 = "/imagenes/guerreroizquierda.gif";
	private String craft5 = "/imagenes/guerrerotop.gif";
	

    private Image image;
    private Image image2;
    private Image image3;
    private Image image4;
    private Image image5;
    private Image image6;
 
    */
    private BufferedImage[] andando;
  
    public Personaje() {
    	width = 22;
		height = 22;
    	
    	try{
    		
    		andando = new BufferedImage[5];
    		
    		BufferedImage imagen = ImageIO.read(new File("/imagenes/andandoabajo.gif"));
    		
    		for(int i = 0; i<andando.length; i++){
    			
    			andando[i] = imagen.getSubimage(i*width +i, 0, width, height);
    		}
    		
    	}
    	catch(Exception e) {
			e.printStackTrace();
		}
    	
    	movimientos = new Movimiento();
		facingLeft = false;
    	/*
    	ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
    	ImageIcon i4 = new ImageIcon(this.getClass().getResource(craft4));
    	ImageIcon i3 = new ImageIcon(this.getClass().getResource(craft3));
    	ImageIcon i2 = new ImageIcon(this.getClass().getResource(craft2));
        ImageIcon i5 = new ImageIcon(this.getClass().getResource(craft5));
        
        
       
        image2 = i2.getImage();
        image3 = i3.getImage();
        image4 = i4.getImage();
        image5 = i5.getImage();
     
      image = ii.getImage();
     */
       
    }
    
    public void setx(int i){
    	   
    	  x = i;
       }
       public void sety(int i){
        
        y = i;
       
    }
    
    
    public void setLeft(boolean b) { left = b; }
   	public void setRight(boolean b) { right = b; }
       
       
       
       
    public void update(){
    	
    	if(dx == -1 ){
    		
    		movimientos.setFrames(andando);
    		movimientos.setDelay(100);
    		
    	}
    	if(dx < 0) {
			facingLeft = true;
		}
		if(dx > 0) {
			facingLeft = false;
		}
    }
    
    
    public void move() {
    	
    	
        x += dx;
        y += dy;
       
    }

    public int getX() {
        return x;
    }
  
   

    public int getY() {
        return y;
    }
    
    public int Izquierda(){
    	
    	x = x +1;
    	
    return x ;	
    
    }
  
    public int Derecha(){
    	
    	x = x -1;
    	return x;
    }
    
    
    public int Abajo(){
    	
    	y = y+1;
    	
    	return y;
    	
    	
    }
    
    public int Arriba(){
    	
    	y = y-1;
    	
    	return y;
    	
    	
    }
    /*
    public Image getImage() {
    
    	if(dx == -1 ){
    		
    		image = image4;
    	}
    	
    	
    	if(dx == 1){

    		image = image2;

    	}


    	if(dy == 1){

    		image = image3;

    	}


    	if(dy == -1){

    		image = image5;

    	}

    	return image;
        
    }
    
   */
    
    
    

    public void keyPressed(KeyEvent e) {
    	

        int key = e.getKeyCode();
        

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
           
           
        }
        
        

        if (key == KeyEvent.VK_RIGHT) {
        	
        	
            dx = 1;
           
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
            
            
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
           
            
        	
        }
        
        	
        if (key == KeyEvent.VK_SPACE &&  x <155 &&
        y <105)
         {

        		
        		dialogo = new Dialogo();
        }

        if(key == KeyEvent.VK_I){
	
        	// creamos el objeto inventario //
        	
        	inventario= new Inventario();
        	
        	 inventarios = true;
        	

        	  
        }
         if(key == KeyEvent.VK_ESCAPE && inventarios == true){
        	inventario.setVisible(false);
         }
        
    }


        
    

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        
        

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    
    
    public void draw(Graphics2D g){
    	
    	
    }
    
    /*
    public Rectangle getBounds(){
    	 return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    	}


	*/
