public class StatePattern {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.open();           
        connection.acknowledge();    
        connection.close();
        connection.acknowledge();    
        connection.open();           
        connection.close();        
    }
}
