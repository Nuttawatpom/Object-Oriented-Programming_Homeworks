//630510619 ณัฐวัฒน์
import java.util.Scanner;

class Message{
    private String normalMessage;
    private String secretMessage;
    
    public void getMessage(){
        Scanner input = new Scanner(System.in);
        System.out.print("input text : ");
        normalMessage = input.nextLine();
    }

    public void encode(){
        String mesEncode = new String();
        char[] partsMessage = normalMessage.toCharArray();
        int arrayLength = partsMessage.length;
        int finalArrLength = partsMessage.length; 
        if (finalArrLength%3 != 0){ 
            while (finalArrLength%3 != 0){
                finalArrLength += 1;
            }
        }
        int j = 0; 
        for (int i=0;i<arrayLength;i++){
            int asciiIndex = partsMessage[i];
            asciiIndex += 3; 
            char mes = (char)asciiIndex;
            String lowMes = Character.toString(mes); 
            String upMes = lowMes.toUpperCase(); 
            mesEncode += upMes; 
            j += 1;
            if (j == 3){ 
                mesEncode += " ";
                j = 0;
            }
        }
        int remaininglength = finalArrLength - arrayLength; 
        for (int i=0;i<remaininglength;i++){ 
            mesEncode += "#";
        }
        secretMessage = mesEncode;
    }       
    
    public void showResult(){
        System.out.print(secretMessage);
    }


}

public class Lab04_2_630510619 {
    public static void main(String[] args){
        Message mes = new Message();
        mes.getMessage();
        mes.encode();
        mes.showResult();
    }
}
