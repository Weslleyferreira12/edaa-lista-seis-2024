public class Programa {
    
        public static void main(String[] args) {
    
            
            Contatos contato = new Contatos(7);  
    
            
            contato.adicionarContato("Fernando", "(31) 99433-6773");
            contato.adicionarContato("Mateus", "(31) 99194-9922");
            contato.adicionarContato("Gabriel", "(31) 99002-7711");
            contato.adicionarContato("Tiago", "(31) 99095-1116");
            contato.adicionarContato("Felipe", "(31) 99338-3134");
            contato.adicionarContato("Gabriela", "(31) 99125-4067");
            contato.adicionarContato("Brenda", "(31) 99955-9876");
            
    
            
            contato.obterContato("Tiago");
    
            
            contato.listarContatos();
        }
    }