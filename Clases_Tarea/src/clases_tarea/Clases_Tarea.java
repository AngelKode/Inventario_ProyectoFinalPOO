/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_tarea;
import lista_clases.Almohada;
import lista_clases.Audifonos;
import lista_clases.Aves;
import lista_clases.Bicicleta;
import lista_clases.Bocinas;
import lista_clases.Carro;
import lista_clases.Casa;
import lista_clases.Cuaderno;
import lista_clases.Estudiante;
import lista_clases.Gato;
import lista_clases.Liquido;
import lista_clases.Mochila;
import lista_clases.Pantalon;
import lista_clases.Pared;
import lista_clases.Playera;
import lista_clases.Pluma;
import lista_clases.Procesador;
import lista_clases.Shampoo;
import lista_clases.Sombrero;
import lista_clases.Television;

/**
 *
 * @author depot
 */
public class Clases_Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PROBANDO EL OBJETO ALMOHADA
        Almohada _almohada = new Almohada("Sognare", "Algodon", "Alta", 40);
        _almohada.marca = "Spring";
        _almohada.material = "Tela";
        _almohada.suavidad = "Media";
        _almohada.peso = 70;
        
        //PROBANDO LA CLASE AUDIFONOS
        Audifonos _audifonos = new Audifonos("Sony", "Buena","MDR-105", 50.0, 1.8);
        _audifonos.marca = "Pioneer";
        _audifonos.calidad_sonido = "Excelente";
        _audifonos.nombre = "Hdj 500";
        _audifonos.peso = 70.6;
        _audifonos.longitud = 0.9;
        
        //PROBANDO LA CLASE AVES
        Aves _aves = new Aves(6.5, 40.0, "Blanco", "Paloma");
        _aves.peso = 10.0;
        _aves.altura = 25.0;
        _aves.color = "Negro";
        _aves.raza = "Cuervo";
        
        //PROBANDO LA CLASE BICICLETA
        Bicicleta _bicicleta = new Bicicleta("Yamaha", "Buenos", "Acero", 10.0);
        _bicicleta.marca = "Suzuki";
        _bicicleta.frenos = "Regulares";
        _bicicleta.material = "Titanio";
        _bicicleta.peso = 14;
        
        //PROBANDO LA CLASE BOCINAS
        Bocinas _bocina = new Bocinas("Sony", "Fuerte", "20-20,000",250.5);
        _bocina.marca = "Bose";
        _bocina.potencia = "Muy fuerte";
        _bocina.frecuencia = "14-23,000";
        _bocina.peso = 345.6;
        
        //PROBANDO LA CLASE CARRO
        Carro _carro = new Carro("Suzuki", "Aluminio", 1300.45, 6);
        _carro.marca = "Nissan";
        _carro.material = "Titanio";
        _carro.peso = 1267.6;
        _carro.capacidadPasajeros = 4;
        
        //PROBANDO LA CLASE CASA
        Casa _casa = new Casa("Jose", "Centro", 2, 1600000);
        _casa.propietario = "Pedro";
        _casa.lugarEstablecido = "Villas";
        _casa.cantidadPisos = 4;
        _casa.precio = 1400000;
        
        //PROBANDO CLASE CUADERNO
        Cuaderno _cuaderno = new Cuaderno(30.6, "Roble", "Scribe", 100);
        _cuaderno.peso = 45.6;
        _cuaderno.material = "Pino";
        _cuaderno.marca = "JeanBook";
        _cuaderno.cantidadHojas = 200;
        
        //PROBANDO CLASE ESTUDIANTE
        Estudiante _estudiante = new Estudiante("Roberto", "Hombre", 20, 1.67);
        _estudiante.nombre = "Ernesto";
        _estudiante.sexo = "Hombre";
        _estudiante.edad = 23;
        _estudiante.altura = 1.89;
        
        //PROBANDO CLASE GATO
        Gato _gato = new Gato("Egipcio","Michi", 7.8, 1.2);
        _gato.raza = "Americano";
        _gato.nombre = "Foofy";
        _gato.peso = 9.0;
        _gato.longitud = 1.3;
        
        //PROBANDO LA CLASE LIQUIDO
        Liquido _liquido = new Liquido("Limon", 780.2, 20.0, 1.4);
        _liquido.sabor = "Fresa";
        _liquido.cantidad = 1000;
        _liquido.temperatura = 18.0;
        _liquido.densidad = 1.3;
        
        //PROBANDO LA CLASE MOCHILA
        Mochila _moch = new Mochila(200.5, "Nike", "Azul", "Tela");
        _moch.peso = 300.0;
        _moch.marca = "Adidas";
        _moch.color = "Verde";
        _moch.material_construccion = "Algodon";
        
        //PROBANDO LA CLASE PANTALON
        Pantalon _pant = new Pantalon("Algodon", "Levis", "Azul", 0.80, 270.0);
        _pant.material_construccion = "Algodon Suave";
        _pant.marca = "Samac";
        _pant.color = "Negro";
        _pant.largo = 0.87;
        _pant.peso = 290.9;
        
        //PROBANDO LA CLASE PARED
        Pared _pared = new Pared(0.30, 2.5, "Adobe");
        _pared.grueso = 0.35;
        _pared.altura = 2.4;
        _pared.material = "Ladrillo";
        
        //PROBANDO LA CLASE PLAYERA
        Playera _playera = new Playera("Algodon", "Mediana", "Blanca", 30.0);
        _playera.material = "Poliester";
        _playera.talla = "Grande";
        _playera.color = "Azul";
        _playera.peso = 35.0;
        
        //PROBANDO LA CLASE PLUMA
        Pluma _pluma = new Pluma(10.0, "Negra", "Bic", "Plastico");
        _pluma.largo = 9.3;
        _pluma.color_tinta = "Azul";
        _pluma.marca = "Paper Mate";
        _pluma.material = "Metal";
        
        //PROBANDO LA CLASE PROCESADOR
        Procesador _proces = new Procesador(4, 4, 2.5, "Intel");
        _proces.cantidad_nucleos = 6;
        _proces.cantidad_hilos = 6;
        _proces.frecuencia = 2.8;
        _proces.marca = "AMD";
        
        //PROBANDO LA CLASE SHAMPOO
        Shampoo _shamp = new Shampoo("Verde", "Menta", "Caprice", 1000);
        _shamp.color = "Amarillo";
        _shamp.olor = "Durazno";
        _shamp.marca = "Folicure";
        _shamp.cantidad = 890;
        
        //PROBANDO CLASE SOMBRERO
        Sombrero _somb = new Sombrero("Negro", "G", "Algodon", 15.0);
        _somb.color = "Azul";
        _somb.tamanio = "M";
        _somb.material = "Poliester";
        _somb.diametro = 16.9;
        
        //PROBANDO CLASE TELEVISION
        Television _tele = new Television("Sony", "Gris", 13.0, 2073600);
        _tele.marca = "Samsung";
        _tele.color = "Negra";
        _tele.peso = 20;
        _tele.cantidad_pixeles = 777600;
      }
}
