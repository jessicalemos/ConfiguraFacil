/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business;

import configurafacil.Business.Fabrica.Fabrica;
import configurafacil.Business.Fabrica.GestaoEncomenda.*;
import configurafacil.Business.GestaoUtilizadores.Administrador;
import configurafacil.Business.GestaoUtilizadores.GestaoUtilizadores;
import configurafacil.Business.GestaoUtilizadores.Utilizador;
import configurafacil.Business.Stand.Cliente;
import configurafacil.Business.Stand.Stand;
import configurafacil.Database.ComponenteDAO;
import configurafacil.Database.PacoteDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Grupo 30
 */
public class ConfiguraFacil {
    
    //Variáveis de instância
    private Administrador administrador;
    private Stand stand;
    private Fabrica fabrica;
    private Utilizador utilizador;
    private GestaoUtilizadores gestaoU;
    private GestaoEncomenda gestaoE;
    private ComponenteDAO componentes;
    private PacoteDAO pacotes;
    
    /**
     * Construtor da classe ConfiguraFacil sem parâmetros.
     */
    public ConfiguraFacil(){
        this.stand = new Stand();
        this.fabrica = new Fabrica();
        this.utilizador = null;
        this.administrador = new Administrador();
        this.gestaoU = new GestaoUtilizadores();
        this.gestaoE = new GestaoEncomenda();
        this.componentes = new ComponenteDAO();
        this.pacotes = new PacoteDAO();
    }

