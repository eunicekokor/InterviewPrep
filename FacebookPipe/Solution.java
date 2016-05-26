import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution{
  static class Pipe {
    byte[] byte_array;
    int size;
    
    public Pipe(int buf){
        byte_array = new byte[buf];
        size = buf;
    }
    
    // write method
    // only write up to size of byte array
    // array.length
  public void write(byte[] some_bytes){
        // check if writing nothing
        if (some_bytes.length == 0){
            return;
        }
        System.out.println("yay cool");
        int size_left = 0;
        int start_index = 0;
        // Calculate the amount of space we have available in byte array
        for (int j = 0; j < byte_array.length; j++){
            if (byte_array[j] == 0){
                size_left = byte_array.length - j;
                j = byte_array.length;
            }
        }
        start_index = byte_array.length - size_left;
        
        if  (size_left < some_bytes.length) {
           // byte[] written_bytes = [];
           // only write some bytes from 0 to byte_array.length
           // print out that only byte_array.length bytes were written
           for (int i = 0; i < byte_array.length; i++){
               if (byte_array[i] == 0) {
                  System.out.println(size_left);
                   byte_array[size_left] = some_bytes[i];
                   i++;
                   start_index++;
               }
           }
           
           System.out.format("Only able to writte %d bytes into Pipe", size_left); 
        }
        
        // Check if size_left >= some_bytes.length
        else if (size_left >= some_bytes.length) {
           for (int i = 0; i < byte_array.length; i++){
               if (byte_array[i] == 0) {
                 System.out.println(start_index);
                   byte_array[i] = some_bytes[i];
               }
                i++;
                start_index++;
           }
        }
        
        
    }
    
    // read method
}
  
  public static void main(String[] args){
    System.out.println("Tests");
    Pipe p = new Pipe(4);
    byte[] ar = {0x01, 0x02};
    p.write(ar);
// p.read(1 byte) => [0x01]
// p.write([0x03, 0x04])
// p.read(2 bytes) => [0x02, 0x03]
// p.write([0x05, 0x06, 0x07, 0x08]) => only 3 bytes were successfully written.
  }
}

/* 
Your previous Python content is preserved below:

class StackNode:
    def __init__(self, n, c):
        self.next = n
        self.current = c
        
node_a = StackNode(None, "a")
node_b = StackNode(node_a, "b")
node_c = StackNode(node_b, "c")

# print node_c.next.current


def reverse(some_node):
    
    if some_node is None: return
    
    head = some_node
    if some_node.next is None:
        head = some_node
        final_list.append(head)
        return
    
    reverse(head.next)
    
def main():
    first_nodes = node_c
    print "Original: "
    print first_nodes.current
    second = first_nodes.next
    while second is not None:
        print second.current
        second = second.next
        
    
    print "New :"
    global final_list
    final_list = []
    reverse(first_nodes)
    for thing in final_list:
        second_thing = thing.next
        print thing.current
        
        while second_thing is not None:
            print second_thing.current
            second_thing = second.next
    # print "New: "
    
main()
 */