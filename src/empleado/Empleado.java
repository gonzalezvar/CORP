/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author 505
 */
public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private double hrSemanales;
    private int salario;

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHrSemanales() {
        return hrSemanales;
    }

    public void setHrSemanales(double hrSemanales) {
        
        if(hrSemanales<0){   
            System.out.println("frmato invalido");
        }else{
            this.hrSemanales = hrSemanales;
        }
        
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    public int calcularSalario(double horas,int valor){
        return 1;
    }
    
    
}
