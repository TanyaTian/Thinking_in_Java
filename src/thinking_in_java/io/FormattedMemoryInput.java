package thinking_in_java.io;
//: io/FormattedMemoryInput.java
import java.io.*;

public class FormattedMemoryInput {
  public static void main(String[] args)
  throws IOException {
    try {
      DataInputStream in = new DataInputStream(
        new ByteArrayInputStream(
         BufferedInputFile.read(
          "D:\\Design\\GitWorkspace\\thinking_in_java\\src\\thinking_in_java\\net\\mindview\\io\\FormattedMemoryInput.java").getBytes()));
      while(in.available() != 0)
        System.out.print((char)in.readByte());
    } catch(EOFException e) {
      System.err.println("End of stream");
    }
  }
} /* (Execute to see output) *///:~
