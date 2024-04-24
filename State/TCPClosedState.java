class TCPClosedState implements TCPState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection...");
        connection.setState(new TCPEstablishedState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Connection is already closed.");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge. Connection is closed.");
    }
}
