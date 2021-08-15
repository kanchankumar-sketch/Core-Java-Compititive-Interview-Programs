package CoreJavaPractice.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class FileHadlinger {


    //create new file


    public void createNewFile(String name) {
        try {
            File myFile = new File(name);
            if (!myFile.exists()) {
                System.out.println("New File created as : " + name);
                myFile.createNewFile();
            } else {
                System.out.println("File already Exists perform another operation");
            }

        } catch (Exception e) {
            System.out.println("File Is not Created Check Problem Below");
            e.printStackTrace();
        }
    }


    // Rename File  name


    public void reName(String name, String reName) {
        try {
            File myFile = new File(name);
            if (myFile.exists()) {
                File myFile2 = new File(reName);
                myFile.renameTo(myFile2);
                System.out.println("File Renamed ::" + myFile.getName() + "   Size::" + myFile.length() + " ");
            } else {
                System.out.println("file Named not found");
            }
        } catch (Exception e) {
            System.out.println("File Cannot Renamed Check Problem bBelow");
            e.printStackTrace();
        }
    }


    //writing in file


    public void writeInFile(String name, String message) {
        File myFile = new File(name);
        FileWriter myFileWriter = null;
        try {
            myFileWriter = new FileWriter(myFile);
            myFileWriter.write(message);
            myFileWriter.close();

            System.out.println("File writen ::" + myFile.getName() + "   Size::" + myFile.length() + " ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Reading from file


    public void readFile(String name) {
        File myFile = new File(name);
        if (myFile.exists()) {
            try {
                Scanner myScanner = new Scanner(myFile);
                while (myScanner.hasNextLine()) {
                    String line = myScanner.nextLine();
                    System.out.println(line);
                }
                myScanner.close();
                 System.out.println("File Readed ::" + myFile.getName() + "   Size::" + myFile.length() + " ");
            } catch (Exception e) {
                System.out.println("File doesnot exixts");
                e.printStackTrace();
            }
        } else {
            System.out.println("File doesnot exixts");
        }
    }


    // deleting file


    public void deleteFile(String name) {
        File myObj = new File(name);
        if(myObj.exists())
        {
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
        else
        {
            System.out.println("File doesnot exixts");
        }
    }
}

public class OperationBasicOnFile {


    public static void main(String[] args) {
        FileHadlinger fileOp = new FileHadlinger();
        while (true) {
            System.out.println("Enter choice");
            System.out.println("1.Make new file \n 2.Rename file  \n  3.write in file \n  4.readFile \n 5.delete file \n 6.Exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter file name");
                    String name = sc.next();
                    fileOp.createNewFile(name);
                    break;

                case 2:
                    System.out.println("Enter file name");
                    String name1 = sc.next();
                    System.out.println("Enter file Rename");
                    String name2 = sc.next();
                    fileOp.reName(name1, name2);
                    break;


                case 3:
                    System.out.println("Enter file name");
                    String name3 = sc.next();
                    System.out.println("Enter message");
                    String message = sc.next();
                    fileOp.writeInFile(name3, message);
                    break;

                case 4:
                    System.out.println("Enter file name");
                    String name4 = sc.next();
                    fileOp.readFile(name4);
                    break;

                case 5:
                    System.out.println("Enter file name");
                    String name5 = sc.next();
                    fileOp.deleteFile(name5);
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Selection Choose again");
                    break;
            }
        }
    }
}
