# -*- coding: utf-8 -*-

from openerp import models, fields, api, _
from openerp.osv import fields,osv
from openerp.osv.fields import related
from datetime import  datetime
from dateutil.relativedelta import relativedelta
from matplotlib.mathtext import Char
from datetime import timedelta
from datetime import time
from datetime import datetime
from _ast import Store
from cups import require




#Modelo del libro en general, todos los datos referentes al libro
 
class biblioteca_libro(osv.osv):
    _name = 'biblioteca.libro'
    _description = 'biblioteca'
    
   
    
    _columns = {
                
            
    #'libros_id': fields.many2one('tipo.libro', string="tipo de libro",
     #                           required=True, select=True,                    RELACION MUCHOS A UNO 
      #                          help='Tipo de libro', store=True ),
      
      
                #RELACION MUCHOS A MUCHOS CON LA TABLA TIPO.LIBRO
      
    'tipos_id': fields.many2many('tipo.libro', 'tipo_libro_rel', id1='libro_id', id2='tipo_id', string="tipo de libro"),
    
    'prestamo_id': fields.many2one('prestamo.libro', string="prestamo de libro",required=False, select=True, store=True),
      
      
    
    'name':fields.char('nombre', size=64, required=False, readonly=False),
    'description': fields.text('Description'), 
    'date': fields.date('fecha publicacion'),
    'autor':fields.char('autor', size=64, required=False, readonly=False),
    'cantidad':fields.integer('numero de libros disponibles', required=True, store=True),
    

            
                    }
    
    _defaults = {  
        'prestamo_id': "no hay prestamos"
        }
    
    @api.onchange('prestamo_id') # indicamos los campos que van  a cambiar
    
    def _onchange_edad(self):
        
        self.cantidad = self.cantidad -1
        
        
    

#Modelo de los libros en general, todos los datos referentes a los tipos de libros


class tipo_libro(osv.osv):
    
    _name="tipo.libro"
    _description = 'tipo de libro'
    
    
    
    _columns = {
                
    'name': fields.char('Genero', size=64, readonly=False),
    
    
            #RELACION MUCHOS A MUCHOS CON LA TABLA BIBLIOTECA.LIBRO
    
    'tipo_id': fields.many2many('biblioteca.libro', id1="tipo_id", id2="libro_id", string="tipo de libro")

  }
    
    #prestamos de los libros, enlazando con el cliente ye l libro
    
    
class prestamos( osv.osv):
    
    _name="prestamo.libro"
    _description = 'prestamos de libros'
    
   
    _columns = {
                
                
            'name':fields.char('prestamo',required=False),
            
                             #  ID del modelo cliente es decir una relacion many2one al nombre del cliente 
          
            'cliente_id': fields.many2one('cliente.libro',string="nombre del cliente", required=True, select=True,
                                help='Tipo de libro', store=True),
    
            
             
             
             
            'fecha_prestamo': fields.date('Fecha de entrega', required=True),
            'devolucion': fields.date('Fecha de devolucion' ,required=True),
           
            
            
                    }
    
    
 
        
    
    
 

    
    
    #modelo del cliente, todos los datos del cliente
    
class cliente (osv.osv):
    
    _name="cliente.libro"
    _description = 'clientes'
    
    
    
    _columns = {
                
            
            'name': fields.char('nombre', size=65, required=True, readonly=False),
            'apellidos': fields.char('apellidos', size=65, required=False, readonly=False),
            'fecha_nacimiento': fields.date('fecha_defecto'),
            'edad': fields.char('edad')
            

            
            
                    }
    
    _defaults = {
                 
        # valores por defecto en los campos que queramos en este caso la fecha, para que no nos de error
        
        'fecha_nacimiento': datetime.now()
        
          
        }
    
    
    @api.onchange('fecha_nacimiento') # indicamos los campos que van  a cambiar
    
    def _onchange_edad(self):
        
     
     
        fecha_ingresada = self.fecha_nacimiento #almacenamos el campo fecha de nacimiento

                
        d = fecha_ingresada.split('-') #separamos por guión

        fecha_a_calcular = datetime.strptime(d[0] + d[1] + d[2],'%Y%m%d').date() #calculo de la fecha
      
        
        total = datetime.now().date() - fecha_a_calcular #resta entre una fecha y otra
        
        self.edad = total.days / 365  #devolucion del campo edad formateado como fecha
        

    
    
    

    
    