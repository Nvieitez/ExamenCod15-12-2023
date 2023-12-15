package adivinanúmero_cod;

import java.util.Random;

public class Datos {
    
// Declaración de los datos
    
    /**
     * Número generado para adivinar
     */
    private double NúmeroAleatorio;
    
    /**
     * Número introducido por el usuario
     */
    private double NúmeroPropuesto;
    
    /**
     * Intentos máximos
     */
    private double IntentosMáximos;
    
    /**
     * Los intentos que el usuario lleva
     */
    private double ContadorIntentos;
    
    /**
     * Número de aciertos en una partida
     */
    private double Puntuación;
            
    /**
     * Nombre del jugador
     */
    private String Alias;
    
    /**
     * Record
     */
    private double Record;
    
    /**
     * Rondas que llevas en una partida
     */
    private double Rondas;
    
    /**
     * Ronda acual
     */
    private double RondaActual;
    

// Creación del Singleton
    
    /**
     * Creamos el contructor privado
     */
    private Datos(){
        
    }
    
    /**
     * Creamos la instancia
     */
    private static Datos Instancia = null;
    
    /**
     * Creamos el método de acceso al bucle y al singleton
     * @return 
     */
    public static Datos GetInstancia(){
        if (Instancia == null){
            Instancia = new Datos();
        }
        return Instancia;
    }
    
// Creación del objeto
    
    /**
     * Creamos el objeto
     */
    Datos MiInstancia = Datos.GetInstancia();
    
    Random Random = new Random();
    
// Métodos de acceso (Get,Set)
    
    /**
     * Da el valor al número a adivinar
     * @param Na NúmeroAleatorio: Número generado para adivinar
     * @return NúmeroAleatorio
     */
    public double SetNúmeroAleatorio (double Na){
        NúmeroAleatorio = Na;
        NúmeroAleatorio = Random.nextDouble();
        return NúmeroAleatorio;        
    }
    
    /**
     * Da el valor del número propuesto por el usuario
     * @param Np NúmeroPropuesto: Número introducido por el usuario
     * @return NúmeroPropuesto
     */
    public double SetNúmeroPropuesto (double Np){
        NúmeroPropuesto = Np;
        return Np;
    }
    
    /**
     * Da el valor de intentos máximos
     * @param Im IntentosMáximos: Intentos Máximos 
     * @return IntentosMáximos
     */
     public double setIntentosMáximos (double Im){
        IntentosMáximos = Im;
        return IntentosMáximos;
    }
     
    /**
     * Da el valor de los intentos que lleva el usuario
     * @param Ci Contador Intentos: Intentos que el usuario lleva
     * @return ContadorIntentos
     */
    public double SetContadorIntentos (double Ci){
        ContadorIntentos = Ci;
        return ContadorIntentos;
    }
    
    /**
     * Da el valor de la puntuación del jugador
     * @param P Puntuación: Número de aciertos en una partida
     * @return Puntuación
     */
    public double SetPuntuación (double P){
        Puntuación = P;
        return P;
    }
    
    /**
     * Da el valor del Alias del jugador
     * @param A Alias: Nombre del jugador
     * @return Alias
     */
    public String SetAlias (String A){
        Alias = A;
        return A;
    }
  
    /**
     * Da el valor del record
     * @param R Record: Marca el record del jugador con más puntuación
     * @return Record
     */
    public double GetRecord (double R){
        Record = R;
        return Record;
    }
    
    /**
     * Da el valor de las rondas máximas
     * @param Ro Rondas: Rondas que llevas en una partida
     * @return Rondas
     */
    public double SetRondas (double Ro){
        Rondas = Ro;
        return Rondas;
    }
    
    /**
     * Da el valor de la ronda actual
     * @param Ra RondaActual: Ronda en la que estás
     * @return RondaActual
     */
    public double SetRondaAcutal (double Ra){
        RondaActual = Ra;
        return RondaActual;
    }   
    
// Métodos de acceso
    
    
}
