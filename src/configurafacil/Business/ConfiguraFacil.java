/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author mercy
 */
public class ConfiguraFacil {
    private Stand stand;
    private Fabrica fabrica;
    private Utilizador utilizador;
    private GestaoUtilizadores gestaoU;
    
    public ConfiguraFacil(){
        this.stand = new Stand();
        this.fabrica = new Fabrica();
        this.utilizador = null;
        this.gestaoU = new GestaoUtilizadores();
        addFunc();
        addComp();
        addEnc();
        addStock();
        addPacote();
    }
    
    public void addFunc() {
        Utilizador stand = new Utilizador("João Silva",1,"joao");
        gestaoU.addUtilizador(stand);
        Utilizador fabrica = new Utilizador("Carlos Costa",2,"carlos");
        gestaoU.addUtilizador(fabrica);
        Utilizador admin = new Utilizador("Admin",0,"admin");
        gestaoU.addUtilizador(admin);
    }
    
    public void addComp() {
        //PINTURA
        Componente c1 = new Componente("Preto","Pintura",200,null, null);
        Componente c2 = new Componente("Branco","Pintura",200,null, null);
        Componente c3 = new Componente("Cinzento","Pintura",200,null, null);
        Componente c4 = new Componente("Azul","Pintura",200,null, null);
        //MOTOR
        Componente c5 = new Componente("D4 190cv Man. 6 Vel.","Motor",3500,null, null);
        Componente c6 = new Componente("D4 190cv Geatronic 8 Vel.","Motor",3700,null, null);
        Componente c7 = new Componente("D5 235cv Geatronic 8 Vel.","Motor",4200,null, null);
        c7.insereIncompativel("Bridgestone Turanza T005 205/55 R16 91V");
        //PNEU
        Componente c8 = new Componente("Bridgestone Turanza T005 205/55 R16 91V","Pneu",450,null, null);
        Componente c9 = new Componente("Continental ContiEcoContact 5 205/55 R16 91V","Pneu",450,null, null);
        Componente c10 = new Componente("Continental PremiumContact 6 205/55 R16 91H","Pneu",500,null, null);
        Componente c11 = new Componente("Firestone Roadhawk 205/55 R16 91H","Pneu",580,null, null);
        c10.insereObrigatoria("Jantes em liga leve 19'' 255/40 R19");
        //JANTE
        Componente c12 = new Componente("Jantes em liga leve 17''","Jante",270,null, null);
        Componente c13 = new Componente("Jantes em liga leve 18'' 245/45 R18","Jante",340,null, null);
        Componente c14 = new Componente("Jantes em liga leve 19'' 255/40 R19","Jante",350,null, null);
        c12.insereIncompativel("Bridgestone Turanza T005 205/55 R16 91V");
        //ESTOFOS
        Componente c15 = new Componente("Couro comfort carvão","Estofo",800, null, null);
        Componente c16 = new Componente("Couro comfort âmbar","Estofo",800, null, null);
        Componente c17 = new Componente("Couro comfort maroon brown","Estofo",800, null, null);
        Componente c18 = new Componente("Couro comfort blond","Estofo",800, null, null);
        //PARA-CHOQUES
        Componente c19 = new Componente("Pára-choques","Pára-choque",270,null, null);
        //VIDRO
        Componente c20 = new Componente("Vidro Escurecido","Vidro",200,null, null);
        //TETO
        Componente c23 = new Componente("Teto de abrir","Teto",390,null, null);
        //LUZES
        Componente c24 = new Componente("Pacotes de luz","Luzes",600, null, null);
        stand.addComponente(c1);
        stand.addComponente(c2);
        stand.addComponente(c3);
        stand.addComponente(c4);
        stand.addComponente(c5);
        stand.addComponente(c6);
        stand.addComponente(c7);
        stand.addComponente(c8);
        stand.addComponente(c9);
        stand.addComponente(c10);
        stand.addComponente(c11);
        stand.addComponente(c12);
        stand.addComponente(c13);
        stand.addComponente(c14);
        stand.addComponente(c15);
        stand.addComponente(c16);
        stand.addComponente(c17);
        stand.addComponente(c18);
        stand.addComponente(c19);
        stand.addComponente(c20);
        stand.addComponente(c23);
        stand.addComponente(c24);
       
       
    }
      
    public void addPacote() {
        ArrayList<Componente> componentes = new ArrayList<>();
        Componente c1 = new Componente("Preto","Pintura",200,null, null);
        Componente c2 = new Componente("D4 190cv Geatronic 8 Vel.","Motor",3700,null, null);
        Componente c3 = new Componente("Firestone Roadhawk 205/55 R16 91H","Pneu",580,null, null);
        Componente c4 = new Componente("Jantes em liga leve 18'' 245/45 R18","Jante",340,null, null);
        Componente c5 = new Componente("Couro comfort maroon brown","Estofo",800, null, null);
        Componente c6 = new Componente("Vidro Escurecido","Vidro",200,null, null);

        componentes.add(c1);
        componentes.add(c2);
        componentes.add(c3);
        componentes.add(c4);
        componentes.add(c5);
        componentes.add(c6);
        
        Pacote p1 = new Pacote("Pacote Comfort",300,componentes);
        Pacote p2 = new Pacote("Pacote Sport",400,null);
        stand.addPacote(p1);
        stand.addPacote(p2);
    }
    
    public void addEnc() {
        Encomenda e1 = new Encomenda(1,"BMW", 1, null,null);
        fabrica.getGestaoE().addEncomenda(e1);
        Encomenda e2 = new Encomenda(2,"Mercedes", 0, null,null);
        fabrica.getGestaoE().addEncomenda(e2);
        Encomenda e3 = new Encomenda(3,"Volvo", 1, null,null);
        fabrica.getGestaoE().addEncomenda(e3);
    }
    
    public void addStock() {
        fabrica.adicionaStock("D4 190cv Man. 6 Vel.", 45);
        fabrica.adicionaStock("Jantes em liga leve 17''", 32);
        fabrica.adicionaStock("Bridgestone Turanza T005 205/55 R16 91V", 30);
    }
    
        
    public Stand getStand(){
        return this.stand;
    }
    
    public Fabrica getFabrica(){
        return this.fabrica;
    }
    
    public Utilizador getUtilizador(){
        return this.utilizador;
    }
    
    public GestaoUtilizadores getGestaoU(){
        return this.gestaoU;
    }
    
    public void login(String nome, String password){
        try{
            this.utilizador = gestaoU.verificaUtilizador(nome, password);
        }
        catch(Exception e){}
    }
    
    public void logout(){
        this.utilizador = null;
    }
}
