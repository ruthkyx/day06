package day06.day06.net;

import java.net.ServerSocket;

public class Server {
    public static final int PORT = 3000;
    public static void main(String[] args) throws Exception {
        // create a server and bind to port 3000
        System.out.printf("Listening to port %s\n", PORT);
        ServerSocket server = = new ServerSocket(PORT);

        // wait for a client connection to rrie, we are now blocked
        while (true) {
        System.out.println("Waiting for client connection");
        Socket client = server.accept();
        
        //server side of the socket. means we're connected on the input side ???
        InputStream is = client.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readline();

        line = line.toUpperCase();

        OututStream os = socket.getOutputStram();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bew = new BufferedWritter(osw);

        // add a \n (CR) to flush the line 
        bw.write(line + "\n");

        bw.flush();
        is.close();
        os.close();

        System.out.printf("Got a client connection: %d\n"), client.getLocalPort());
        }

        // server.close();
    }

    }
    
}