    /**
     * Devolve as componentes existente na aplicação.
     * @return Map
     */
    public Map<String,Componente> getComponentes(){
        return this.componentes.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    /**
     * Devolve os pacotes existentes na aplicação.
     * @return Map
     */
    public Map<String,Pacote> getPacote(){
        return this.pacotes.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    /**
     * Devolve uma das componentes da aplicação.
     * @param nome Nome da componente
     * @return Componente
     */
    public Componente getComponente(String nome){
        return this.componentes.get(nome);
    }
    
    /**
     * Devolve um dos pacotes da aplicação.
     * @param nome Nome do pacote
     * @return Pacote
     */
    public Pacote getPacote(String nome){
        return this.pacotes.get(nome);
    }
    
    /**
     * Devolve o stand da aplicação.
     * @return Stand
     */
    public Stand getStand(){
        return this.stand;
    }
    
    /**
     * Devolve um cliente da aplicação com dado nif.
     * @param nif Nif do cliente
     * @return Cliente
     */
    public Cliente getCliente(String nif){
        return this.stand.getCliente(nif);
    }
    
    /**
     * Devolve a fabrica da aplicação.
     * @return Fabrica
     */
    public Fabrica getFabrica(){
        return this.fabrica;
    }
    
    /**
     * Devolve o adminstrador da aplicação.
     * @return Administrador
     */
    public Administrador getAdministrador(){
        return this.administrador;
    }
    
    /**
     * Devolve o utilizador da aplicação.
     * @return Utilizador
     */
    public Utilizador getUtilizador(){
        return this.utilizador;
    }
    /**
     * Devolve o utilizador da aplicação com dado nome.
     * @param nome Nome do utilizador
     * @return Utilizador
     */
    public Utilizador getUser(String nome){
        return this.gestaoU.getUtilizador(nome);
    }

    /**
     * Devolve a gestão de utilizadores.
     * @return GestaoU
     */    
    public GestaoUtilizadores getGestaoU(){
        return this.gestaoU;
    }

     /**
     * Devolve a gestão de encomendas.
     * @return GestaoE
     */   
    public GestaoEncomenda getGestaoE(){
        return this.gestaoE;
    }
    
    /**
     * Devolve os utilizadores da aplicação.
     * @return Map
     */
    public Map<String,Utilizador> getUtilizadores(){
        return this.gestaoU.getUtilizadores();
    }

    /**
     * Devolve as componentes existente na aplicação. 
     * @param u Utilizador
     * @param estado Estado a alterar
     * @return Map
     */    
    public void setEstado(Utilizador u, int estado){
        this.gestaoU.setEstado(u, estado);
    }

    /**
     * Adiciona uma componente.
     * @param c Componente a adicionar
     * @return Map
     */    
    public void addComponente(Componente c){
        this.componentes.put(c.getNome(),c);
    }

    /**
     * Devolve as componentes existente na aplicação.
     * @param p Pacote a adicionar
     * @return Map
     */    
    public void addPacote(Pacote p){
        this.pacotes.put(p.getNome(),p);
    }

    /**
     * Adiciona um utilizador.
     * @param u Utilizador
     */    
    public void addUtilizador(Utilizador u) {
        this.gestaoU.addUtilizador(u);
    }

    /**
     * Verifica se é um utilizador.
     * @param nome Nome a verificar
     * @return Se existe ou não
     */      
    public boolean verificaUserName(String nome){
        return this.gestaoU.verificaUserName(nome);
    }

    /**
     * Verifica se todas as componentes básicas obrigatórias foram escolhidas.
     * @param e Encomenda
     * @return Boolean
     */
    public boolean verificaComponentes(Encomenda e){
        return e.verificaComponentes(this.componentes);
    }
    
    /**
     * Devolve uma componente de um determinado tipo na encomenda.
     * @param tipo Tipo da componente
     * @param e Encomenda
     * @return Componente
     */
    public Componente verificaTipo(String tipo, Encomenda e){
       return e.verificaTipo(tipo,this.componentes);
    }
    
    /**
     * Devolve a lista de todas as componentes obrigatórias não selecionadas.
     * @param e Encomenda
     * @return lista dos componentes obrigatórias
     */
    public List<String> verificaObrigatoria(Encomenda e){
        return e.verificaObrigatoria(this.componentes);
    }
    /*
     public List<String> verificaIncomp(Encomenda e, Componente c, Pacote p){
         return this.gestaoE.verificaIncomp(e,c,p);
     }
     
    public void addToConfiguracao(Encomenda e, String c){
         this.gestaoE.addToConfiguracao(e,c);
    }
     
     public List<String> verificaObrig(Encomenda e, Componente c){
        return this.gestaoE.verificaObrig(e, c);
    }*/
    /**
     * Devolve a lista de componentes incompativeis na encomenda com um pacote.
     * @param p Pacote
     * @param e Encomenda
     * @return Se existe ou não
     */
    public List<String> verificaIncompativel(Pacote p, Encomenda e){
        return e.verificaIncompativel(p, this.componentes);
    }
    
    /**
     * Verifica se existe stock de uma determinada componente.
     * @param s Nome da componente
     * @return Se existe ou não
     */
    public int verificaStock(String s){
        return this.fabrica.verificaStock(s);
    } 
    
    /**
     * Devolve uma determinada encomenda.
     * @param id Identificador da encomenda
     * @return Encomenda
     */
    public Encomenda getEncomenda(int id){
        return this.gestaoE.getEncomenda(id);
    }
    
    public String getPacote(Encomenda e){
        return this.gestaoE.getPacote(e);
    }
    
    /**
     * Devolve todas as encomendas na aplicação.
     * @return Map
     */
    public Map<Integer,Encomenda> getEncomendas(){
        return this.gestaoE.getEncomendas();
    }
    
    /**
     * Atualiza o stock de uma determinada componente.
     * @param s Nome da componente
     * @param q Quantidade da componente
     */
    public void atualizaStock(String s, int q){
        this.fabrica.atualizaStock(s,q);
    }
    /*
    public void setCliente(Encomenda e,String cliente){
        e.setCliente(cliente);
    }*/

    /**
     * Altera o estado de uma determinada encomenda.
     * @param e Encomenda
     * @param estado Estado da encomenda
     */    
    public void alterarEstado(Encomenda e, int estado){
        this.gestaoE.alterarEstado(e, estado);
    }

    /**
     * Inicia sessão de um utilizador.
     * @param nome Nome do utilizador
     * @param password Password do utilizador
     */     
    public void login(String nome, String password){
        try{
            if(!nome.equals("Admin")) this.utilizador = this.gestaoU.verificaUtilizador(nome, password);
            else this.administrador = this.administrador.verificaAdmin(nome,password);
        }
        catch(Exception e){}
    }

    /**
     * Termina sessão de um utilizador.
     */  
    public void logout(){
        this.utilizador = null;
    }

    /**
     * Constroi uma string com a lista de componentes.
     * @param componentes Lista dos nomes das componentes a listar
     * @return string com as componentes
     */  
    public String listaComponentes(List<String> componentes){
        StringBuilder sb = new StringBuilder();
        for (String i : componentes){
            sb.append(i);
            sb.append("; ");
        }
        return sb.toString();
    }
    
    public Encomenda sugestao2(double limite){
        Encomenda e = new Encomenda();
        Pacote pacote = null;
        double valor = 0;
        double v;
        double max = 0;
  
        for(Pacote p: this.pacotes.values()){
            v = p.getPreco();
            if(valor+v<= limite && max<v){
                pacote = p;
                max = v;
            }
        }
        if(pacote!=null){
             e.setPacote(pacote.getNome());
            valor+=pacote.getPreco();
        }
        List<Componente> cl = new ArrayList<>();       
        if(valor<limite){
            for(Componente c : this.componentes.values()){
                boolean b = !c.getTipo().equals("Motor") && !c.getTipo().equals("Pintura") && 
                 !c.getTipo().equals("Pneu") && !c.getTipo().equals("Jante") && !c.getTipo().equals("Pacote"); 
                if(b) cl.add(c);
            }
             Collections.sort(cl, new ComponenteComparator());
             for(Componente cp: cl){
                 v = cp.getPreco();
                 if(valor + v <= limite && e.verificaIncomp(cp, pacote).isEmpty() && e.verificaObrig(cp).isEmpty() && e.verificaTipo(cp.getTipo(), componentes)==null){
                    valor+=v;
                    e.addToConfiguracao(cp.getNome());
                }
                 else if(!e.verificaObrig(cp).isEmpty()){
                     for(String s : e.verificaObrig(cp)){
                        Componente componente = this.componentes.get(s);
                        v = componente.getPreco();
                        boolean b = !componente.getTipo().equals("Motor") && !componente.getTipo().equals("Pintura") && 
                                    !componente.getTipo().equals("Pneu") && !componente.getTipo().equals("Jante"); 
                        if(v+valor+cp.getPreco()<= limite && b && e.verificaTipo(cp.getTipo(), componentes)==null){
                            valor+=cp.getPreco();
                            e.addToConfiguracao(cp.getNome());
                            valor+=v;
                            e.addToConfiguracao(cp.getNome());
                        }
                     }
                 }
             }
        }
        return e;
    }
    /**
     * Devolve uma encomenda constituída por componentes não obrigatorias dado um limite máximo a gastar.
     * @param limite Limite máximo a gastar na configuração
     * @return Encomenda
     */  
    public Encomenda sugestao(double limite){
        Encomenda e = new Encomenda();
        double valor = 0;
        if(limite >= 1800 && limite <2700) {
            Pacote p = this.pacotes.get("Pacote Comfort");
            valor = p.getPreco();
            e.setPacote(p.getNome());
            for(Componente c : this.componentes.values()){
                boolean b = !c.getTipo().equals("Motor") && !c.getTipo().equals("Pintura") && 
                        !c.getTipo().equals("Pneu") && !c.getTipo().equals("Jante");
                double v = c.getPreco();
                if(!c.getTipo().equals("Pacote") && b && valor + v <= limite && e.verificaIncomp(c,p).isEmpty()){
                    e.addToConfiguracao(c.getNome());
                    valor += v;
                }
            }   
        }
        else {
            if (limite >= 2700) {
                double max = 0;
                Componente comp = null;
                Pacote p = this.pacotes.get("Pacote Sport");
                valor = p.getPreco();
                e.setPacote(p.getNome());
                for(Componente c : this.componentes.values()){
                    boolean b = !c.getTipo().equals("Motor") && !c.getTipo().equals("Pintura") && 
                        !c.getTipo().equals("Pneu") && !c.getTipo().equals("Jante");
                    double v = c.getPreco();
                    if(!c.getTipo().equals("Pacote") && b && valor + v <= limite && e.verificaIncomp(c,p).isEmpty()){
                        if(c.getTipo().equals("Estofo")){
                            if(max < v){
                                max = v;
                                if (comp == null){
                                    e.addToConfiguracao(c.getNome());
                                    comp = c;
                                    valor += v;
                                }
                                else {
                                    e.removeDaConfiguracao(comp.getNome());
                                    e.addToConfiguracao(c.getNome());
                                    valor -= comp.getPreco();
                                    valor += v;
                                    comp = c;
                                }
                            }
                        }  
                        else {
                            valor += v;
                            e.addToConfiguracao(c.getNome());
                        }
                    }
                }
            }
            else {
                for(Componente c : this.componentes.values()){
                    boolean b = !c.getTipo().equals("Motor") && !c.getTipo().equals("Pintura") && 
                        !c.getTipo().equals("Pneu") && !c.getTipo().equals("Jante");
                    double v = c.getPreco();
                    if(!c.getTipo().equals("Pacote") && b && valor + v <= limite && e.verificaIncomp(c,null).isEmpty()){
                       e.addToConfiguracao(c.getNome());
                       valor += v;
                    }
                }
            }
        }
        return e;
    }
    
    /**
     * Atualiza o stock quando uma encomenda é colocada em execução.
     * @param config Lista do nome das componentes a diminuir o stock
     */  
    public void diminuiStock(List<String> config){        
        for(String s : config){
            int qt = fabrica.getStock().get(s).getQuantidade();
            fabrica.atualizaStock(s, qt-1);
        }
    }
}
