class TCPListenState implements TCPState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection is now established.");
        connection.setState(new TCPEstablishedState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing listening connection...");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge. Connection is listening.");
    }
}
