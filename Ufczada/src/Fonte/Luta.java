package Fonte;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
        public void setDesafiado(Lutador desafiado){
            this.desafiado=desafiado;
        }
        public Lutador getDesafiado(){
            return desafiado;
        }
        
        public void setDesafiante(Lutador desafiante){
            this.desafiante=desafiante;
        }
        public Lutador getDesafiante(){
            return desafiante;
        }
        
        public void setRounds(int rounds){
            this.rounds=rounds;
        }
        public int getRounds(){
            return rounds;
        }
        
        public void setAprovada(boolean aprovada){
            this.aprovada=aprovada;
        }
        public boolean getAprovada(){
            return aprovada;
        }
    
    
        public void marcarLuta(Lutador desafiado,Lutador desafiante){
            if(desafiante.getCategoria().equals(desafiado.getCategoria())){
            //if(desafiante.getCategoria()==desafiado.getCategoria()){
                this.setAprovada(true);
                this.setDesafiado(desafiado);
                this.setDesafiante(desafiante);
                System.out.println("Luta Marcada");
            }else{
                this.setAprovada(false);
                System.out.println("Luta não marcada!");
            }
        }
    
    public void lutar(){
        if(this.getAprovada()){
            
            this.desafiado.Apresentar();
            this.desafiante.Apresentar();
            
            Random aleatorio= new Random();
            int randomico = aleatorio.nextInt(3);
            
            switch(randomico){
                
                case 0: //empate
                    System.out.println("\nempate!");
                    this.desafiado.EmpatarLuta();
                    this.desafiante.EmpatarLuta();
                break;
                
                case 1: //desafiado vence
                    System.out.println("O "+ this.desafiado.getNome()+ "\nvenceu a luta sobre o"+this.desafiante.getNome());
                    this.desafiado.GanharLuta();
                    this.desafiante.PerderLuta();
                break;
                
                case 2: //desafiante vence
                    System.out.println("O "+ this.desafiante.getNome()+ " \nvenceu a luta sobre o "+this.desafiado.getNome());
                    this.desafiante.GanharLuta();
                    this.desafiado.PerderLuta();
                break;
            }
            
        }else{
            System.out.println("luta não pode acontecer!!!");
        }
        
        
    }
}
