/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *
 * @author utilizador
 */
public class Stand {
    Map<String,Cliente> clientes;
    Map<String,Componente> componentes;
    
    public Stand() {
        this.clientes = new HashMap<String,Cliente>();
        this.componentes = new HashMap<String,Componente>();
    }

    public Map<String,Cliente> getClientes(){
        return this.clientes.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    public Map<String,Componente> getComponentes(){
        return this.componentes.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    public Cliente getCliente(String nif){
        return this.clientes.get(nif);
    }
    
    public Componente getComponente(String nome){
        return this.componentes.get(nome);
    }
   
   public void setCliente(String nif, Cliente c){
       this.clientes.replace(nif,c);
   }

    public void addCliente(Cliente c){
        this.clientes.put(c.getNif(),c);
    }
    
    public void addComponente(Componente c){
        this.componentes.put(c.getNome(),c);
    }
}
